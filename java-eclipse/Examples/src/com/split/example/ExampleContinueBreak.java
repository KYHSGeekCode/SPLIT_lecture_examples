package com.split.example;

public class ExampleContinueBreak {
	public void Do()
	{
		int [] data = {10,2,30,40,32,30,123,35,43,432};
		int sum = 0;
		int evenCount = 0;
		
		//¦�� ������ ����. �׿� ���ÿ� ��ҵ��� ���� ���Ѵ�.
		for(int da:data)
		{
			sum = sum + da;
			if(da%2!=0)
			{
				// Ȧ���� ¦�� ������ ���Խ�Ű�� �ʴ´�.
				continue;
			}
			if(da==35)			//35�� ������ ���� ���� ���� �غ���
				break;
			evenCount = evenCount+1;
			
		}
	}
}
