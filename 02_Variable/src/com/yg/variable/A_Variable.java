package com.yg.variable;

// �ٸ� ��Ű����� ������ �̸��� Ŭ������ ���� �� �ִ�.
public class A_Variable { // com.yg.variable.A_Variable
	
	/*
	 *  * ��ǥ
	 *  1. ������?
	 *  2. ������ �� ��ߵǴ���
	 *  3. ������ ��� ���� �Ǵ���
	 *  4. �������� ��� ������ �Ǵ���
	 */
	
	public void printVariable() {
		
		System.out.println("=== ��������� ===");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println((100 + 10) * 10 - 10);
		System.out.println(((100 + 10) * 10 - 10) / 10);
		// ������� �� ��µǳ� ���� �ǵ����� �ľ��ϱ� ��ƴ�.
		
		
		// 1. ������? ��� ���� �޸𸮻� ����ϱ� ���� �����̴�. / = : ���Կ����� 
		int point = 100; 	// ����Ʈ 
		int bonus = 10;		// ���ʽ�
		int count = 10;		// ������
		int fees = 10;		// ����

		System.out.println("=== ��������� ===");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * count);
		System.out.println((point + bonus) * count - fees);
		System.out.println(((point + bonus) * count - fees) / count);
		
		System.out.println(point);
		
		/*
		 * 2. ������ ����ϴ� ����
		 * - �켱������ ���� �ǹ̸� �ο��ϱ� ���� ���� (������ ����)
		 * - �� �� ���� �����صΰ� ��������� ����� ����
		 * - ���������� �����ϰ� �ϱ� ���� ����
		 */
		
	}
	
	public void declareVariable() { // declare : �����ϴ�
		
		// System.out.println(point); => �ٸ� �޼ҵ�ȿ� �ִ� ����(��������)�� ����� �� ����
		
		/*
		 * 3. ������ ���� (����� ���� ���� ������ �޸� ������ Ȯ���� ���� ���� == ���� ����� ����)
		 * 
		 * [ǥ����] �ڷ��� ������;
		 */
		
	}
	

}
