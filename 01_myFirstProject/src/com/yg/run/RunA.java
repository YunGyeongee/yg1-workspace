package com.yg.run;

// ����(import)
import com.yg.first.A_MethodPrinter;

public class RunA { // ���ุ�� ����ϴ� ����� Ŭ���� => �������� ��Ű���� �����ϱ� ����
	
	public static void main(String[] args) {
		
		System.out.println("~ ���α׷� ���� ~");
		
		// ���� �޼ҵ带 ȣ�� ���ָ� �� => �޼ҵ��();
		// helloPrint(); --> �⺻������ ���� �� Ŭ�������� �޼ҵ带 ã�� ������ ����
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 �����Ϸ��Ѵٸ� ��� �ؾ��ұ�?
		
		// 1) ������ �޼ҵ尡 �����ִ� Ŭ������ ���� "����(new)" ����� ��
		// [ǥ����] Ŭ������ �뺯���̸� = new Ŭ������();
		
		
		// �ذ���1. �ش� Ŭ������ � ��Ű���� �����ִ��� "Ǯ Ŭ������"�� ����ϴ� ���
		// com.yg.first.A_MethodPrinter a = new com.yg.first.A_MethodPrinter();
		
		// �ذ���2. import (� ��Ű���� �����ִ��� ����) => Ctrl + Shift + O
		A_MethodPrinter a = new A_MethodPrinter();
		
		
		// 2) ���� �� �޼ҵ� ����(ȣ��)
		// [ǥ����] �뺯���̸�.�����Ҹ޼ҵ��();
		a.helloPrint();
		a.seeUPrint();
		a.byePrint();
		
	}

}