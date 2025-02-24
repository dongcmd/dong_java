package test2;
/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X□■□■□■□■□X
□X□■□■□■□X□
■□X□■□■□X□■
□■□X□■□X□■□
■□■□X□X□■□■
□■□■□X□■□■□
■□■□X□X□■□■
□■□X□■□X□■□
■□X□■□■□X□■
□X□■□■□■□X□
X□■□■□■□■□X

■ : ㅁ 한자
□ : ㅁ 한자
*/
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		//■ true, false □
		boolean mc = false;
		char m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정사각형의 변 길이 입력");
		int d = sc.nextInt();
		
		int sp = 1;
		int ep = d;
		
		//■ true, false □
		for(int i = 1; i <= d; i++) {
			for(int j = 1; j <= d; j++) {
				mc = !mc;
				if(mc) { m = '■'; } else { m = '□'; }
				
				if( (Math.abs(sp)) == j || (Math.abs(ep)) == j) {
					System.out.print("X");
				} else { System.out.print(m); }
			}
			System.out.println();
			sp++; ep--;
		}
		

	}
}
