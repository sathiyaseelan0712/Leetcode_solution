class Solution {
    public int minSwapsCouples(int[] row) {
        int swap=0;
        for(int i=0; i<row.length; i=i+2)
        {
            int x=row[i];

            if(row[i+1]==(x^1))
            {
                continue;
            }
            swap++;
            for(int j=i+1; j<row.length; j++)
            {
                if(row[j]==(x^1))
                {
                    int temp=row[j];
                    row[j]=row[i+1];
                    row[i+1]=temp;
                    break;
                }
            }
        }
        return swap;

    }
}
