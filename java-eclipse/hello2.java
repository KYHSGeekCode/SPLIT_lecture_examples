

import java.io.IOException;

public class hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = System.in.read() - 48;
			System.out.println(a);
			
			if(a > 6)
			{
				System.out.println("fdcsf");
				System.out.print("fdcsf");
				
			} else {
				System.out.println("8�� 6���� ũ�� �ʽ��ϴ�.");
			}	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
