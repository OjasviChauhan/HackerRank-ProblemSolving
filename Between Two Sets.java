import java.util.*;
class Solution{
    public static void main (String args[]){
        int n,m,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(i=0;i<m;i++)
            b[i] = sc.nextInt();
        int z = getTotalX(a,b); 
        System.out.println(z);
    }
    static int getTotalX(int a[], int b[]){
        int i,j,k,count=0,result=0;
        for(i=a[a.length-1]; i<=b[0]; i++){
           for(j=0;j<a.length;j++)
           {
               if(i % a[j] == 0)
               count++;
           }
           if(count == a.length)
            {
                for(k=0;k<b.length;k++)
                {
                    if(b[k] % i == 0)
                    count++;
                }
            }
        if(count == a.length+b.length) result++;
        count = 0;
        }
        return result;
    }
}
