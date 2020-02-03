import java.util.Scanner;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int j=0;j<n;j++)
                a[j] = sc.nextInt();
            String c = angryProfessor(k,a);
            System.out.println(c);
        }
    }
    static String angryProfessor(int k,int a[]){
        int i,count=0;
        String Y="YES"; String N="NO";
        for(i=0;i<a.length;i++){
            if(a[i] <= 0) count++;
        }
        if(count >= k)
            return N;
        else return Y;
    }
}
