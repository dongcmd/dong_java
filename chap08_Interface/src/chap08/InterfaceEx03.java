package chap08;


class Unit {
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}
interface Repairable{}
class Tank extends Unit implements Repairable {
	Tank() {
		super(150);
	}
	@Override
	public String toString() { return "Tank"; }
	
}
class Marine extends Unit {
	Marine() {
		super(40);
	}
	@Override
	public String toString() { return "Marine"; }
	
	
}
class s extends Unit implements Repairable {
	s() {
		super(60);
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			( (Unit)r ).hp = ( (Unit) r ).MAX;
			System.out.print(r);
			System.out.println("수리 완료");
		}
	}
		@Override
		public String toString() { return "SCV"; }
	
}
public class InterfaceEx03 {
	public static void main(String[] args) {
		Tank t = new Tank();
		Marine m = new Marine();
		s s = new s();
		s.repair(t);
//		s.repair(m);
		s.repair(s);
	}
}
