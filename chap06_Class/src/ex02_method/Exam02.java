package ex02_method;

public class Exam02 {
	public static void main(String[] args) {
		// 배열로 풀기
		
		Rec[] arr = new Rec[5];
		int[] sum = new int[2];
		// 0 면적합, 1 둘레합
		for(int i = 0; i < 5; i++) {
			arr[i] = new Rec();
			arr[i].width = (int)(Math.random() * 31) + 20; 
			arr[i].height = (int)(Math.random() * 31) + 20;
			// 20 ~ 50 랜덤
			System.out.println(arr[i].toString());
			sum[0] += arr[i].area();
			sum[1] += arr[i].length();
		}
		System.out.println("전체 면적의 합: " +sum[0]);
		System.out.println("전체 둘레의 합: " +sum[1]);
		System.out.println("전체 면적의 평균: " +(double)sum[0]/arr.length);
		System.out.println("전체 면적의 평균: " +(double)sum[1]/arr.length);
	}

}