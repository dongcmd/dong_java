package ex03_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

/*
 * 1. 대한민국:서울, 캐나다:오타와, 영국:런던 ||| 이것들을 저장하는 HashMap 객체 생성
 * 2. 화면에서 나라이름을 입력받아 출력하기. 등록된 나라가 아니면 "수도 등록되지 않음" 메세지 출력
 * 		종료가 입력되기 전까지 계속 입력받기
 * 3. 종료 전 현재 등록된 내용 조회하기
 * 		나라 목록 조회
 * 		수도 목록 조회
 * 		나라:수도 목록 조회
 * 4. 등록된 나라가 아닌 경우 수도를 입력받아 Map타입 객체에 추가하기
 */
public class Exam01 {
	public static void main(String[] args) {
		Map<String, String> caps = new HashMap<>();
		
		caps.put("한국", "서울");
		caps.put("캐나다", "오타와");
		caps.put("영국", "런던");
		System.out.println(caps);
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		while( !input.trim().equals("종료")) {
			System.out.println("나라이름을 입력하세요. \"종료 입력시 종료\"");
			input = sc.nextLine();
//			input = "종료";
			if( input.trim().equals("종료") ) break;
			if( caps.get(input) == null ) {
				System.out.println(input +"의 수도가 등록되지 않음");
				System.out.println("수도를 등록하시겠습니까? Y/N ");
				String yn = sc.nextLine().trim();
				if(yn.equalsIgnoreCase("Y")) {
					System.out.println(input +"의 수도를 입력하세요.");
					String addCap = sc.nextLine();
					caps.put(input, addCap);
				}
			} else {
				System.out.println(input + "의 수도는 " + caps.get(input));
			}
		}
		Set< Map.Entry<String, String> > entry = caps.entrySet(); 
		System.out.print("등록된 나라 목록 : ");
		System.out.println(caps.keySet());
		for(Map.Entry<String, String> e : entry) { System.out.print(e.getKey() + ","); }
		System.out.println();
		System.out.print("등록된 수도 목록 : ");
		System.out.println(caps.values());
		for(Map.Entry<String, String> e : entry) { System.out.print(e.getValue() + ","); }
		System.out.println();
		System.out.print("등록된 나라=수도 목록 : ");
		System.out.println(caps.entrySet());
		for(Map.Entry<String, String> e : entry) { System.out.print(e + ","); }
		System.out.println();
		
	}
}