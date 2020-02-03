#include<stdio.h>
void gradingStudents(int n, int* grades)
{
    int i;
    for(i=0;i<n;i++)
    {
        if(grades[i]<38)
          grades[i]=grades[i]+0;
        else
        {
            if(grades[i]%5<3)
                grades[i]=grades[i]+0;
            else
            {
                if(grades[i]%5==3)
                grades[i]=grades[i]+2;
                else
                grades[i]=grades[i]+1;
            }
        }
    }
    for(i=0;i<n;i++)
    printf("%d\n",grades[i]);
}
int main()
{
    int i,n;
   // printf("Enter the number of students ");
    scanf("%d",&n);
    int A[n];
   // printf("Enter the grades of students ");
    for(i=0;i<n;i++)
        scanf("%d",&A[i]);
    gradingStudents(n,A);
    return 0;
}
