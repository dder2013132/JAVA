package com.yedam.variable;

import java.util.Scanner;

public class VarExe6 {
	public static void test() {
		// 임의의 정수 1 ~ 50 임의의 값.
				int arr[] = new int[500];
				for(int i = 0;i<5;i++) {
					arr[i] = ((int)(Math.random() * 71) + 30); // 1 <= x < 51	
				}
				for(int i = 0;i<arr.length;i++) {
					if(arr[i]==100) {
						System.out.println(i + "번째 값: " + arr[i]);
					}
				}
				
				// 학생의 점수 (30~100 사이의 점수)
				// 정수(int) -> 5개 저장.
				// 홀수의 값을 출력.
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Member m1 = new Member(); //인스턴스 생성
		m1.setName("홍길동");
		Member m2 = new Member();
		m2.setName("최민수");
		Member m3 = new Member();
		m3.setName("김병수");
		Member m4 = new Member();
		m4.setName("박인만");
		
		Member[] members = {m1,m2,m3,m4};
		for(int i=0;i<4;i++) {
			members[i].setScore(((int)(Math.random() * 31) + 70));
		}
		
		System.out.println("조회할 이름 입력 >> ");
		String nm = scn.nextLine();
		for(int i=0;i<4;i++) {
			if(members[i].getName().equals(nm)) {
				System.out.println("조회 결과 : " + nm + ", " + members[i].getScore());
			}
		}
		int tmp = 0;
		String check[][] = new String[4][4] ;
		for(int i=0;i<4;i++) {
			if(members[i].getScore() > tmp) {
				tmp = members[i].getScore();
			}
		}
		for(int i=0;i<4;i++) {
			if(members[i].getScore() == tmp) {
				check[i][0] = members[i].getName();
			}
		}
		for(int i=0;i<4;i++) {
			System.out.println("이름 : " + members[i].getName()+ ", 점수 : " + members[i].getScore());
		}
		int i=0;
		while(i<4) {	
			if(check[i][0] != null) {
				System.out.println("가장 높은 사람 : " + check[i][0] + ", 최대 점수 : " + tmp);
			}
			i++;
		}
		scn.close();
	}
}