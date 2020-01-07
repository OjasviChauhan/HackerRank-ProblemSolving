#include<stdio.h>
void compareTriplets(int a[], int b[])
{
    int i;
    int a_count=0,b_count=0;
    for(i=0;i<3;i++)
    {
        if(a[i] > b[i])
            a_count++;
        else if(a[i] < b[i])
            b_count++;
    }
    int resultArray[2];
    resultArray[0]=a_count;
    resultArray[1]=b_count;
    printf("%d %d",resultArray[0],resultArray[1]);
}
int main()
{
    int a[3],b[3];
    int i;
    for( i=0;i<3;i++)
        scanf("%d",&a[i]);
    for(i=0;i<3;i++)
        scanf("%d",&b[i]);
     compareTriplets(a,b);
    return 0;
}
