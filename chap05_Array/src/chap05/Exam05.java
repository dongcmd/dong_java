// arr 2차원 배열 행의 합, 열의 합 출력
package chap05;



public class Exam05 {
	public static void main(String[] args) {
		int[][] arr;
		arr = new int[][] {
			{10, 20},
			{30, 40},
			{50, 60}			
		};
		
//		int a = 10;
//		for(int i = 0; i < arr.length; i++)
//			for(int j = 0; j < arr[i].length; j++, a+=10) {
//				arr[i][j] = a;
//				System.out.println(arr[i][j]);
//			}
		System.out.println("각 행의 합");
		for(int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			System.out.printf("%d행의 합 : ", i);
			for(int j = 0; j <arr[i].length; j++) {
				rowSum += arr[i][j];
				System.out.printf("%d",arr[i][j]);
				if(arr[i].length == j+1) { System.out.print("="); }
				else { System.out.print("+"); }
			}
			System.out.println(rowSum);
		}
		int index = 0;
		System.out.println("각 열의 합");
		for(int j = 0; j < arr[index++].length; j++) {
			int columnSum = 0;
			System.out.printf("%d행의 합 : ", j);
			for(int i = 0; i <arr.length; i++) {
				columnSum += arr[i][j];
				System.out.printf("%d",arr[i][j]);
				if(arr.length == j+1) { System.out.print("="); }
				else { System.out.print("+"); }
			}
			System.out.println(columnSum);
		}
		
		/*		10 20
		 * 		30 40
		 * 		50 60
		 */
		
		
		arr[1] = new int[] { 100, 200, 300};
		// 선생님 코드
		int maxlen = 0;
		for(int i = 0; i <arr.length; i++) {
			if(maxlen < arr[i].length) {
				maxlen = arr[i].length;
			}
		}
		int col[] = new int[maxlen];
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j++) {
				col[j] += arr[i][j];
			}
		}
		for(int i = 0; i < col.length; i++)
			System.out.printf("%d 열의 합 : %d\n", i, col[i]);
		
	}

}