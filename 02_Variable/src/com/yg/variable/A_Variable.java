package com.yg.variable;

// �ٸ� ��Ű����� ������ �̸��� Ŭ������ ���� �� �ִ�.
public class A_Variable { // com.yg.variable.A_Variable
	
	/*
	 *  * ��ǥ
	 *  1. ������?
	 *  2. ������ �� ��ߵǴ���
	 *  3. ������ ��� ���� �Ǵ���
	 *  4. �������� ��� ������ �Ǵ���(���� ��� ��Ģ == ���ַ̹�)
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
		 * [ǥ����] �ڷ��� ������;
		 * * �ڷ��� : � ���� ��Ƴ���, ��� ������ ũ�⸦ ��Ƴ����� ������ ũ�� �� ����� ���ϴ� �κ�
		 * 
		 * * ���� ����� ������ ��
		 * - �������� ù ���ڴ� �ҹ���, ���� �ܾ�� ���� �ִ� ��� ��Ÿǥ���
		 * - �ش� ����({})�� ������ ������ �ش� ���������� �� �� ���� => �ٸ� �޼ҵ忡���� �� �� ���� == ��������
		 * - �ش� ����({})�� ������ ���������� ���� �Ұ� (�ߺ��ƴٴ� ���� �߻� duplicate)
		 */
		
		// 1. ����
		boolean isTrue; 	// 1byte / ���� ����ִ� ����
		
		// 2. ������
		// 2_1. ������
		byte bNum;			// 1byte
		short sNum;			// 2byte
		int iNum;			// 4byte -> ������ �� ���� ��ǥ���� �ڷ���(�⺻��)
		long lNum;			// 8byte
		
		// 2_2. �Ǽ���
		float fNum;			// 4byte
		double dNum;		// 8byte -> �Ǽ��� �� ���� ��ǥ���� �ڷ���(�⺻��) / float���� �� ��Ȯ�� ���� ���� �� �ֱ� ����
		
		// 3. ������
		char ch;			// 2byte
		
		
		// ------------------------------ �⺻ �ڷ���(8��) ---------------------------------------
		
		// 4. ���ڿ�(���� �ڷ���)
		String str;
		
		
		/*
		 * * ������ �� ����(���)
		 * [ǥ����] ������ = ��;
		 */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; 		// long�� ������ ���� ���� ���� l �Ǵ� L�� ����(L�� �� ����)
		fNum = 4.0f;	// �ݵ�� f�� �ٿ����� (����ȯ ����)
		dNum = 8.0;
		ch = 'A';
		ch = '��';		// �������� �ϳ��� ���� ���� �� ����. ���ڴ� �ݵ�� Ȭ����ǥ
		str = "hello";
		str = "B";
		
		// ** ������ ȣ���ؼ� ��䰪�� ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		// int iNum;
		int a;
		int b;
		int c;
		
	}
	
	public void initVariable() {
		
		/*
		 * ���� �޼ҵ忡���� ���� ���� �Ŀ� ���� �����ߴٸ� ������ ������ ����� ���ÿ� �� ����(�ʱ�ȭ)
		 * [ǥ����] �ڷ��� ������ = ��;
		 */
		
		// �⺻�ڷ���
		// 1. ����
		boolean isTrue = false;
		
		// 2_1. ������(������)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 2_2. ������(�Ǽ���)
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. ����(�ѱ���)��
		char ch = '��';
		
		// �����ڷ���
		// 4. ���ڿ�
		String str = "I������";
		
		// ==> ���� ������ ���ÿ� �� �ʱ�ȭ
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		iNum = 10;
		System.out.println("����� iNum�� �� : " + iNum);
		
		// ����
		// ū ���� ���� �� ������ ���� '_'�� ����� �� ����
		// ��, ���ڰ��� ���
		int etc = 999_999_999;
		System.out.println(etc);
		
	}

	public void namingRule() {
		
		int number;
		
		// 4. ���� ��� ��Ģ(���ַ̹�)
		
		// 1) ������ �ߺ� �Ұ� => �ߺ��� ����
		// short number;
		// 2) ��ҹ��ڴ� ����
		short numBer;
		
		// 3) �����(�̹� �ڹٿ��� ���ǰ� �ִ� Ű�����) ��� �Ұ� => ���� �����߻�
		//int public;
		//int class;
		//int void;
		
		// 4) ���ڻ�� ���������� ���ڷ� �����ϴ� �� ��� �Ұ� => ���� �����߻�
		int age1;
		int age2;
		//int 1age;
		
		// 5) Ư������ ��밡��, _�� $�� ��� ����
		int number_1;
		int number$1;
		//int number!1;
		//int number~1;
		
		// 6) �������
		// ��Ÿǥ���
		String username;
		String userName;
		
		// �ѱ� ����ϳ� �������� ����� ��
		int ����; // �ѱ��� ������� �ʴ� ȯ�濡���� ���� ����
		int score; 
		
	}
	
	/*
	 * ** ���� **
	 * ���� : ��(���ͷ�)�� ����ϱ� ���� ����
	 * 
	 * ��(���ͷ�) : ���α׷��� �ʿ��� ������� �� / ����ڰ� ���콺 �Ǵ� Ű����� �Է��� ��
	 */
	
}
