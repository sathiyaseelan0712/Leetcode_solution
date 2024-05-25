#include<string.h>
char* reverseVowels(char* a) {
    int n=strlen(a);
    char s[100000];
    int count=0;
    for(int i=n-1;i>=0;i--){
        if( a[i]=='a' || a[i]=='i' || a[i]=='e' || a[i]=='o' || a[i]=='u' ||a[i]=='A' || a[i]=='I' || a[i]=='E' || a[i]=='O' || a[i]=='U')
        {
            s[count++]=a[i];
           
        }
    }
    int c=0;
    for(int i=0;i<n;i++){
        if( a[i]=='a' || a[i]=='i' || a[i]=='e' || a[i]=='o' || a[i]=='u'||  a[i]=='A' || a[i]=='I' || a[i]=='E' || a[i]=='O' || a[i]=='U'){
            a[i]=s[c++];
            
        }
    }
    return a;
}
