package test2;
/*
* 회사의 직원(Employee)은 여러 유형으로 나뉜다
* 1. 직원 (Employee) : 직원구분, 이름, 주소, 소속부서
*               모든 직원은 급여를 받아야 하므로 getPay() 메서드를 멤버 메서드로 가진다. 
*               단 직원 구분을 모르므로 getPay() 메서드를 구현할 수 없으므로 추상 메서드로 구현한다.  
* 2. 정규직원(FormalEmployee) : 직원번호,직급, 연봉을 가진다.
*             급여는 연봉 /12
* 3. 비정규직원(InformalEmployee) : 계약 만료일(Date),기본임금을 가진다.
*             급여는 기본임금을 지급한다
* 4. 임시직원(TempEmployee) : 시간당임금(timepay), 근무시간(emptime)을 가진다.
*             급여는 시간당 임금 * 근무시간으로 지급한다.
*
* 모든직원은 급여를 받아야 한다 . 각각의 클래스에 getPay() 메서드를 구현하기
* 모든 직원들은 자신의 멤버변수의 내용을 입력받아 객체로 생성한다.
* 구동 클래스를 실행시 다음 결과가 나오도록 모든 클래스를 구현하기
* 
* [결과]
정규직=>박정규:4166666
비정규직=>유비정:1000000
임시직=>손임시:250000
전체 직원 급여합:5416666

*/
import java.util.Date;

abstract class Employee {
	String type, name, adress, dept;
	Employee(String name, String adress, String dept, String type) {
		this.name = name;
		this.adress = adress;
		this.dept = dept;
		this.type = type;
	}
	abstract int getPay();
}
class FormalEmployee extends Employee {
	int salary;
	String position, empNo;
	FormalEmployee(String name, String adress, String dept, String empNo, String position, int salary) {
		super(name, adress, dept, "정규직");
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;
	}
	
	int getPay() {
		return salary/12;
	}
}
class InformalEmployee extends Employee {
	Date date;
	int primaryPay;
	InformalEmployee(String name, String adress, String dept, Date date, int primaryPay) {
		super(name, adress, dept, "비정규직");
		this.date = date;
		this.primaryPay = primaryPay;
	}
	
	int getPay() {
		return primaryPay;
	}
}
class TempEmployee extends Employee {
	int timepay;
	int emptime;
	TempEmployee(String name, String adress, String dept, int timepay, int emptime) {
		super(name, adress, dept, "임시직");
		this.timepay = timepay;
		this.emptime = emptime;
	}
	
	int getPay() {
		return timepay * emptime;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new FormalEmployee("박정규","서울","총무부","001","과장",50000000);
		Date exDate = new Date(); 
		exDate.setTime(exDate.getTime() + (1000L*60*60*24*365));
//		System.out.println(exDate);
		emps[1] = new InformalEmployee("유비정","서울","기획부",exDate,1000000);
		emps[2] = new TempEmployee("손임시","서울","영업부",25000,10);
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type + "=>" + e.name + ":"  + e.getPay());
			total += e.getPay();
		}				
		System.out.println("전체 직원 급여:" + total);
	}
}
