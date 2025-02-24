package test;
/*
회사가 고용하는 여러 유형의 직원들이 있다.
직원은 정규직원과 비정규직원 으로 나뉜다.

모든 직원은 직원구분(type), 이름(name), 주소(address),소속부서(dept)정보를 가진다.
정규직원은 직원번호(empNo), 직급(position), 연봉(salary)를 가진다.
비정규직원은 계약만료일(expireDate), 기본임금(primaryPay)를 가진다.

 직원클래스(Employee)
 정규직원 클래스(FormalEmployee)
 비정규직원클래스(InformalEmployee)

 또한 모든 직원은 급여를 받는다.
 정규직원은 급여로 연봉 / 12 로 
 비정규직원은 기본입금
 FormalEmployee,InformalEmployee클래스에 getPay() 메서드를 구현하기 
 
 구동클래스 실행시 다음의 결과가 나오도록 클래스 생성하기
  
[결과]
정규직:이름=김정규, 주소=서울시 용산구,부서=총무부,직원번호=1,직급=과장,연봉=5000
김정규의 급여 : 416
비정규직:이름=이비정, 주소=서울시 구로구,부서=영업부,계약만료일=Sun Sep 01 15:58:50 KST 2024,기본입금=1000
이비정의 급여 : 1000
*/

import java.util.Date;

class Employee {
	String type, name, adress, dept;
	
	Employee(String name, String adress, String dept) {
		this.name = name;
		this.adress = adress;
		this.dept = dept;
	}
	Employee(String name, String adress, String dept, String type) {
		this.name = name;
		this.adress = adress;
		this.dept = dept;
		this.type = type;
	}
	
}

class FormalEmployee extends Employee {
	int salary;
	String empNo, position;
	
	FormalEmployee(String name, String adress, String dept, String empNo, int salary, String position ) {
		super(name, adress, dept, "정규직");
		this.salary = salary;
		this.empNo = empNo;
		this.position = position;
	}
	int getPay() { return salary/12; }
	@Override
	public String toString() {
		return "정규직:이름=" + name + ", 주소=" + adress + ",부서=" + dept + 
				",직원번호=" + empNo + ",직급=" + position + ",연봉=" + salary;
	}
	
}

class InformalEmployee extends Employee {
	int primaryPay;
	Date expireDate = new Date();
	
	InformalEmployee(String name, String adress, String dept, Date expireDate, int primaryPay) {
		super(name, adress, dept, "비정규직");
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	int getPay() { return primaryPay; }
	@Override
	public String toString() {
		return "비정규직:이름=" + name + ", 주소=" + adress + ",부서=" + dept + 
				",계약만료일=" + expireDate + "기본임금" + primaryPay;
	}
}


public class Test5 {
	public static void main(String[] args) {
		//정규직원 객체 생성
		  FormalEmployee fe = new FormalEmployee
				  ("김정규", "서울시 용산구","총무부", "1", 5000, "과장");
		  System.out.println(fe);
		  System.out.println(fe.name + "의 급여 : " +   fe.getPay());

		  Date expireDate = new Date(); //현재날짜 시간.
		  expireDate.setTime(expireDate.getTime() +
				   (1000L * 60 * 60 * 24 * 365 * 2));
		  InformalEmployee ie = new InformalEmployee
				  ("이비정", "서울시 구로구", "영업부", expireDate, 1000);
		  System.out.println(ie);
		  System.out.println(ie.name + "의 급여 : " +  ie.getPay());
	}
}
