package chap08;


class Lazerzet implements Printerable {
	String name = "잉크젯";
	@Override
	public void print() {
		System.out.println("레이저프린터로 프린트합니다.");
	}
}
class Inkzet implements Printerable {
	String name = "레이저젯";
	@Override
	public void print() {
		System.out.println("잉크프린터로 프린트합니다.");	
	}
}
class PrinterManager {
	public static Printerable getPrint(String type) {
		if( type.equals("INK") ) { return new Inkzet(); }
		else { return new Lazerzet(); }
	}
}
public class InterfaceEx02 {
	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrint("INK");
		p.print();
//		System.out.println(p.name);
		PrinterManager.getPrint("LAZER").print();
		
	}
}