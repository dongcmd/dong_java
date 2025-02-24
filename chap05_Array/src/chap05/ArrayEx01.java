package chap05;


public class ArrayEx01 {

	public static void main(String[] args) {

		int arr[] = {10, 20, 30, 40, 50};
		for(int a : arr)
			System.out.println(a);
		
		System.out.println();
		
		arr = new int[]{111, 222, 333};
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		
	}

}
