import java.util.*;
class Solution{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int r = migratoryBirds(arr);
        System.out.println(r);
    }
    static int migratoryBirds(int a[]){
        int i,j;
        int count[] = new int[5];
        for(j=1;j<=5;j++){
            for(i=0;i<a.length;i++){
                if(a[i]==j)count[j-1]++;
            }
        }
        int max =count[0];
        int k=0;
        for (i=1;i<5;i++){
            if(count[i]>max)
            {
                max=count[i];
                k=i+1;
            }
        }
        return k;    
    }
}
