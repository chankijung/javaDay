package day12;

public class Ex06 {
	private int kor, eng, math, sum;
	private double avg;
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setKor(int k) {
		this.kor = k;
	}
	public void setEng(int e) {
		this.eng = e;
	}
	public void setMath(int m) {
		this.math = m;
	}
	public int sum() {
		this.sum = getKor()+getEng()+getMath();
		return sum;
	}
	public double avg() {
		this.avg = sum()/3;
		return avg;
	}
}
