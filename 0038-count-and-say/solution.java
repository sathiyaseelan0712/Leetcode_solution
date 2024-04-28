class Solution {
    public String countAndSay(int n) {
         if(n==1)
        {
            return "1";
        }
        else if(n==2)
        {
            return "11";
        }
        String str="11";
        for(int i=3;i<=n;i++)
        {
            str+="$";
            int len=str.length();
            int count=1;
            String tmp="";
            char[] arr = str.toCharArray();
            for(int j=1;j<len;j++)
            {
                if(arr[j]!=arr[j-1])
                {
                    tmp+=count;
                    tmp+=arr[j-1];
                    count=1;
                }
                else count++;
            }
            str=tmp;
        }
        return str;

    }
}
