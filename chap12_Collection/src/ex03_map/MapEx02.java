package ex03_map;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;


/*
 * 도서정보 조회하기
 * 책 이름으로 도서 정보 저정하기
 */
class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "(" + title + "," + author + "," + price + ")";
	}
}
public class MapEx02 {
//	static Map<String, Book> books = new HashMap<>();
	static Map<String, Book> books = new TreeMap<>();
	
	private static void addBook() { // 1.추가
		String title;
		String author;
		int price;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도서를 추가합니다. 제목 저자 가격 순으로 입력하세요");
		title = sc.next();
		author= sc.next();
		price = sc.nextInt();
		sc.nextLine();
		Book book = new Book(title, author, price);
		books.put(title, book);
		System.out.println(book + "이/가 추가되었습니다.");
//		System.out.println(books);
	}
	
	private static void deleteBook() { // 2.삭제
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 도서제목을 입력하세요> ");
		String title = sc.next();
		Book book = books.remove(title);
		if(book != null) {
			System.out.println(book + "이/가 삭제되었습니다.");
		} else {
			System.out.println(title + "란 도서는 없습니다.");
		}
	}
	
	private static void printBook() { // 3.조회
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정렬 방식을 입력하세요(1.제목 2.저자 3.가격 0.종료)");
			int pn = sc.nextInt(); sc.nextLine();
//			int pn = 3;
			
			switch(pn) {
				case 1 : 
					for(Book book : books.values())
						System.out.println(book); return;
				case 2 : {
					Set< Map.Entry<String, Book> > entry = books.entrySet();
					List< Map.Entry<String, Book> > list = new ArrayList<>(entry);
					Collections.sort(list, new Comparator< Map.Entry<String, Book> >() {

						@Override
						public int compare(Entry<String, Book> o1, Entry<String, Book> o2) {
							return o1.getValue().author.compareTo(o2.getValue().author);
						}
					});
					
					for(Map.Entry<String, Book> a : list)
						System.out.println(a.getValue()); return;
				}
				case 3 : {
					List<Book> list2 = new ArrayList<>(books.values());
					list2.sort( (b1, b2) -> b1.price - b2.price);
					for(Book book : list2)
						System.out.println(book); return;
				}
				case 0 :
					return;
				
				default : System.out.println("오입력"); continue;
			}
		}
	}
	
	private static void findBook() { // 4.검색
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색기준을 입력하세요 (1.제목 2.저자 3.가격 0.종료)");
			int input = sc.nextInt(); sc.nextLine();
			switch(input) {
				case 1 : {
					System.out.println("검색할 제목을 입력하세요.");
					String title = sc.nextLine();
					Book book = books.get(title);
					if ( book != null) {
						System.out.println(title + " 도서정보입니다.");
						System.out.println(book);
					} else {
						System.out.println(title + " 도서는 없습니다.");
					}
					break;
				}
				case 2 : {
					System.out.println("검색할 저자를 입력하세요.");
					String author= sc.nextLine();
					List<Book> list1  = new ArrayList<>(books.values());
					List<Book> result = new ArrayList<>();
					for(Book b1 : list1) {
						if(b1.author.equalsIgnoreCase(author)) {
							result.add(b1);
						}
					}
					if(result.isEmpty()) {
						System.out.println(author + "가 저자인 도서는 없습니다");
					} else {
						for(int i = 0; i < result.size() ; i++) {
							System.out.println(result.get(i));
						}
					} break;
				}
				case 3 : {
					System.out.println("검색할 가격을 입력하세요.");
					int price = sc.nextInt(); sc.nextLine();
					TreeSet<Book> set1 = new TreeSet<>((b1, b2) -> b2.price - b1.price);
					set1.addAll(books.values());
					List<Book> result = new ArrayList<>();
					for(Book b1 : set1) {
						if(b1.price <= price) {
							result.add(b1);
						}
					}
					if( result.size() == 0) {
						for(Book b1 : set1) {
							if(b1.price > price) {
								result.add(b1);
							}
						}
						result.sort((b1, b2) -> b1.price - b2.price);
						System.out.println(price + "이하 가격의 도서는 없습니다. 가장 저렴한 도서 : " + result.getFirst());
					} else {
						for(int i = 0; i < result.size() ; i++) {
							System.out.println(result.get(i));
						}
					}
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		books.put("홍길동전", new Book("홍길동전", "허균", 10000));
		books.put("춘향전", new Book("춘향전", "미상", 5000));
		books.put("abc", new Book("abc", "사람", 50000));
		books.put("cc", new Book("cc", "사람", 50000));
		
		Scanner sc = new Scanner(System.in);
		p1 : 
		while(true) {
			int menu;
			System.out.println("1.추가 / 2.삭제 / 3.조회 / 4.검색 / 0. 종료");
			try {
				menu = sc.nextInt();
//				menu = 3;
				switch(menu) {
				case 0 : System.out.println("프로그램 종료"); break p1;
				case 1 : addBook(); break;
				case 2 : deleteBook(); break;
				case 3 : printBook(); break;
				case 4 : findBook(); break;
				default : System.out.println("잘못된 입력입니다. 0 ~ 4 숫자만 입력하세요.");
				}
			}catch(InputMismatchException e) {
				System.out.println("0 ~ 4사이 숫자만 입력가능");
				sc.next();
			}
		}
	}
}