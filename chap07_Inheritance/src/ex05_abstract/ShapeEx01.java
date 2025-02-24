package ex05_abstract;

public class ShapeEx01 {

	public static void main(String[] args) {
		
		Shape[] arr = new Shape[2];
		arr[0] = new Circle(10);
		arr[1] = new Qudrangle(10, 10);
		//도형 면적합, 둘레합, 출력
		
		double sumArea = 0, sumLength = 0;
		
		
		for(Shape s : arr) {
			System.out.println(s);
			sumArea += s.area();
			sumLength += s.length();
		}
		
		System.out.println("전체 면적 : " + sumArea);
		System.out.println("전체 둘레 : " + sumLength);
	}

}
