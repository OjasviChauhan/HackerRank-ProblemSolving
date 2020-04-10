import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int F[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=1;i<=n;i++){
        loop:for(int j=0;j<n;j++){
                if(i==arr[j]){
                    for(int k=0;k<n;k++){
                        if((j+1) == arr[k]){
                        F[i-1]=k+1;
                        break loop;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(F[i]);
    }
}
