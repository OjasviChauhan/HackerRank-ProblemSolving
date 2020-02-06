import java.util.*;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int Q = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[(i+k)%n]=sc.nextInt();
        int q[] = new int[Q];
        for(int i=0;i<Q;i++)
            q[i]=sc.nextInt();
        int z[] = circularArrayRotation(a,k,q);
        for(int i=0;i<Q;i++)
            System.out.println(z[i]);
    }
    static int[] circularArrayRotation(int a[],int k,int q[]){
        int arr[] = new int[q.length]; 
        for(int i=0;i<q.length;i++){
            arr[i] = a[q[i]];
        }
        return arr;
    }
}
