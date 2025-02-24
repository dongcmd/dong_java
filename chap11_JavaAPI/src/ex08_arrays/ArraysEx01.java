package ex08_arrays;

import java.util.Arrays;
import java.util.Comparator;
/*
 * Arrays class : 배열의 복사, 비교, 정렬기능을 가진 클래스
 */
public class ArraysEx01 {
	public static void main(String[] args) {
		String[] arr1 = { "홍길동", "이몽룡", "성춘향", "향단이" };
		for(String s : arr1) { System.out.print(s + ","); }
		System.out.println();
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//arr1 배열의 값을 김삿갓으로 저장하기
		Arrays.fill(arr1, "김삿갓");
		System.out.println(Arrays.toString(arr1));
		
		//arr2 배열의 값을 10으로 채우기
		Arrays.fill(arr2, 10);
		System.out.println(Arrays.toString(arr2));
		
		//arr1 배열의 1, 2번 인덱스의 값을 홍길동전으로 저장하기
		Arrays.fill(arr1, 1, 3, "홍길동전");
		System.out.println(Arrays.toString(arr1));
		
		//arr2 배열의 요소를 2, 3번 인덱스를 100으로 채우기
		Arrays.fill(arr2, 2, 4, 100);
		System.out.println(Arrays.toString(arr2));
		
		//arr1 배열을 정렬하기 sort()
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		//arr1 배열을 내림차순 정렬하기 sort()
		Arrays.sort(arr1, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		
	}

}
