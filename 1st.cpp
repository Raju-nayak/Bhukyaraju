#include <iostream>
using namespace std; 
void righttriangle(char a[], int n) 
{ 
    int k = n-1;
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < k; j++) 
            cout << " ";
        k = k - 1; 
        for (int j = 0; j <= i; j++) {
            cout<<a[j];
        } 
        cout << endl; 
    }
} 
int main() 
{ 
	int n=7;
    //cin>>n;
    char s[n]={'s','u','p','r','i','y','a'};
    //cin>>s;
    righttriangle(s,n);
    return 0; 
}
