package com.yedam.variable;
import java.util.Scanner;

public class VarExe7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Member[] storage = new Member[100];
		while(run) {
			System.out.println("1.등록 2.수정 3.삭제 4.출력 5.종료");
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
				case 1:
					System.out.print("이름입력>> ");
					String name = scn.nextLine();
					System.out.print("점수입력>> ");
					int score = Integer.parseInt(scn.nextLine());
					Member member = new Member(); //인스턴스
					member.name = name;
					member.score = score;
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
					for(int i=0;i<storage.length;i++) {
						if(storage[i] != null && storage[i].name.equals(name)) {
							System.out.println("이름입력>> ");
							storage[i].name = scn.nextLine();
							System.out.println("점수입력>> ");
							storage[i].score = scn.nextInt();
							break;
						}
						break;
					}
				case 3: //삭제. 이름입력 조회 후 => null 대입.
					System.out.println("삭제할 이름 입력>> ");
					name = scn.nextLine();
					for (int i=0;i<storage.length;i++) {
						if(storage[i] != null && storage[i].name.equals(name)) {
							storage[i] = null;
							System.out.println("삭제되었습니다.");
							break;
						}
					}
					break;
				case 4: //목록 출력
					for(int i=0; i<storage.length;i++) {
						if(storage[i] == null) break;
						System.out.println("이름 : " + storage[i].name + " 점수 : " + storage[i].score);
					}
					break;
				case 5:
					run = false;
			}
		}
		System.out.println("end of prog");
	}

}
