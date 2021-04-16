/* Given a non-empty string S, the task is to print the longest subsequence from the string S which contains alternating vowels and consonants. 
Note: If multiple such subsequences exist having the same length, print the subsequence having the maximum sum of ASCII values of its characters. */



public class Main {
    public static int isVowel(char c)
    {
        if (c == 'a' || c == 'e'
            || c == 'i' || c == 'o'
            || c == 'u')
            return 1;
        return 0;
    }
    
    public static String lcs(String s){
        int n=s.length();
        int flag=0;
        if(isVowel(s.charAt(0))==1){
            flag=1;
        }
        String ans="";
        int asc=(int)s.charAt(0);
        for(int i=1;i<n;i++){
            if(isVowel(s.charAt(i))==flag){
                asc=Math.max(asc,(int)s.charAt(i));
            }
            else{
                ans+=(char)asc;
                asc=(int)s.charAt(i);
                flag=(flag+1)%2;
            }
        }
        ans+=(char)asc;
        return ans;
    }
    
    public static void main(String[] args) {
        String s="greatness";
        System.out.print(lcs(s));
    }
}
