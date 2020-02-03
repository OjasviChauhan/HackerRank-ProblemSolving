#include<stdio.h>
void kangaroo(int x1, int v1, int x2, int v2) 
{
int i;
for(i=0;i<=10000;i++)
    {
        if(x1+(i*v1)==x2+(i*v2))
          {  
            printf("YES");
            break;
          }
        else
            continue;
    }
    if(i==10001)
        printf("NO");   
}
int main()
{
    int x1,x2,v1,v2;
 //   printf("Enter the X1 ,V1, X2, V2 values respectively ");
    scanf("%d%d%d%d",&x1,&v1,&x2,&v2);
    kangaroo(x1,v1,x2,v2);
    return 0;
}
