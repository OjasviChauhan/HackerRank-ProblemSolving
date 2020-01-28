import java.util.*;
class Solution{
    public static void main(String args[]){
        int b,n,m;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        int kp[] = new int[n];
        int dp[] = new int[m];
        for(int i=0;i<n;i++)    
            kp[i] = sc.nextInt();
        for(int i=0;i<m;i++)
            dp[i] = sc.nextInt();
        int r=getMoneySpent(kp,dp,b);
        System.out.println(r);
    }
    static int getMoneySpent(int kp[],int dp[],int b){
        int i,j,max,count=0,z = -1;
        for(i=0;i<kp.length;i++){
            for(j=0;j<dp.length;j++)
            {
                max = kp[i] + dp[j];
                if(max>count && max<=b)
                    count=max;
            }
        }
        if(count != 0)
            return count;
        else return z;
    }
}
