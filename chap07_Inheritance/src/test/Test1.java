package test;
/*
 * 다음의 결과가 나오도록 Student 클래스 구현하기
 * [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
=====================
 */
class Student {
	String name;
	int kor, eng, mat, sum, sNo;
	double avg;
	Student(String name, int sNo) {
		this.name = name;
		this.sNo = sNo;
	}
	
	Student(String name, int sNo, int kor, int eng, int mat) {
		this(name, sNo);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor+eng+mat;
		avg = sum / 3f;
	}
	
	void info() {
		System.out.printf("학번:%d\n",sNo);
		System.out.printf("이름:%s\n",name);
		System.out.printf("국어:%d\n",kor);
		System.out.printf("영어:%d\n",eng);
		System.out.printf("수학:%d\n",mat);
		System.out.printf("총점:%d\n",sum);
		System.out.printf("평균:%.1f\n",avg);
		System.out.println("============");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	}
}
