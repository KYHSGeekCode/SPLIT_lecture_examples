#include <iostream>
#include <cstring>
//#include <string.h>

using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

//������ ��Ÿ���� Ŭ������ ����ڽ��ϴ�. 
//���� Ŭ�������� ������ ��ü(instance)�� ���� �ڽ��� ������ ����°� �̸��� ������ �ֽ��ϴ�.
class Animal
{
	protected:
	char  name[16];
	int health;
	public:
		Animal(const char* n, int origHealth = 100)
		{
			cout<<"������ ����_�θ�"<<endl;
			strcpy(name, n);
			health = origHealth;
		}
		int getHealth()
		{
			return health;
		}
		void heal(int amount)
		{
			health +=amount*2;
		}
		void damage(int amount)
		{
			health -= amount;
			if(health <= 0)
				cout<<name<<"�� �׾����ϴ�."<<endl;
		}
		virtual void Say(char * s)
		{
			cout<<s<<endl;
		}
};

class Dog : public Animal
{
	int p;
	public:
		Dog(const char* n, int origHealth = 100):Animal(n,origHealth)
		{
			cout<<"������ ����"<<endl;
			strcpy(name, n);
			health = origHealth;
		}
		
		Dog(const Dog & original)
		{
			this->name = original.name;
			this->health = original.health;  
			this->p = original.p;
		}
		void Say(char * s)
		{
			cout<<"�۸�"<<s<<endl;
		}
		void Bite()
		{
			cout<<"������"<<endl;
		}

};
class Cat : public Animal
{
	public:
		Cat(const char* n, int origHealth = 100):Animal(n, origHealth)
		{
			cout<<"������ ����"<<endl;
			strcpy(name, n);
			health = origHealth;
		}
		
		void Say(char * s)
		{
			cout<<"�߿�"<<s<<endl;
		}
};


int main(int argc, char** argv) {
	Animal *dog = new Dog("������");
	Animal dog2 = new Dog(dog);
	dog->Say("dfs");
	cout<<dog->getHealth()<<endl;
	delete dog;
	return 0;
}
