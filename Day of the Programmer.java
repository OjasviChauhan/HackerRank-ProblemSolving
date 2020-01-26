import java.util.*;
class Solution{
    public static void main(String []args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String k = dayOfProgrammer(n);
        System.out.println(k+n);
    }
    static String dayOfProgrammer(int n){
        if(n == 1918)
            return "26.09.";
        else if((n<=1917 && n%4==0) || (n>1918 && n%400==0) || (n%4==0 && n%100!=0))
                return "12.09.";
            else
                return "13.09.";
    } 
}
