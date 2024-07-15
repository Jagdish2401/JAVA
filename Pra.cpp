#include<iostream>
using namespace std;
int main()
{
    int n=3;
    int p=n;
    int z=n;
    for(int i=0;i<=n;i++)
    {   if(i<=2)
        {for(int j=n-1;j>i;j--)
        {
            cout<<"1";
        }
        
        for(int k=0;k<p;k++)
        {
            cout<<"*";  
        }
        p--;
        cout<<endl;
        }
        if(i>2){
        for(int i=0;i<n-1;i++){
          for(int j=0;j<=i;j++)
        {
            cout<<"1";
        }
        for(int k=0;k<z-1;k++)
        {
            cout<<"*";  
        }
    z=z+1;
        cout<<endl;
           }   }
    }
    

    return 0;

}