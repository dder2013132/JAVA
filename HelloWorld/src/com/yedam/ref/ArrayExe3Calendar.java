package com.yedam.ref;

public class ArrayExe3Calendar {
	public static int getFirstDay(int month) {
		switch(month) {
		case 1:
			return 3;
		case 2:
			return 6;
		case 3:
			return 6;
		case 4:
			return 2;
		default:
			return 1;
		}
	}
	
	public static int getLastDay(int month) {
		switch(month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		default:
			return 31;
		}
	}
	public static void main(String[] args) {
		// 1 ~ 31 콘솔 출력(print vs println)
		String[] days = {"SUN", "MON", "TEU", "WED", "THU", "FRI", "SAT"};
		for(String day : days) {
			System.out.print(" " + day);
		}
		System.out.println();
		int start_posi = getFirstDay(2);
		int last_days = getLastDay(2);
		for(int i = 0;i< start_posi; i++) {
			System.out.print("   ");
		}
		int check = start_posi;
		for(int i = 1; i <= last_days; i++) {
			if(check%7==0) {
				System.out.printf("%4s",String.valueOf(i));
				System.out.println();
				check++;
			}
			else {
				System.out.printf("%4s",String.valueOf(i));
				check++;
			}
		}
	}
}
