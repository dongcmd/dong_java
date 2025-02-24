package ex04_binding;
/*
 *  부모타입의 객체를 자손타입의 참조변수로 참조불가 : ClassCastException 예외 발생
 *  	Child c = Parent p // 예외 발생
 *  instanceof 연산자 : 객체와 참조변수의 관계 리턴
 *  
 */
public class BindingEx03 {
	public static void main(String[] args) {
//		Bike b = new Bike(2);
		Bike b = new AutoBike(2);
		AutoBike ab = null;
		Object o = null;
		if( b instanceof AutoBike) {
			ab = (AutoBike) b;
			//다 쓸 수 있음. AutoBike 타입의 참조변수로 AutoBike 객체를 참조 중.
			System.out.println("참조변수가 참조하는 객체는 AutoBike타입 객체 ");
		}
		if( b instanceof Bike) {
			System.out.println("참조변수가 참조하는 객체는 Bike타입 객체 ");
		}
		if( b instanceof Object) {
			o =  b;
			System.out.println("참조변수가 참조하는 객체는 Object 타입 객체 ");
		}
	}

}
