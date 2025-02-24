package test;

/*
다음 결과가 출력되도록 동물(Animal)클래스와 구동클래스(Test2)를 구현하기
구동클래스에서 출력은 Animal 클래스를 이용하기       

 동물클래스(Animal)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: eat() ;
         기능 : "맛있게 얌얌" 출력
[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   
*/
class Animal {
	String name;
	int age;
	Animal() {}
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void eat() {
		System.out.println("맛있게 얌얌");
	}
}
public class Test2 {
	public static void main(String[] args) {
		Animal monkey = new Animal("원숭이", 20);
		System.out.printf("이름(name):%s%n", monkey.name);
		System.out.printf("나이(age):%d%n", monkey.age);
		monkey.eat();
		
	}
}
