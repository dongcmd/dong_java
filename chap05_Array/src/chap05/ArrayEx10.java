package chap05;


import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {

		int[] arr1 = {10, 20, 30};
		//arr1 배열보다 하나 큰 배열을 생성하고
		//arr1의 배열값을 저장하고 합계를 마지막 요소에 저장
		
		int[] arr2 = new int[arr1.length+1];
		
		System.out.print("arr1 : ");
		for(int a : arr1)
			System.out.print(a + ", ");
		System.out.println();
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			arr2[arr1.length] += arr1[i];
		}
		System.out.print("arr2 : ");
		for(int a : arr2)
			System.out.print(a + ", ");
		System.out.println();
		
		// System.arraycopy() 함수
		
		int[] arr3 = new int[10];
		
		System.arraycopy(arr2, 0, arr3, 2, arr2.length);
		
		System.out.print("arr3 : ");
		for(int a : arr3)
			System.out.print(a + ", ");
		System.out.println();
		
		// Arrays.copyOf() 함수
		int[] arr4 = Arrays.copyOf(arr3, arr3.length);
		System.out.print("arr4 : ");
		for(int a : arr4)
			System.out.print(a + ", ");
		System.out.println();
		
		int[] arr5 = arr4;
		
		System.out.print("arr5 : ");
		for(int a : arr5)
			System.out.print(a + ", ");
		System.out.println();
		
		arr5[0] = 55;
		
		System.out.println("=======");
		System.out.print("arr1 : ");
		for(int a : arr1)
			System.out.print(a + ", ");
		System.out.println();
		
		System.out.print("arr2 : ");
		for(int a : arr2)
			System.out.print(a + ", ");
		System.out.println();
		
		System.out.print("arr3 : ");
		for(int a : arr3)
			System.out.print(a + ", ");
		System.out.println();
		
		System.out.print("arr4 : ");
		for(int a : arr4)
			System.out.print(a + ", ");
		System.out.println();
		
		System.out.print("arr5 : ");
		for(int a : arr5)
			System.out.print(a + ", ");
		System.out.println();
		
	}

}
