package com.yedam.variable;
import java.util.Scanner;

public class VarExe7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Member[] storage = new Member[100];
		storage[0] = new Member("홍길동", 83);
		storage[1] = new Member("김민혁", 86);
		storage[2] = new Member("한수아", 90);
		
		while(run) {
			System.out.println("1.등록 2.수정 3.삭제 4.출력 5.평균 6.종료");
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
				case 1:
					System.out.print("이름입력>> ");
					String name = scn.nextLine();
					System.out.print("점수입력>> ");
					int score = Integer.parseInt(scn.nextLine());
					Member member = new Member(); //인스턴스
					member.setName(name);
					member.setScore(score);
					//빈공간에 값을 할당
					for(int i=0;i<storage.length;i++) {
						if(storage[i] == null) {
							storage[i] = member;
							break; // for 반복문 종료
						}
					}
					break; // case 1의 종료
				case 2: //수정
					System.out.println("수정할 이름 입력: ");
					name = scn.nextLine();
					for(int i=0;i<storage.length;) {
						if(storage[i] != null && storage[i].getName().equals(name)) {
							System.out.println("이름입력>> ");
							storage[i].setName(scn.nextLine());
							System.out.println("점수입력>> ");
							storage[i].setScore(scn.nextInt());
							break;
						}
						break;
					}
				case 3: //삭제. 이름입력 조회 후 => null 대입.
					System.out.println("삭제할 이름 입력>> ");
					name = scn.nextLine();
					for (int i=0;i<storage.length;i++) {
						if(storage[i] != null && storage[i].getName().equals(name)) {
							storage[i] = null;
							System.out.println("삭제되었습니다.");
							break;
						}
						else {
							System.out.println("찾는 이름이 없습니다.");
							break;
						}
					}
					break;
				case 4: //목록 출력
					for(int i=0; i<storage.length;i++) {
						if(storage[i] == null) break;
						System.out.println("이름 : " + storage[i].getName() + " 점수 : " + storage[i].getScore());
					}
					break;
				case 5:
					int tmp = 0;
					int sum = 0;
					for(int i=0;i<storage.length;i++) {
						if(storage[i] == null) {
							tmp = i;
							break;
						}
						sum+=storage[i].getScore();
					}
					System.out.println("평균 : " + (sum/tmp));
					break;
				case 6:
					run = false;
			}
		}
		System.out.println("end of prog");
		scn.close();
	}

}
