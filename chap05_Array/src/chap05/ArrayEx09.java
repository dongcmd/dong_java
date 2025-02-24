/*
 * 가변배열 : 다차원 배열에서만 가능
 * 첫 번째 배열의 갯수만 설정, 나머지 값은 설정 X
 */
package chap05;


public class ArrayEx09 {
	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[] {10, 20};
		arr[1] = new int[] {30, 40, 50};
		arr[2] = new int[] {60};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%3d\t"
						, i, j, arr[i][j]);
			}
			System.out.println();
		}


	}

}
