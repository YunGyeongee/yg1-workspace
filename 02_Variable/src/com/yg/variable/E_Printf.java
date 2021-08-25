package com.yg.variable;

public class E_Printf {
	
	public void printfMethod() {
		
		/*
			System.out.println();										=> �� ��� �� �� �� ����
			System.out.print();											=> �� ��¸�
			System.out.printf("���������(����)", ������� ����� ��, ��, ...);		=> ����(����)�� ���缭 ������ ��¸� �ϰ� ��
			
			%d : ����
			%f : �Ǽ� --> �Ҽ��� �Ʒ� ����°�ڸ����� ������
			%c : ����(�ѱ���)
			%s : ���ڿ�
		*/
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// ��� : xx, xx
		System.out.println(iNum1 + ", " + iNum2);
		System.out.printf("%d, %d \n", iNum1, iNum2);
		
		// ��� : xx + xx = xxx
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		System.out.printf("%d + %d = %d \n", iNum1, iNum2, iNum1 + iNum2);
		
		System.out.printf("%5d \n", iNum1); // 5ĭ�� ���� �� ������ ����(������ ����)
		
		
		double dNum = 4.57;
		System.out.printf("%f \n", dNum); 
		System.out.printf("%.1f \n", dNum); // .1 : �Ҽ��� �Ʒ� ��°�ڸ����� ����Ұ��� ����(�ݿø�)
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%C %S \n", ch, str); // �빮�ڷ� ��°���
		
	}

}
