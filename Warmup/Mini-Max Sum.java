import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long A[]=new long[5];
        for(int i=0;i<5;i++)
            A[i] = sc.nextLong();
        Arrays.sort(A);
        long sum1=0,sum2=0;
        for(int i=0;i<A.length-1;i++) sum1+=A[i];
        for(int i=1;i<A.length;i++) sum2+=A[i];
        System.out.println(sum1+" "+sum2);
    }
}
