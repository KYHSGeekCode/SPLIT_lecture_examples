package com.split.example;

import java.util.Arrays;

public class ExampleLoop {
	public static void Do(){
		int [] scores = new int[10];
		scores[0] = 10;
		scores[1] = 45;
		scores[2] = 40;
		scores[3] = 23;
		scores[4] = 89;
		scores[5] = 100;
		scores[6] = 74;
		scores[7] = 26;
		scores[8] = 49;
		scores[9] = 98;
		
		//System.out.println(scores);
		//System.out.println(Arrays.toString(scores));
		
		//���� ���� ���ô�.
		//1. while���� �Ἥ �غ���
		int sum1 = 0;
		int index = 0;
		while(index <10)
		{
			sum1 = sum1 + scores[index];
		}
		System.out.println("���� "+ sum1);
		
		int sum2 = 0;
		//2. �������� for���� �Ἥ �غ���
		for(int i = 0; i<10; i++)
		{
			sum2 = sum2 + scores[i];
			// sum2+=scores[i]�ε� �� �� �ִ�.
		}
		System.out.println("���� "+ sum2);
		
		int sum3 = 0;
		//3. �ֽ� for���� �Ἥ �غ���.
		for(int score : scores)
		{
			sum3 += score;
		}
		System.out.println("���� "+ sum3);
		
		//for�� �� ����
		// for(A;B;C)
		// {
		// 		D;
		// }
		// �̰���
		//
		// A;
		// duck:
		// if(B)
		// {
		// 		D;
		//		C;
		//		goto duck;
		// }
		//
		// ���⼭ goto�� java�� �����ϴ� ���� �ƴ����� ���ظ� ���� ���� ����߽��ϴ�.
		// goto duck; �ϸ� ���� �帧�� duck: ��ġ�� �̵��մϴ�.
		
			
		
	}
}
