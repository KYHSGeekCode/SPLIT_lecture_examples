package com.split.example;

import java.util.Scanner;

public class ExampleSwitch {
	public void Do()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �ұ��? 1���� ������ �����ͷ� ����˴ϴ�.");
		System.out.println("�� �ұ��? 2���� ������ ��ΰ� �˴ϴ�.");
		System.out.println("�� �ұ��? 3���� ������ ���α׷��� �����ϴ�.");
		
		int choice;
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("�������Դϴ�.");
			break;
		case 2:
			System.out.println("����߽��ϴ�.");
			break;
		case 3:
			System.out.println("���α׷� �����ϴ�.");
			break;
		default: 	//1,2,3�� �ƴ� ��
			System.out.println("�׷� �� �����ϴ�.");
			break;

		}
		
		System.out.println("�� �ұ��? 1�� �Ǵ� 3���� ������ �����ͷ� ����˴ϴ�.");
		System.out.println("�� �ұ��? 2�� �Ǵ� 100���� ������ ��ΰ� �˴ϴ�.");
		System.out.println("�� �ұ��? 4���� ������ ���α׷��� �����ϴ�.");
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		case 3:
			System.out.println("�������Դϴ�.");
			break;
		case 2:
		case 100:
			System.out.println("����߽��ϴ�.");
			break;
		case 4:
			System.out.println("���α׷� �����ϴ�.");
			break;
		default: 	//1,2,3,4,100�� �ƴ� ��
			System.out.println("�׷� �� �����ϴ�.");
			break;

		}	
	}
}
