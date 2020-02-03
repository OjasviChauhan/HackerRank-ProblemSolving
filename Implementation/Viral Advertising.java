import java.util.*;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = viralAdvertising(n);
        System.out.println(z);
    }
    static int viralAdvertising(int n){
        int day,shared=5,liked=2,cumulative=2;
        for(day=2;day<=n;day++){
            shared=3*(shared/2);
            liked = shared/2;
            cumulative+=liked;
        }
        return cumulative;
    }
}
