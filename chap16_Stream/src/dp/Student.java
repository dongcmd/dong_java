package dp;

public class Student implements Comparable<Student>{
	String name;
	int ban, eng, math, kor;
	public Student(String name, int ban, int eng, int math, int kor) {
		this.name = name;
		this.ban = ban;
		this.eng = eng;
		this.math = math;
		this.kor = kor;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", eng=" + eng + ", math=" + math + ", kor=" + kor + ", sum="+getSum() +"]";
	}
	// getter, setter
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getBan() { return ban; }
	public void setBan(int ban) { this.ban = ban; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	
	public int getSum() { return eng+math+kor; }
	@Override // 이름으로 정렬
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
}