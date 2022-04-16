package exe;

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
	
	public DB() {
		//DB생성자
		System.out.println("DB 실행");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java"; String pwd = "oracle";
			con = DriverManager.getConnection(url, id, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
		} catch (Exception e) {	e.printStackTrace();
		}
	}
	public Member search(String userId, String userPwd) {
		String sql = "select * from test_ex where id =?and pwd =?";
		Member m = new Member();
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userPwd);
			rs = ps.executeQuery();
			if(rs.next() ) {
				m.setId(rs.getString("id"));
				m.setPwd(rs.getString("pwd"));
				return m;
			}else {
				System.out.println("정보 없음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return null;
	}
	public void myPage(String userId) {
		String sql = "select * from test_ex where id='"+userId+"'";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("아이디 : "+rs.getString("id"));
				System.out.println("비밀번호 : "+rs.getString("pwd"));
				System.out.println("이름 : "+rs.getString("name"));
				System.out.println("나이 : "+rs.getInt("age"));
				System.out.println("주소 : "+rs.getString("addr"));
			}else {
				System.out.println("없음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	public Member mypage2(String userId) {
		String sql = "select * from test_ex where id =?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			rs=ps.executeQuery();
			if(rs.next()) {
				Member m = new Member();
				m.setId(rs.getString("id"));
				m.setPwd(rs.getString("pwd"));
				m.setName(rs.getString("name"));
				m.setAge(rs.getInt("age"));
				m.setAddr(rs.getString("addr"));
				
				return m;
			}else {
				System.out.println("업승ㅁ");
			}
		} catch (Exception e) {
		}finally {
			dbClose();
		}
		return null;
	}
	
	public int insert(String userId, String userPwd, String userName, int userAge, String userAddr) {
		int result =0;
		String sql = "insert into test_ex values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userPwd);
			ps.setString(3, userName);
			ps.setInt(4, userAge);
			ps.setString(5, userAddr);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return result;
	}
	public void delete( String userPwd, String userName, int userAge, String userAddr,String userId) {
		int result =0;
		String sql = "update test_ex set pwd =?, name =?, age=?, addr =? where id =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userPwd);
			ps.setString(2, userName);
			ps.setInt(3, userAge);
			ps.setString(4, userAddr);
			ps.setString(5,  userId);
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
}
