#include<bits/stdc++.h>
using namespace std;
int unionarray(int a[], int n, int b[], int m){
    vector<int> v;
    for(int i=0; i<n; i++){
        v.push_back(a[i]);
    }
    for(int i=0; i<n; i++){
        v.push_back(b[i]);
    }
    sort(v.begin(), v.end());
    int temp = v[0];
    int count = 1;

    for(int i=1; i<v.size();i++){
        if(v[i] != temp){
            count++;
            temp = v[i];
        }
    }
    return count;
}
int main(){
    int n=3;
    int m=4;
    int a[] = {1,2,3};
    int b[] = {3,4,2,1};
    cout<<unionarray(a,n,b,m);

    return 0;
}
