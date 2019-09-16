#include<stdio.h>
int main(){
    int n;
    float sum = 0.0;                            //this is the key. data type should be 'float' if you want floating point in further calculations
    printf("Enter the number of numbers: ");
    scanf("%d", &n);
    int arr[n];
    int i;
    //take input of numbers
    printf("Enter numbers:");
    for(i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    //print numbers and average
    for(i=0; i<n-1; i++){
        sum = sum+arr[i];
        printf("%d", arr[i]);
    }
    float avg = sum/(n-1);
    printf("%.1f", avg);
    return 0;
}