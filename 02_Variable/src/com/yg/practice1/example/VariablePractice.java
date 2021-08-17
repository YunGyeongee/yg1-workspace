package com.yg.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		/*
		 * 이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height +"인 " + age + "살" + gender + "자 " + name + "님 반갑습니다^^");
		
	}
	
	public void method2() {
		
		/*
		 * 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		
	}
	
	public void method3() {
		
		/*
		 * 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 게산하여 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double num1 = sc.nextDouble();
		System.out.print("세로 : ");
		double num2 = sc.nextDouble();

		System.out.println("면적 : " + (num1 * num2));
		System.out.println("둘레 : " + (num1 + num2) * 2);
	
	}

}
