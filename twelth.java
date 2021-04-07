/* Given a string containing at least one special character, one even-digit and one odd-digit, return string outstr based on the number of special characters as below:
1) If the number of special characters is odd, append all the odd digits and even digits alternatively to the outstr, starting with the first odd digit.
2) If the number of special characters is even, append all the even digits and odd digits alternatively to the outstr, starting with the first even digit.
After arranging the digits based on the above 2 points, if there are any additional digits remaining, append them at the end of outstr */


public class Main {
    public static String specialString(String s){
        int n=s.length();
        int special=0;
        String odd="";
        String even="";
        String ans="";
        for(int i=0;i<n;i++){
            if(!((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ||       (s.charAt(i)>='0' && s.charAt(i)<='9'))){
                special++;
            }
            else if((s.charAt(i)>='0' && s.charAt(i)<='9')){
                if((int)(s.charAt(i))%2==0){
                    even+=s.charAt(i);
                }
                else{
                    odd+=s.charAt(i);
                }
            }
        }
            int k=0;
            while(k<Math.min(even.length(),odd.length())){
                if(special%2==0){
                    ans+=even.charAt(k);
                    ans+=odd.charAt(k);
                }
                else{
                    ans+=odd.charAt(k);
                    ans+=even.charAt(k);
                }
                k++;
            }
            while(k<even.length()){
                ans+=even.charAt(k);
                k++;
            }
            while(k<odd.length()){
                ans+=odd.charAt(k);
                k++;
            }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String special=specialString(s);
        System.out.print(special);
    }
}
