#include <stdio.h>
#include <stdlib.h>
int i,k=0;

int simpleArraySum(int ar_count, int* ar) 
{
    for(i=0;i<ar_count;i++)
    {
        k=k+ar[i];
    }
    return k;
}

int main()
{
  int ar_count;
 /* printf("Enter the size of array\n");*/
  scanf("%d",&ar_count);
  
  int ar[ar_count];
 /* printf("Enter the elements of array\n");*/
  for(int i=0;i<ar_count;i++)
  scanf("%d",&ar[i]);

  /*printf("Sum of the elements of the array would be ");*/
  int sum=simpleArraySum(ar_count, ar);
  printf("%d",sum);
}
