package com.yg.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// 사용자가 키보드를 통해 입력한 값을 가져온 후 변수에 기록하는 방법
	
	public void inputScanner1() {
		
		/*
		 * 키보드로 입력한 값을 가져오기 위해서는 
		 * 자바에서 이미 제공하고 있는 java.util.Scanner라는 클래스가 가지고 있는 메소드를 이용해야함
		 * 
		 * 다른 클래스에 있는 메소드를 호출할 때
		 * 1) 클래스 생성(new)
		 * 2) 해당 클래스에 있는 메소드 호출
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); // System.in : 입력받은 값을 바이트 단위로 받아들이겠다.
		
		// 간단하게 사용자의 정보(이름, 나이, 키)를 입력 받고 그 입력받을 정보를 출력하는 프로그램
		// 입력받을 내용을 먼저 출력해서 유도
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드(sc.next(), sc.nextLine())
		// sc.next(); => 이렇게만 작성하면 입력된 값을 가지고 오고 바로 종류
		//String name = sc.next();
					  // next() : 사용자가 입력한 값 중 공백 이전까지만 값을 읽어옴
					  //          주소같은 공백이 포함될 여지가 있는 문자열에는 적절하지 않다.
		String name = sc.nextLine();
		
		System.out.print("당신은 나이는 몇 살 입니까(숫자만) : ");
		int age = sc.nextInt();
				  // nextInt() : 사용자가 입력한 값 정수로 읽어옴(정수가 아닌 문자를 같이 입력할 경우 오류발생)
		
		System.out.print("당신의 키는 몇cm입니까(소숫점 첫째자리까지) : ");
		double height = sc.nextDouble();
						// nextDouble() : 사용자가 입력한 값 실수로 읽어옴(문자 같이 입력할 경우 오류발생)
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + height);
		
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		// 이름, 나이, 주소, 키
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이(숫자) : ");
		int age = sc.nextInt();
		
		/*
		 * sc.nextLine() : 버퍼에서 값을 가져온 후 '엔터'를 비워주는 역할을 수행
		 * 그 외의 next~() : 버퍼에서 값을 가져오고 끝냄('엔터'를 비워주지 않음 == '엔터'가 여전히 남아있을 것)
		 * 
		 * sc.nextInt() 후에 sc.nextLine() 메소드가 호출된다면 버퍼에 남아있는 엔터때문에 sc.nextLine() 바로 실행됨
		 * 
		 * 결론 : sc.next~() 메소드 뒤에 바로 sc.nextLine() 메소드가 사용될 것 같으면 버퍼에 남아있는 '엔터'를 빼주는 과정 필요함
		 * 		=> 그 사이에 sc.nextLine() 메소드를 한 번 더 호출해주기
		 */
		
		// 버퍼에 남아있는 '엔터'를 비워주는 과정
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		
	}
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 : sc.nextLine();
		// 정수 : sc.nextInt();
		// 실수 : sc.nextDouble();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(여/남) : ");
		//char gender = sc.nextChar(); // nextChar 메소드는 존재하지 않음
		char gender = sc.nextLine().charAt(0);
		// 사용자가 입력한 값을 문자열로 가지고 온 후 원하는 인덱스의 문자값을 추출해서 담기
		// * 인덱스 == 0번부터 시작
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// =============
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
		
	}

}
