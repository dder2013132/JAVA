package com.yedam.ref;

import com.yedam.variable.Member;

public class ArrayExe2 {
	public static void main(String[] args) {
		String[] strAry= {"Hello", "World", "20", "23.4"};
		for( String str : strAry) {
			System.out.println(str);
		}
		strAry = new String [10];
	Member[] memAry = new Member[10];
	memAry[0] = new Member();
	memAry[0].setMember("홍길동", 80);
	memAry[0].showInfo();
	
	memAry[1] = new Member();
	memAry[1].setMember("강철중", 50);
	memAry[1].showInfo();
	
	memAry[2] = new Member("최민혁", 77);
	memAry[2].showInfo();
//	for (int i = 0; i<memAry.length;i++) {
//		if(memAry[i] != null)
//			memAry[i].showInfo();
//	}
	}
}
