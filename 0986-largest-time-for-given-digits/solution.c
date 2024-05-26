#include <string.h>
void arraySort(int arr[], int n) {
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
int arraysEqual(int arr1[], int arr2[], int length) 
{
    for (int i = 0; i < length; i++) 
    {
        if (arr1[i] != arr2[i]) 
        {
            return 0;
        }
    }
    return 1;
}
char* largestTimeFromDigits(int* arr, int arrSize) 
{
    static char res[6];
    res[0] = '\0';
    arraySort(arr, arrSize);
    for (int i = 23; i >= 0; i--) 
    {
        for (int j = 59; j >= 0; j--) 
        {
            int b[] = {i / 10, i % 10, j / 10, j % 10};
            arraySort(b, 4);
            if (arraysEqual(arr, b, 4)) 
            {
                snprintf(res, sizeof(res), "%02d:%02d", i, j);
                return res;
            }
        }
    }
    return res; 
}


