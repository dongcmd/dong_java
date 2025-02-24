package test;
/*
 * 구동클래스를 실행하였을때 다음의 결과가 나오도록
 * 관련 클래스를 구현하기
 [결과]  
DanceRobot2은 춤을 춤니다.
SingRobot2은 노래를 부릅니다.
DrawRobot2은 그림을 그립니다.
 */
abstract class Robot2 {
	abstract void action();
}
class DanceRobot2 extends Robot2 {
	@Override
	public void action() {
		System.out.println("DanceRobot2은 춤을 춥니다.");
	}
}
class SingRobot2 extends Robot2 {
	@Override
	public void action() {
		System.out.println("SingRobot2은 노래를 부릅니다.");
	}
}
class DrawRobot2 extends Robot2 {
	@Override
	public void action() {
		System.out.println("DrawRobot2은 그림을 그립니다.");
	}
}
public class Test3b {
	public static void main(String[] args) {
		Robot2[] Robot2 = new Robot2[3];
		Robot2[0] = new DanceRobot2();
		Robot2[1] = new SingRobot2();
		Robot2[2] = new DrawRobot2();
		for(Robot2 r : Robot2) {
			r.action(); 
		}
	}
}
