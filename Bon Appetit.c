#include<stdio.h>

void bonAppetit(int n, int k, int* arr, int b)
{
    int i,B=0;
    for(i=0;i<n;i++)
    {
        B=B+arr[i];
    }
    B=B-arr[k];
    B=B/2;
    if(B == b)
    printf("Bon Appetit");
    else
    printf("%d",(b-B));
}
int main()
{
    int n,k,b;
   // printf("Enter size of array\n");
    scanf("%d",&n);
    int arr[n];
    //printf("Enter index ana didnt eat\n");
    scanf("%d",&k);
   // printf("Enter the array\n");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    //printf("Enter charged money\n");
    scanf("%d",&b);
    bonAppetit(n,k,arr,b);
    return 0;
}
