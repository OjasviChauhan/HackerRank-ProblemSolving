import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int z[] = cutTheSticks(a);
        System.out.println(a.length);
        for(int i=0;i<n;i++)
            if(z[i] != 0)
            System.out.println(z[i]);
    }
    static int[] cutTheSticks(int a[]){
        int i,j=0,count=0,p=0;
        int flag[] = new int[a.length];
        int z[] = new int[a.length];
        Arrays.sort(a);
        while(!Arrays.equals(a,flag)){
            int k = a[p];
            for(i=p;i<a.length;i++){
            a[i] -= k;
            }
            for(i=0;i<a.length;i++)
                if(a[i]>0) count++;
                z[j] = count;
                j++; 
                p = a.length - count;
                count=0;
        }
        return z;
    }
}
