package com.yg.variable;

public class E_Printf {
	
	public void printfMethod() {
		
		/*
			System.out.println();										=> 값 출력 후 한 줄 띄어쓰기
			System.out.print();											=> 값 출력만
			System.out.printf("출력할형식(포맷)", 순서대로 출력할 값, 값, ...);		=> 포맷(형식)에 맞춰서 값들이 출력만 하고 끝
			
			%d : 정수
			%f : 실수 --> 소수점 아래 여섯째자리까지 보여줌
			%c : 문자(한글자)
			%s : 문자열
		*/
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 출력 : xx, xx
		System.out.println(iNum1 + ", " + iNum2);
		System.out.printf("%d, %d \n", iNum1, iNum2);
		
		// 출력 : xx + xx = xxx
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		System.out.printf("%d + %d = %d \n", iNum1, iNum2, iNum1 + iNum2);
		
		System.out.printf("%5d \n", iNum1); // 5칸의 공간 중 오른쪽 정렬(음수면 왼쪽)
		
		
		double dNum = 4.57;
		System.out.printf("%f \n", dNum); 
		System.out.printf("%.1f \n", dNum); // .1 : 소수점 아래 몇째자리까지 출력할건지 지정(반올림)
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%C %S \n", ch, str); // 대문자로 출력가능
		
	}

}
