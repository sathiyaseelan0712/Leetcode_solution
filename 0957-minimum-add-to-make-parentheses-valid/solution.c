int minAddToMakeValid(char* s) {
    int a=0,b=0;
    int n= strlen(s);
    for(int i=0;i<n;i++){
        if(s[i]=='('){
           a++;
        }
        else if(s[i]==')'){
            if(a>0){
                a--; 
            }
            else{
                b++;
            }
        }
    }
    return a+b;
}
