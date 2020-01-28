import java.util.*;
class Solution{
    public static void main(String args[]){
        int n,p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();
        int r = pageCount(n,p);
        System.out.println(r);
    }
    static int pageCount(int n,int p){
        int i,count=0;
        if(n%2==0)
        {
            if(p==1 || p==n)
                return count;
            else if(p >1 && p<=n/2)
            {
                for(i=1 ;i<=n/2;i+=2){
                    if(i>=p)
                        break;
                count++;
                }
            }
            else
            {
                for(i=n;i>n/2;i-=2){
                    if(i<=p)
                        break;
                    count++;
                }
            }
            return count;
        }
        else
        {
            if(p==1 || p==n || p==n-1)
                return count;
            else if(p>1 && p<=n/2)
            {
                for(i=1;i<=n/2;i+=2){
                    if(i>=p)
                        break;
                    count++;
                }
            }
            else
            {
                for(i=n-1;i>n/2;i-=2){
                    if(i<=p)
                        break;
                    count++;
                }
            }
            return count;
        }
    }
}
