#include <stdio.h>
#include <stdlib.h>

void plusMinus(int arr_count, int arr[])
{
    float arr_countP=0;
    float arr_countN=0;
    float arr_countZ=0;
    for(int i=0;i<arr_count;i++)
    {
        if(arr[i]>0)
        arr_countP++;
        else if(arr[i]<0)
            arr_countN++;
            else
            arr_countZ++;
    }
    float p,n,z;
    p=(arr_countP/arr_count);
    n=(arr_countN/arr_count);
    z=(arr_countZ/arr_count);
    printf("%f\n",p);
    printf("%f\n",n);
    printf("%f\n",z);
}
int main()
{
    int n,i;
    //printf("Enter the size of array\n");
    scanf("%d",&n);
    int arr[n];
    //printf("Enter the elements in array\n");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    plusMinus(n,arr);
    return 0;
}
