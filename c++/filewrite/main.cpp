#include <iostream>
#include <fstream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	ofstream out("out.txt");
	out<<"Hello world"<<endl;
	out<<3;
	out<<'A';
	out<<(void *)&out;
	return 0;
}