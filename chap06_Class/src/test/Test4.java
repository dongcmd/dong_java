package test;
/*
다음과 같은 멤버 변수를 갖는 Stud 클래스를 구현 하시오
   멤버 변수
          String name //학생이름
          int ban,no,kor,eng,math  //반,번호,국어점수,영어점수,수학점수
          
   멤버 메서드
          1. getTotal
             기능 : 국어,영어,수학 점수의 합 반환
             리턴타입 : int
          2. getAverage
             기능 : 총점(국어,영어,수학 점수의 합) 을 과목수로 나눈 평균 반환
             리턴타입 : float
 */
class Stud {
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (kor+eng+math)/3f;
	}
	
}
public class Test4 {
	public static void main(String[] args) {
		Stud s1 =new Stud();
		s1.name = "홍길동";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 80;
		s1.math = 85;
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());
	}
}
