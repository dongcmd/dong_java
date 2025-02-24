package chap05;


public class ArrayEx07 {

	public static void main(String[] args) {

		int[][] arr = new int[3][2];
		int a = 10;
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a;
				a+=10;				
			}
		}
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%d\t", i, j, arr[i][j] );
			}
			System.out.println();
		}
		
		System.out.println("1차원 배열 객체 변경");
		
		
	}

}
