#include <stdlib.h>
long k=0;
long aVeryBigSum(int ar_count, long* ar)
{
    for(int i=0;i<ar_count;i++)
        k=k+ar[i];
    return k;
}
int main()
{
  int ar_count;
  printf("Enter the size of array\n");
  scanf("%d",&ar_count);
  
  long ar[ar_count];
  printf("Enter the elements of array\n");
  for(int i=0;i<ar_count;i++)
  scanf("%ld",&ar[i]);

  printf("Sum of the elements of the array would be ");
  long sum=aVeryBigSum(ar_count, ar);
  printf("%ld",sum);
}
