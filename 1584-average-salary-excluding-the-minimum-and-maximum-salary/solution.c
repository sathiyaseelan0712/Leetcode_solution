double average(int* salary, int n) {
        int max = salary[0];
        int min = salary[0];
        for (int i=0;i<n;i++){
            if(max<salary[i])
                max=salary[i];
            else if (min>salary[i])
                min=salary[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=salary[i];
        }
        double avg=0;
        avg=sum-(max+min);
        avg/=(n-2);
        return avg;

}
