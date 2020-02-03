import java.util.Scanner;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int z = findDigits(n);
            System.out.println(z);
        }
    }
    static int findDigits(int n){
        int i,count=0,t=n;
        while(t != 0){
        int d = t%10;
        t=t/10;
        if(d != 0 && n%d == 0) count++;
        }
        return count;
    }
}
