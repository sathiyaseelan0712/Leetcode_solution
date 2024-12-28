bool searchMatrix(int** mat, int m, int* n, int target) {
    int left = 0;
    int a = *n;
    int right = m * a - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        int rowidx = mid / a;
        int colidx = mid % a;
        int val = mat[rowidx][colidx];
        if (val == target) {
            return true;
        } else if (val < target) {
            left = mid + 1;
        } else
            right = mid - 1;
    }
    return false;
}
