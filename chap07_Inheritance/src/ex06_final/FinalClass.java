package ex06_final;
/*
 * final modifier(제어자) : 변경 불가
 * final class (종단 클래스) : 상속받기 불가 클래스. (부모클래스가 될 수 없음)
 * 	ㄴ final class 예시 ) String class, Math class
 */
class A {};
public final class FinalClass extends A{ }
//class SubClass extends FinalClass {}

//class Myclass extends String { }
