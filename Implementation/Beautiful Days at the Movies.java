import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int z = beautifulDays(i,j,k);
        System.out.println(z);
    }
    static int beautifulDays(int i,int j,int k){
        int count=0;
        for(int l=i;l<=j;l++){
            if(Math.abs(l-reverse(l))%k == 0)
            count++;
        }
        return count;
    }
    static int reverse(int n){
        int r=0;
        while(n != 0){
            int d = n%10;
            r = r*10 + d;
            n /= 10;
        }
        return r;
    }
}
