package com.yg.variable;

public class C_Constant {
	
	public void finalConstant() {
		// ���� : ���ο� �� ��Ƽ� �� ���� ����
		int age = 20;
		System.out.println("age : " + age);
		
		//age = 21;
		age = age + 1;
		System.out.println("����� age : " + age);
		
		
		// ��� : ���ο� ���� ��Ƽ� �� ���� �Ұ� => �� �� ��� �� ���� �Ұ�(������ ���� ��Ƶ� ��)
		// ����� ������� : ��� ���ڸ� �빮��
		final String BAN = "IŬ����";
		System.out.println("�� : " + BAN);
		
	}

}
