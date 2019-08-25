#include<iostream>
using namespace std;
class test_static{
private:
const int i=256;
public:
void call(){
    int i=0;
    // this->i=i;
    cout<<i<<"\n";
    cout<<this->i;
    }
}obj;

int main(){
    obj.call();
}