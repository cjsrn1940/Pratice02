package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	
		System.out.println("출력되는 내용을 입력하세요");
		
		System.out.print("기호 : ");
		String sign = sc.nextLine();
		System.out.print("숫자1 : ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2 : ");
		double num2 = sc.nextDouble();
		
		
		switch(sign) {
			case "+":
				double plus = num1 + num2;
				System.out.println("결과는 : " + plus);
				break;
			case "-":
				double minus = num1 - num2;
				System.out.println("결과는 : " + minus);
				break;
			case "*":
				double multiplication = num1 * num2;
				System.out.println("결과는 : " + multiplication);
				break;
			case "/":
				if(num2==0) {
					System.out.println("계산할 수 없습니다.");
				} else {
					double division = num1 / num2;
					System.out.println("결과는 : " + division);
				}
				break;
			default :
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		
		sc.close();

	}

}
