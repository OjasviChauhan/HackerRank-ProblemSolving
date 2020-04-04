import java.util.*; 
 public class Solution{
     public static void main(String []args)
     {
         int n,k,i;
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         k = sc.nextInt();
         int height[] = new int[n];
         for(i=0;i<n;i++)
         height[i] = sc.nextInt();
         int z = hurdleRace(k,height);
         System.out.println(z);
     }
     static int hurdleRace(int k, int height[])
     {
         int i,j,temp,count=0;
         for(i=0;i<height.length-1;i++){
            for(j=0;j<height.length-i-1;j++)
            {
                if(height[j] > height[j+1])
                {
                temp = height[j+1];
                height[j+1] = height[j];
                height[j] = temp;
                }
            }
         }
         if(height[height.length-1] > k)
         return (height[height.length-1] - k);
         else
         return count;
     }
 }
