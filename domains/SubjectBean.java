package com.bitcamp.domains;

public class SubjectBean {
	private int kor, eng, math;
	
	public void setKor(int k) {
		kor = k;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getmath() {
		return this.math;
	}
	@Override
	public String toString() {
		return String.format("국어 : %d \n"
				+ "영어 : %d \n"
				+ "수학 : %d \n", kor, eng, math);
	}
}
