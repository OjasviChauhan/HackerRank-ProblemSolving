import java.util.*;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int z = pickingNumbers(arr);
        System.out.println(z);
    }
    static int pickingNumbers(int arr[]){
        int i,j,count=0,max=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(arr[j] == arr[i] || arr[j] == arr[i]+1)
                    count++;
            }
            if(count > max)
                max = count;
            count=0;
        }
        return max;
    }
}
