package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		/*
		if(0 < age < 18) { // 0<age<18 에서 오류 발생, 조건 두개를 한번에 쓸 때는 연산자 필요
			System.out.println("청소년 입니다.");
		}
		*/
		
		if(age > 0 && age < 18) {
			System.out.println("청소년 입니다.");
		}

	}

}
