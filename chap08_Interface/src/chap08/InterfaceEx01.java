package chap08;


interface Printerable {
	int INK = 100; void print();
	default void sort()	{ System.out.println("정렬페이지 입력"); };
}
interface Scanable { void scan(); }
interface Faxable {
	String FAX_NO = "02-1111-2222"; 
	void send(String no); void receive(String no);
}

// 인터페이스간 다중 상속
interface Complexerable extends Printerable, Scanable, Faxable { }

// 구현클래스 : 인터페이스를 구현한 클래스 
class Complexer implements Complexerable { //다중 구현 가능
	int ink;
	Complexer() { this.ink = INK; }
	@Override
	public void print() { System.out.println("프린트합니다. 남은 잉크량 : " + --ink); }
	@Override
	public void scan() { System.out.println("이미지를 스캔합니다.");}
	@Override
	public void send(String no) { System.out.println(FAX_NO +"에서" + no + "로 FAX 보냄"); }
	@Override
	public void receive(String no) { System.out.println(no +"에서" + FAX_NO + "로 FAX 받음"); }	
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		Complexer c = new Complexer();
		System.out.println(Printerable.INK);
		c.print();
		c.scan();
		c.receive("02-2222-2222");
		c.send("02-2222-2222");
		System.out.println("복합기 프린트의 남은 잉크량 : " + c.ink);
		
		if(c instanceof Complexerable) {
			System.out.println("c가 참조하는 객체는 Complexerable 객체임");
			Complexerable co = c;
			co.print();
			co.scan();
			co.receive("02-2222-2222");
			co.send("02-2222-2222");
//			System.out.println("복합기 프린트의 남은 잉크량 : " + co.ink);
		}
		if(c instanceof Printerable) {
			System.out.println("c가 참조하는 객체는 Printerable 객체임");
			Printerable p = c;
			p.print();
//			p.scan();
//			p.receive("02-2222-2222");
//			p.send("02-2222-2222");
//			System.out.println("복합기 프린트의 남은 잉크량 : " + p.ink);
		}
		if(c instanceof Scanable) {
			System.out.println("c가 참조하는 객체는 Scanable 객체임");
			Scanable s = c;
//			s.print();
			s.scan();
//			s.receive("02-2222-2222");
//			s.send("02-2222-2222");
//			System.out.println("복합기 프린트의 남은 잉크량 : " + s.ink);
		}
		if(c instanceof Faxable) {
			System.out.println("c가 참조하는 객체는 Faxable 객체임");
			Faxable f = c;
//			f.print();
//			f.scan();
			f.receive("02-2222-2222");
			f.send("02-2222-2222");
//			System.out.println("복합기 프린트의 남은 잉크량 : " + f.ink);
		}
		if(c instanceof Object) {
			System.out.println("c가 참조하는 객체는 Object 객체임");
			Object o = c;
//			o.print();
//			o.scan();
//			o.receive("02-2222-2222");
//			o.send("02-2222-2222");
//			System.out.println("복합기 프린트의 남은 잉크량 : " + o.ink);r
		}
	}

}
