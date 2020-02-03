#include<stdio.h>
void breakingRecords(int n, int* scores) 
{
    int i,h=scores[0],l=scores[0],count1=0,count2=0;
    for(i=0;i<n-1;i++)
    {
        if(scores[i]<scores[i+1])
           {
                if(scores[i+1]>h)
                {
                    h=scores[i+1];
                    count1++;
                }
           }
        else if(scores[i]>scores[i+1])
              {
                  if(scores[i+1]<l)
                  {
                      l=scores[i+1];
                      count2++;
                  }
              }
             else continue;
    }
    printf("%d %d",count1,count2);
}

int main()
{
    int n;
//   printf("Enter the number of games ");
    scanf("%d",&n);
    int scores[n];
//    printf("Enter the scores of all games ");
    for(int i;i<n;i++)
        scanf("%d",&scores[i]);
    breakingRecords(n,scores);
    return 0;
}
