#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int check(char pass)
{
	if(pass!='a')
	{
		throw "��й�ȣ Ʋ��";
	}
	int result = 10/2;
	return result;
}

int divide(int a, int b)
{
	try
	{
		if(b==0)
			throw "Error";
		return a/b;
	}catch(...)
	{
		
	}
	return 0;
}

void complexfunction()
{
	cout<<check('a')<<endl;
	try{
		cout<<check('b')<<endl;
	}catch(const char * e)
	{
		cout<<e<<endl;
	}catch(...)
	{
		
	}
	divide(3,0);
	cout<<"����"<<endl;
}

int main(int argc, char** argv) {
	cout<<divide(4,0);
	cout<<"divide����"<<endl;
	complexfunction();
	
	
	
	for(i in arr)
	{
		cout<<i<<endl;
	}
	return 0;
}
