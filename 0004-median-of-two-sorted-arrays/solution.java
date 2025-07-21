class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> list = new ArrayList<>();
        int i = 0,j=0;
        while(i < n && j <m){
            if(nums1[i] < nums2[j]){
                list.add(nums1[i++]);
            }else{
                list.add(nums2[j++]);
            }
        }
        while(i < n) list.add(nums1[i++]);
        while(j < m) list.add(nums2[j++]);
        int total = n+m;
        if(total %2 == 1){
            return list.get(total/2);
        }
        return ((double)(list.get(total/2)) + (double)(list.get(total/2 -1))) / 2.0;
    }
}
