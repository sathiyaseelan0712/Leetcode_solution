class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        long n=nums.length;

        long sn=(n*(n+1))/2;                //sum of n natural numbers
        long s2n=(n*(n+1)*((2*n)+1))/6;     //sum of sqaures of n natural numbers
        
        long s1=0;
        long s2=0;
        for(int i:nums){
            s1+=i;                         //sum of the array elements
            s2+=(long)i * (long)i;         //sum of squares of the array elements

        }
        long val1=(sn-s1);                 //this is basically our x-y equation
        long val2=(s2n-s2);
        val2=val2/val1;                    //this is basically our x+y equation

        long x=(val1+val2)/2;             
        long y= val2-x;                    

        arr[0]=(int)y;
        arr[1]=(int)x;                    
        return arr;
    }
}
