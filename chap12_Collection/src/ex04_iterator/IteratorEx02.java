package ex04_iterator;

import java.util.Hashtable;
import java.util.Iterator;

/*
 * Map 객체의 Iterator 
 */
public class IteratorEx02 {
	public static void main(String[] args) {
		Hashtable<Object, Object> students = new Hashtable<>();
		students.put(101, "Alice");
		students.put(102, "Bob");
		students.put(103, "Charlie");
		students.put(104, "David");
		students.put(105, "Ethan");
		students.put(106, "Fread");
		Hashtable<Object, Object> students2 = (Hashtable)students.clone();
		
//		Iterator<Object> it = students.iterator(); // Map객체는 Iterator 객체로 변환 불가 (Collection를 구현하지 않았으니까)
		Iterator<Object> it = students.keySet().iterator();
		print(it);
		System.out.println();
		System.out.println("print() 이후 students 객체 : "+students);
		
		System.out.println("d");
		it = students2.values().iterator();
		print(it);
		System.out.println();
		System.out.println("print() 이후 students2 객체 : "+students2);
	}
	private static void print(Iterator<Object> it) {
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
			it.remove();
		}
	}

}
