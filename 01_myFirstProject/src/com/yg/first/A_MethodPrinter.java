package com.yg.first; // 패키지 선언부 => 패키지가 속해있는 경로를 반드시 선언해줘야함.

public class A_MethodPrinter { // 클래스의 첫문자를 대문자로 하도록 경고해줌 / 파스칼표기법 사용
	
	// 실행시킬 코드는 반드시 메인 메소드안에 입력해야 함
	// 클래스 영역 안에 여러개의 메소드를 정의해둘 수 있다.
	
	// 각 기능별로 "일반메소드" 여러개 정의
	// 일반메소드 : public void 메소드명() { 소스코드; }

	
	// 기능1: "안녕하세요." 라는 구문을 출력시켜주는 역할 수행
	public void helloPrint() { // 메소드명은 소문자로 시작(낙타표기법)
		System.out.println("안녕하세요.");
	}
	
	// 기능2 : "다시 만나요." 라는 구문을 출력시켜주는 역할 수행
	public void seeUPrint() {
		System.out.println("다시 만나요.");
	}
	
	// 기능3 : "잘가요." 라는 구문을 출력시켜주는 역할 수행
	public void byePrint() {
		System.out.println("잘가요.");
	}
	
	/*
	 * 해당 클래스에 main 메소드가 없어서 곧 바로 실행불가
	 * 
	 * => 실행용 클래스(메인메소드를 가지고 있는 클래스)를 별도로 만들어 실행할 메소드만을 호출해서 실행하려고 한다.
	 */
}
