class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int  i = 0 ;i< n;i++){
            List<Integer> array = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(i == j || j == 0) array.add(1);
                else array.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
            }
            arr.add(array);
        }
        return arr;
    }
}
