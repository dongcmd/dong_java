package test;
/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
*/
public class Test05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i1 = 1; i1 <= 10; i1++) {
			System.out.print("(");
			for(int i2 = 1; i2 <= i1; i2++) {
				sum += i2;
				System.out.print(i2);
				if(i1 != i2) { System.out.print("+"); }
			}	
			System.out.print(")");
			if(i1 == 10) { System.out.print("="); }
			else { System.out.print("+"); }
		}
		System.out.println(sum);
	}
}
