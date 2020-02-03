import java.util.*;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int z = utopianTree(n);
            System.out.println(z);
        }
    }
    static int utopianTree(int n){
        int i,h=1,p=0;
        for(i=1;i<=n;i++){
            if(i%2 != 0) h=2*h;
            else h+=1;
        }
        return h;
    }
}
