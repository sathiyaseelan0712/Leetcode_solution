bool isSameAfterReversals(int num) {
    int rev = 0, rev2 = 0;
    int temp = num;
    while(temp != 0){
        rev = rev*10 + temp%10;
        temp/=10;
    }
    temp = rev;
    while(temp != 0){
        rev2 = rev2*10 + temp%10;
        temp/=10;
    }
    if(num == rev2) return true;
    else return false;
}

