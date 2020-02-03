import java.util.*;
class Solution{
    public static void main(String args[]){
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ar[] = new int[n];
        for(i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int r = birthdayCakeCandles(ar);
        System.out.println(r);
    }
    static int birthdayCakeCandles(int ar[]){
      int max=ar[0];
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }  
        }
        for(int i=0;i<ar.length;i++){
                if(ar[i]==max){
                    count++;
                }
            }
        return count;
    }
}
