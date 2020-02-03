import java.util.*;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v,n;
        v= sc.nextInt();
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int z = introTutorial(v,a);
        System.out.println(z);
    }
    static int introTutorial(int v,int a[]){
        int i;
        for(i=0;i<a.length;i++)
            if(a[i] == v) break;
        return i;
    }
}
