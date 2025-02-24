package test2;
/*
 command line에서 숫자로 이루어진 문자를 
 두개 받아서 두수의 공약수를 구하시오
 int num1 = Integer.parseInt(args[0])
   [결과]
   10과 20 의 공약수 : 1,2,5,10,

 */
public class Test2 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);		
		int num2 = Integer.parseInt(args[1]);
		System.out.printf("%d과 %d 의 공약수 : ", num1, num2);
		
		for(int i = 1; i <= Math.min(num1, num2); i++ ) {
			if( num1 % i == 0 && num2 % i ==0) {
				System.out.print(i + ","); 
			}
		}

	}

}
