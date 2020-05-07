import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int bill[] = new int[n];
        for(int i=0;i<n;i++)
            bill[i]=sc.nextInt();
        int b= sc.nextInt();
        bonAppetit(bill,k,b);
    }
    static void bonAppetit(int bill[],int k,int b){ 
       int sum=0;
       for(int i=0;i<bill.length;i++) sum += bill[i];
       int B_actual = (sum - bill[k])/2;
       if(b == B_actual) System.out.println("Bon Appetit");
       else System.out.println(b - B_actual);
    }   
}
