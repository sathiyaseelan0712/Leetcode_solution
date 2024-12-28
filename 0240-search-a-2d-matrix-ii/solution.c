

bool searchMatrix(int** mat, int m, int* n, int target){
    // int a = *n;
    int row = m-1;
    int col = 0;
    while(col < *n && row>=0){
        if(mat[row][col] == target){
            return true;
        }
        else if(mat[row][col] < target){
            ++col;
        }
        else{
            --row;
        }
    }
    return false;
    
}
