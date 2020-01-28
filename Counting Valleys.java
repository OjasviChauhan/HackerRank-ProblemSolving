import java.util.*;
class Solution{
    public static void main(String args[]){
        int n;
        String s="";
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.next();
        int r=countingValleys(n,s);
        System.out.println(r);
    }
    static int countingValleys(int n,String s){
        int flag=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'U') flag++;
            else 
            {
                flag--;
                if(flag == -1)
                    count++;
            }   
        }
        return count;
    }
}
