class Solution {
    // public boolean[] round(boolean[] arr, int n, int x) {
    //     for (int i = 1; i <= n; i++) {
    //         if (i % x == 0)
    //             arr[i - 1] = !arr[i - 1];
    //     }
    //     return arr;
    // }

    // public int checkOn(boolean[] arr, int n) {
    //     int count = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] == true) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public int bulbSwitch(int n) {
    //     boolean[] arr = new boolean[n];
    //     for (int i = 1; i <= n; i++) {
    //         arr = round(arr, n, i);
    //     }
    //     return checkOn(arr, n);
    // }
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}


