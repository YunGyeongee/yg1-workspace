package com.yg.variable;

// 다른 패키지라면 동일한 이름의 클래스를 만들 수 있다.
public class A_Variable { // com.yg.variable.A_Variable
	
	/*
	 *  * 목표
	 *  1. 변수란?
	 *  2. 변수를 왜 써야되는지
	 *  3. 변수를 어떻게 쓰면 되는지
	 *  4. 변수명은 어떻게 지으면 되는지
	 */
	
	public void printVariable() {
		
		System.out.println("=== 변수사용전 ===");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println((100 + 10) * 10 - 10);
		System.out.println(((100 + 10) * 10 - 10) / 10);
		// 결과물은 잘 출력되나 무슨 의도인지 파악하기 어렵다.
		
		
		// 1. 변수란? 어떠한 값을 메모리상에 기록하기 위한 공간이다. / = : 대입연산자 
		int point = 100; 	// 포인트 
		int bonus = 10;		// 보너스
		int count = 10;		// 사람명수
		int fees = 10;		// 세금

		System.out.println("=== 변수사용후 ===");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * count);
		System.out.println((point + bonus) * count - fees);
		System.out.println(((point + bonus) * count - fees) / count);
		
		System.out.println(point);
		
		/*
		 * 2. 변수를 사용하는 이유
		 * - 우선적으로 값에 의미를 부여하기 위한 목적 (가독성 좋음)
		 * - 한 번 값을 저장해두고 계속적으로 사용할 목적
		 * - 유지보수를 용이하게 하기 위한 목적
		 */
		
	}
	
	public void declareVariable() { // declare : 선언하다
		
		// System.out.println(point); => 다른 메소드안에 있는 변수(지역변수)는 사용할 수 없음
		
		/*
		 * 3. 변수의 선언 (기록할 값을 위한 변수를 메모리 공간에 확보해 놓는 과정 == 변수 만드는 과정)
		 * 
		 * [표현법] 자료형 변수명;
		 */
		
	}
	

}
