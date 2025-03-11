package com.yedam.variable;
// public <-> private
public class Member {
	// 클래스: 필드(값을 저장)
	private String name;
	private int score;
	//클래스 : 생성자(실체생성)
	//컴파일러 기본생성자 생성
	public Member() {
		
	}
	public Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
	//클래스: 메소드(기능) = 반환값 메소드명 (매개값)
	public void showInfo() {
		System.out.println("이름은 " + name + ", 점수는 " + score);
	}
	public void setMember(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score < 0) {
			System.out.println("점수는 0보다 큰 값이어야 합니다.");
			return;
		}
		this.score = score;
	}
}
