#include <iostream>
#include <cstring>
#include <cstdlib>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

class Dog;

class Dog
{
public:
	Dog(char * name)
	{
		cout<<"������"<<endl;
		myname = strdup(name);
	}
	~Dog()
	{
		cout<<"�Ҹ���"<<endl;
		free(myname);
	}
	void printName()
	{
		cout<<myname<<endl;
	}
	char * myname;
};


int main(int argc, char** argv) {
	cout<<"����"<<endl;
    if(3<4)
    {
    	cout<<"��ü ����"<<endl;
    	char name[] = "dog";
    	Dog dog(name);
    	dog.printName();
    	name[1] = 'e';
    	if(10/2==5)
    	{
    		return 0;
		}
    	dog.printName();
    	
    	cout<<"����"<<endl;

	}
	cout<<"������ ��"<<endl;
	return 0;
}


