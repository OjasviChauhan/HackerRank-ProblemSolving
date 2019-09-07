#include <stdio.h>
#include <stdlib.h>

int diagonalDifference(int arr_rows, int arr_columns, int** arr)
{
    int k=0,l=0,p;
    for(int i=0;i<arr_rows;i++)
    {
        k=k+arr[i][i];
        l=l+arr[i][arr_rows-1-i];
    }
 p=(k-l);
 if(p<0)
 {return -p;}
 else
 return p;
}

int main()
{
    int n,i;
   // printf("Enter the size of a square matrix\n");
    scanf("%d",&n);
    int **arr;
    arr = malloc(n * sizeof *arr);
    for (i=0; i<n; i++)
    {
        arr[i] = malloc(n * sizeof *arr[i]);
    }
    //printf("Enter the elements in square matrix\n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        scanf("%d",&arr[i][j]);
    }

   // printf("Diagonal difference would be ");
    int Diff = diagonalDifference(n,n,arr);
    printf("%d",Diff);
    return 0;
}