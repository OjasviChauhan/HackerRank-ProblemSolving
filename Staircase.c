#include<stdio.h>
#include<stdlib.h>
void staircase(int n) 
{
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<n-(i+1);j++)
        {
            printf(" ");
        }
        for(int k=0;k<=i;k++)
            printf("#");
        if(i<n-1)
        printf("\n");
        else
        break;
    }
}
int main()
{
   int n;
   //printf("Enter the size of stair\n");
   scanf("%d",&n);
   staircase(n);
   return 0;
}
