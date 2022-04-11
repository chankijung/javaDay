package day16;
abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num =num;
		//실체화 되어있는 메소드 가질 수 있음
		//한마디로 코드가 있는 메소드
	}
	public abstract void combo();
	//추상화는 실체가 없음
	//그래서 상속받는 클래스에서 추상화된걸 실체화해야함
	
}
class class01 extends Abstract{
	//상속받은 클래스에서는 부모의 추상화 메소드를 반드시 가지고 있어야함
	public void combo12() {
		System.out.println(num+"단 콤보 & 발차기");
	}

	@Override
	public void combo() {
		System.out.println(num+"단 콤보 & 발차기");
	}
	
}
public class Ex04 {
public static void main(String[] args) {
	class01 c = new class01();
	c.setNum(5);
	c.combo();
}
}
