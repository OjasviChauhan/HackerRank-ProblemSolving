import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h[] = new int[26];
        for(int i=0;i<26;i++)
            h[i] = sc.nextInt();
        String word = sc.next();
        int z = designerPdfViewer(h,word);
        System.out.println(z); 
    }
    static int designerPdfViewer(int h[],String word){
        int i,j,max;
        char alphabets[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int W[] = new int[word.length()];
        for(i=0;i<word.length();i++){
            for(j=0;j<26;j++){
                if(word.charAt(i) == alphabets[j])
                    {
                        W[i] = h[j];
                        break;
                    }
            }
        }
        max = W[0];
        for(i=0;i<W.length;i++){
            if(W[i] > max)max = W[i];
        }
        return max * W.length;
    }
}
