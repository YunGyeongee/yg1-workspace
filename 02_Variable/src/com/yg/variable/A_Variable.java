package com.yg.variable;

// 다른 패키지라면 동일한 이름의 클래스를 만들 수 있다.
public class A_Variable { // com.yg.variable.A_Variable
	
	/*
	 *  * 목표
	 *  1. 변수란?
	 *  2. 변수를 왜 써야되는지
	 *  3. 변수를 어떻게 쓰면 되는지
	 *  4. 변수명은 어떻게 지으면 되는지(변수 명명 규칙 == 네이밍룰)
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
		 * [표현법] 자료형 변수명;
		 * * 자료형 : 어떤 값을 담아낼지, 어느 정도의 크기를 담아낼건지 변수의 크기 및 모양을 정하는 부분
		 * 
		 * * 변수 선언시 주의할 점
		 * - 변수명의 첫 문자는 소문자, 여러 단어로 엮여 있는 경우 낙타표기법
		 * - 해당 영역({})에 선언한 변수는 해당 영역에서만 쓸 수 있음 => 다른 메소드에서는 쓸 수 없다 == 지역변수
		 * - 해당 영역({})에 동일한 변수명으로 선언 불가 (중복됐다는 오류 발생 duplicate)
		 */
		
		// 1. 논리형
		boolean isTrue; 	// 1byte / 값은 비어있는 상태
		
		// 2. 숫자형
		// 2_1. 정수형
		byte bNum;			// 1byte
		short sNum;			// 2byte
		int iNum;			// 4byte -> 정수형 중 가장 대표적인 자료형(기본형)
		long lNum;			// 8byte
		
		// 2_2. 실수형
		float fNum;			// 4byte
		double dNum;		// 8byte -> 실수형 중 가장 대표적인 자료형(기본형) / float보다 더 정확한 값을 담을 수 있기 때문
		
		// 3. 문자형
		char ch;			// 2byte
		
		
		// ------------------------------ 기본 자료형(8개) ---------------------------------------
		
		// 4. 문자열(참조 자료형)
		String str;
		
		
		/*
		 * * 변수에 값 대입(담기)
		 * [표현법] 변수명 = 값;
		 */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; 		// long형 변수에 값을 담을 때는 l 또는 L을 붙임(L을 더 권장)
		fNum = 4.0f;	// 반드시 f를 붙여야함 (형변환 때문)
		dNum = 8.0;
		ch = 'A';
		ch = '김';		// 변수에는 하나의 값만 담을 수 있음. 문자는 반드시 홑따옴표
		str = "hello";
		str = "B";
		
		// ** 변수를 호출해서 담긴값을 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		// int iNum;
		int a;
		int b;
		int c;
		
	}
	
	public void initVariable() {
		
		/*
		 * 위의 메소드에서는 변수 선언 후에 값을 대입했다면 지금은 변수를 선언과 동시에 값 대입(초기화)
		 * [표현법] 자료형 변수명 = 값;
		 */
		
		// 기본자료형
		// 1. 논리형
		boolean isTrue = false;
		
		// 2_1. 숫자형(정수형)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 2_2. 숫자형(실수형)
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. 문자(한글자)형
		char ch = '가';
		
		// 참조자료형
		// 4. 문자열
		String str = "I오전반";
		
		// ==> 변수 생성과 동시에 값 초기화
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		iNum = 10;
		System.out.println("변경된 iNum의 값 : " + iNum);
		
		// 번외
		// 큰 값을 담을 때 가독성 좋게 '_'를 사용할 수 있음
		// 단, 숫자값만 담김
		int etc = 999_999_999;
		System.out.println(etc);
		
	}

	public void namingRule() {
		
		int number;
		
		// 4. 변수 명명 규칙(네이밍룰)
		
		// 1) 변수명 중복 불가 => 중복시 에러
		// short number;
		// 2) 대소문자는 구분
		short numBer;
		
		// 3) 예약어(이미 자바에서 사용되고 있는 키워드들) 사용 불가 => 사용시 에러발생
		//int public;
		//int class;
		//int void;
		
		// 4) 숫자사용 가능하지만 숫자로 시작하는 건 사용 불가 => 사용시 에러발생
		int age1;
		int age2;
		//int 1age;
		
		// 5) 특수문자 사용가능, _와 $만 사용 가능
		int number_1;
		int number$1;
		//int number!1;
		//int number~1;
		
		// 6) 권장사항
		// 낙타표기법
		String username;
		String userName;
		
		// 한글 사용하나 영문으로 사용할 것
		int 점수; // 한글을 사용하지 않는 환경에서는 오류 유발
		int score; 
		
	}
	
	/*
	 * ** 정리 **
	 * 변수 : 값(리터럴)을 기록하기 위한 공간
	 * 
	 * 값(리터럴) : 프로그램상에 필요한 명시적인 값 / 사용자가 마우스 또는 키보드로 입력한 값
	 */
	
}
