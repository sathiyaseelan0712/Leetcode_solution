class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int i=0,j=0,vowels=0,max=0;
        char ch;
        while(j<k){
            ch=s.charAt(j);
            if(ch=='a'|| ch=='i'|| ch=='e' || ch=='o' || ch=='u')
                vowels++;
            j++;
        }
        max=vowels;
        while(j<n){
            ch=s.charAt(i);
            if(ch=='a'|| ch=='i'|| ch=='e' || ch=='o' || ch=='u')
                vowels--;
            ch=s.charAt(j);
            if(ch=='a'|| ch=='i'|| ch=='e' || ch=='o' || ch=='u')
                vowels++;

            max=Math.max(max,vowels);
            i++;
            j++;
        }
        return max;
    }
}
