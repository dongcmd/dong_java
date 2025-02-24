package ex02_set;

import java.util.HashSet;
import java.util.Set;
/*
 * 객체 추가시 중복판단 기준
 * 1. equals() 결과가 true
 * 2. (두 객체의) hashCode() 결과가 같다
 * 
 * 1 && 2 모두 만족하면 : 중복 객체로 판단.
 * 
 */

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(" + name + "," + age + ")";
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		} else return false;
	}
	
}
public class SetEx02 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 20));
		System.out.println(set);
		
		System.out.println(set.hashCode());
		
		
		
	}

}
