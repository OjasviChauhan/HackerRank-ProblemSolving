#include<stdio.h>
#include<stdlib.h>

int divisibleSumPairs(int n, int k, int* arr)
{
    int i,j,count=0;
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if((arr[i]+arr[j])%k == 0)
            count++;
        }
    }
return count;
}
int main()
{
    int n,k,count=0;
    //printf("Enter the size of array\n");
    scanf("%d",&n);
    int arr[n];
   //printf("Enter the number from which we have to divide\n");
    scanf("%d",&k);
    //printf("Enter the array");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    count = divisibleSumPairs(n,k,arr);
    printf("%d",count);
    return 0;
}
