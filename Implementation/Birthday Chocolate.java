import java.util.*;
class Solution{
    public static void main(String args[]){
        int n,d,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int s[] = new int[n];
        for(int i=0;i<n;i++)
            s[i]=sc.nextInt();
        d = sc.nextInt();
        m = sc.nextInt();
        int z = birthday(d,m,s);
        System.out.println(z);
    }
    static int birthday(int d,int m,int s[]){
        int i,j,count=0,flag=0;
        for(j=0;j<s.length-m+1;j++){
            for(i=j;i<j+m;i++)
                flag += s[i];
            if(flag == d)
                count++;
            flag=0;
        }
        return count;
    }
}
