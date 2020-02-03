#include<stdio.h>
void countApplesAndOranges(int s, int t, int a, int b, int m, int* apples, int n, int* oranges) 
{
int i,count1=0,count2=0;
for(i=0;i<m;i++)
    apples[i]=apples[i]+a;
for(i=0;i<n;i++)
    oranges[i]=oranges[i]+b;
for(i=0;i<m;i++)
    {
        if(apples[i]>=s && apples[i]<=t)
            count1++;
    }
for(i=0;i<n;i++)
    {
        if(oranges[i]>=s && oranges[i]<=t)
            count2++;
    }
printf("%d\n%d",count1,count2);
}

int main()
{
    int s,t,a,b,m,n,i;
    printf("Enter the starting & ending point of sam's house ");
    scanf("%d%d",&s,&t);
    printf("Enter the positions of the apple and orange trees ");
    scanf("%d%d",&a,&b);
    printf("Enter the size of apple & orange array ");
    scanf("%d%d",&m,&n);
    int apples[m], oranges[n];
    printf("Enter distances at which apples fell ");  
    for(i=0;i<m;i++)
        scanf("%d",&apples[i]);
    printf("Enter the distances at which oranges fell "); 
    for(i=0;i<n;i++)
        scanf("%d",&oranges[i]);  
        countApplesAndOranges(s,t,a,b,m,apples,n,oranges);
return 0;   
}
