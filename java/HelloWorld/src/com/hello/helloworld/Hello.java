// �׳� Ʋ
package com.hello.helloworld;

//���󵵵�
import java.io.IOException;

// Ʋ
public class Hello {

	//���� ����
	//Modifier1 Modifier2 ... MethodName ( argumenttype1 argument1, ...)
	
	//void�� ����ִٴ� �ǵ� ���� ����������
	//String�� ���ε� �� ��?
	//[] arg?
	// ??
	public static void main(String[] args) {
		//���Կ�??
		System.out.println("Hi world!");
		
		//int�� �����?? integer ����
		int iterator = 0 ;
		
		iterator = 0;
		System.out.println(iterator);
		iterator = 5;
		System.out.println(iterator);		
		iterator = iterator + 4;
		
		
		
		
		
		
		
		
		//
		for (iterator = 0 ;							//iterator�� 0 ����
			iterator < 100 ;						//iterator�� 100���� �۴�
			iterator = iterator + 1)				//??
		{
			System.out.println(iterator);
		}
		if(iterator == 100)
			System.out.println("Iterator is 100");
		else
			System.out.println("Iterator is not 100");
			System.out.println("Iterator is :" + iterator);		//������ �ִ�.
		// ����� �ԏ��� �޾� ����.
		System.out.println("Enter a number :");
		//����
		try {
			int ch = System.in.read();
			System.out.println("You wrote : "+ch);
			
		} catch (Exception e) {
			//���� ������ �ִ�.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
