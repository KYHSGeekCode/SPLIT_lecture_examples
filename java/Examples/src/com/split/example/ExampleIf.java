package com.split.example;

import java.util.Scanner;

public class ExampleIf {

	public static void Do()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = sc.nextInt();
		
		if(number > 10)
		{
			System.out.println("10���� ū���� �Է��߽��ϴ�.");			
		} else {
			System.out.println("10���� ���� ���� �Է��߽��ϴ�.");
		}
		
		System.out.print("�ѹ� ��!:");
		number = sc.nextInt();
		if(number != 20)
		{
			System.out.println("20�� �ƴ� ���� �Է��߽��ϴ�.");
		} else {
			System.out.println("20�� �Է��߽��ϴ�.");
		}
		
	}
}
