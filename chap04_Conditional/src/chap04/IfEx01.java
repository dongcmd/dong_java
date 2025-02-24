package chap04;


import java.util.Scanner;

public class IfEx01 {
	public static void main(String[] args) {
//		String t="";
//		for
//		(int n = new java.util.Scanner(System.in).nextInt(), j = n;
//				n-- > 0;
//				System.out.printf("%"+j+"s\n",t+="*") ) ;
		
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        System.out.println(A + B - C);
        System.out.println(Integer.parseInt(
            String.valueOf(A) + String.valueOf(B) ) - C);
	}
}