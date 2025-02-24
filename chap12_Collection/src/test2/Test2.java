package test2;
/*
1.궁합음식의 키를 입력받아 해당되는 음식을 출력하기. 
  종료가 입력될때 까지 계속 출력하기
2.종료 입력시 등록된 내용 출력하기
  등록된음식 :
    떡볶이 : 오뎅
    짜장면 : 단무지
3. 등록이 안된경우 
   등록여부를 입력받아, 등록하는 경우 궁합음식을 입력받기  
   등록하시겠습니까(y)? 
     y입력 : foods객체에 추가.
            궁합음식 입력받아서 foods에 추가함
     y가아닌경우 :
            음식을 다시 입력하기   

[결과]
음식명을 입력하세요(종료:종료)
떡볶이
떡볶이의 궁합음식:오뎅
음식명을 입력하세요(종료:종료)
치킨
치킨의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?
y
치킨의 궁합음식을 등록하세요
맥주
음식명을 입력하세요(종료:종료)
종료
{치킨=맥주, 떡볶이=오뎅, 라면=김치}
*/
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Test2 {
	public static void main(String[] args) {
		Map<String, String> foods = new HashMap<>();
		Set< Map.Entry<String, String> > entry = foods.entrySet();
		foods.put("떡볶이", "오뎅");
		foods.put("짜장면", "단무지");
		String input;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("음식명을 입력하세요(종료:종료)");
			input = sc.nextLine();
//			input = "종료";
//			input = "떡볶이";
			if(input.trim().equals("종료")) {
				break;
			}
			if(foods.get(input) == null) {
				System.out.println("등록된 궁합음식 없음.등록하시겠습니까? (Y/N)");
				String yn = sc.nextLine().trim();
				if(yn.equalsIgnoreCase("Y")) {
					System.out.println(input+"의 궁합음식을 입력하세요.");
					foods.put(input, sc.nextLine());
					System.out.println(input + "=" + foods.get(input) + " 조합 등록");
				} 
			} else {
				System.out.println(input + "의 궁합음식 : " + foods.get(input));
			}
		}
		System.out.println(foods);
	}
}
