package day19;
/*
 1. driver 로드 : 오라클 관련된 기능을 사용할 수 있게 만든다
 2. Connection : 오라클과 자바와 연결을 시켜준다
 	- 오라클의 위치 정보(ip, port)
 	- 오라클의 계정 정보(id, pwd)
 	
 3. PreparedStatement : 명령어를 수행하는 객체
 	- sql문을 문자열로 만들어 줘야 한다
 	
 4. ResultSet : 사용해도 되고 안해도 된다./ 결과를 받으려면 써야한다
  - 결과를 받아오는 객체
  - select를 사용하는 경우에만 이용한다.
  - 반복자 형태로 들어오게 된다.(iterator)
  
 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DB {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	//공통적으로 사용하니까 인스턴스 변수로써 사용
	
	
	public DB() {
		System.out.println("DB실행");
		//생성자(필수는 아니다)
		try {
			//드라이브 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB와 연결된 객체를 얻어온다
			//localhost = 192.168.5.104 (둘다 써도 된다)
			//port : 2byte. 65,535의 숫자로 표현된다.
			//		- 프로그램을 구분하기 위한 값
			// ip : pc의 위치를 알려주는 값
			// jdbc:oracle:thin:@localhost:1521:xe
			//					 ip		포트번호   오라클버전
			String url = "jdbc:oracle:thin:@192.168.5.104:1521:xe";
			String id ="java", pwd ="oracle";
			con = DriverManager.getConnection(url, id, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//오라클 데이터베이스와 연결하려면 
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//반드시 처음에 쓰고 시작해야 함
		
	}
	public void selectOne(String inputId) {
		// Member클래스 없이 메소드 내부에서 출력까지 완료
		
		String sql = 
				"select * from newst where id ='"+inputId+"'";
		System.out.println("sql : "+sql);
		//PreparedStatement ps = null;
		//ResultSet rs = null;
		// null 값은 기능을 사용할 수 없다
		// 객체화 필요
		try {
			//연결된 객체(con)를 이용해서 전송객체(ps)를 얻어온다
			ps = con.prepareStatement(sql);
			
			//sql문을 실행하고 rs에 저장
			rs = ps.executeQuery();
			//System.out.println(rs.next()); - true면 값이 있는 것
			if(rs.next()) {
				System.out.println("id : "+rs.getString("id"));
				System.out.println("pwd : "+rs.getString("name"));
				System.out.println("age : "+rs.getInt("age"));
			}else {
				System.out.println("조회한 정보가 없습니다");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		
	}
	
	public Member selectOne2(String inputId) {
			// Member 클래스를 받아서 메인에 출력
			String sql = 
					"select * from newst where id ='"+inputId+"'";
			System.out.println("sql : "+sql);
			//PreparedStatement ps = null;
			//ResultSet rs = null;
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					Member m = new Member();
					m.setId(rs.getString("id"));
					m.setName(rs.getString("name"));
					m.setAge(rs.getInt("age"));

					return m;
				}else {
					System.out.println("조회한 정보가 없습니다");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				dbClose();
			}
			return null;
	}
	
	public void selectAll() {
		String sql = "select * from newst";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("Name"));
				System.out.println(rs.getInt("age"));
				System.out.println("====================");
			}
			
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("Name"));
//			System.out.println(rs.getInt("age"));
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("Name"));
//			System.out.println(rs.getInt("age"));
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("Name"));
//			System.out.println(rs.getInt("age"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
	public ArrayList<Member> selectAll2() {
		String sql = "select * from newst";
		
		ArrayList<Member> arr = new ArrayList<Member>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
			Member m1 = new Member();
			m1.setId(rs.getString("id"));
			m1.setName(rs.getString("name"));
			m1.setAge(rs.getInt("age"));
			arr.add(m1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return arr;
	}
	public int delete(String inputId) {
		String sql="delete from newst where id=?";
		int result =0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId); // 첫 번쨰 물음표에 - inputId 넣으라는 뜻
			//쿼리문 완성됨
			// rs = ps.executeQuery();
			// select는 rs(ResultSet)을 사용
			// rs => ResultSet으로 결과값이 나온다
			
			result = ps.executeUpdate();
			// update, delete 등은 result를 사용(int값으로 나오니까)
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return result;
	}
	
	public int insert(String userId, String userName, int userAge) {
		int result =0;
		String sql = "insert into newst values(?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userName);
			ps.setInt(3, userAge);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("아이디가 중복됐습니다");
		}finally {
			dbClose();
		}
		
		return result;
		
	}
	public int update(Member m) {
		String sql =
				"update newst set name =?, age =? where id=?";
				//업데이트 성공 -1, 실패하면 0 또는 에러
		int result=0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, m.getName());
			ps.setInt(2, m.getAge());
			ps.setString(3, m.getId());
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		return result;
	}
	
	
	public void dbClose() {
		System.out.println("데이터베이스 닫음");
		try {
			//실행 순서의 반대로 닫아준다 
			// 닫지 않으면 자원이 남아있을 수 있다
			if(rs != null)
				rs.close();
			if(ps != null) 
				ps.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
























