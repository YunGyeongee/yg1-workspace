package com.yg.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// ����ڰ� Ű���带 ���� �Է��� ���� ������ �� ������ ����ϴ� ���
	
	public void inputScanner1() {
		
		/*
		 * Ű����� �Է��� ���� �������� ���ؼ��� 
		 * �ڹٿ��� �̹� �����ϰ� �ִ� java.util.Scanner��� Ŭ������ ������ �ִ� �޼ҵ带 �̿��ؾ���
		 * 
		 * �ٸ� Ŭ������ �ִ� �޼ҵ带 ȣ���� ��
		 * 1) Ŭ���� ����(new)
		 * 2) �ش� Ŭ������ �ִ� �޼ҵ� ȣ��
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); // System.in : �Է¹��� ���� ����Ʈ ������ �޾Ƶ��̰ڴ�.
		
		// �����ϰ� ������� ����(�̸�, ����, Ű)�� �Է� �ް� �� �Է¹��� ������ ����ϴ� ���α׷�
		// �Է¹��� ������ ���� ����ؼ� ����
		System.out.print("����� �̸��� �����Դϱ� : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ�(sc.next(), sc.nextLine())
		// sc.next(); => �̷��Ը� �ۼ��ϸ� �Էµ� ���� ������ ���� �ٷ� ����
		//String name = sc.next();
					  // next() : ����ڰ� �Է��� �� �� ���� ���������� ���� �о��
					  //          �ּҰ��� ������ ���Ե� ������ �ִ� ���ڿ����� �������� �ʴ�.
		String name = sc.nextLine();
		
		System.out.print("����� ���̴� �� �� �Դϱ�(���ڸ�) : ");
		int age = sc.nextInt();
				  // nextInt() : ����ڰ� �Է��� �� ������ �о��(������ �ƴ� ���ڸ� ���� �Է��� ��� �����߻�)
		
		System.out.print("����� Ű�� ��cm�Դϱ�(�Ҽ��� ù°�ڸ�����) : ");
		double height = sc.nextDouble();
						// nextDouble() : ����ڰ� �Է��� �� �Ǽ��� �о��(���� ���� �Է��� ��� �����߻�)
		
		System.out.println("�̸� : " + name + ", ���� : " + age + ", Ű : " + height);
		
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		// �̸�, ����, �ּ�, Ű
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(����) : ");
		int age = sc.nextInt();
		
		/*
		 * sc.nextLine() : ���ۿ��� ���� ������ �� '����'�� ����ִ� ������ ����
		 * �� ���� next~() : ���ۿ��� ���� �������� ����('����'�� ������� ���� == '����'�� ������ �������� ��)
		 * 
		 * sc.nextInt() �Ŀ� sc.nextLine() �޼ҵ尡 ȣ��ȴٸ� ���ۿ� �����ִ� ���Ͷ����� sc.nextLine() �ٷ� �����
		 * 
		 * ��� : sc.next~() �޼ҵ� �ڿ� �ٷ� sc.nextLine() �޼ҵ尡 ���� �� ������ ���ۿ� �����ִ� '����'�� ���ִ� ���� �ʿ���
		 * 		=> �� ���̿� sc.nextLine() �޼ҵ带 �� �� �� ȣ�����ֱ�
		 */
		
		// ���ۿ� �����ִ� '����'�� ����ִ� ����
		sc.nextLine();
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		
	}
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� : sc.nextLine();
		// ���� : sc.nextInt();
		// �Ǽ� : sc.nextDouble();
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(��/��) : ");
		//char gender = sc.nextChar(); // nextChar �޼ҵ�� �������� ����
		char gender = sc.nextLine().charAt(0);
		// ����ڰ� �Է��� ���� ���ڿ��� ������ �� �� ���ϴ� �ε����� ���ڰ��� �����ؼ� ���
		// * �ε��� == 0������ ����
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		// =============
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height + "cm");
		
	}

}
