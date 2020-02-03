import java.util.*;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int z = camelcase(s);
        System.out.println(z);
    }
    static int camelcase(String str){  
        int count = 1;  
        for (int i = 1; i < str.length() - 1; i++) {  
            if (str.charAt(i)>=65&&str.charAt(i)<=90)  
                count++;  
        }  
        return count;  
    } 
}
