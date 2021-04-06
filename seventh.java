/* Take user from the user in the given format(consist of name and code). 
Find the sum of square of digits from code. If the sum of squares of digits of the code are:-
EVEN->Then add the last 2 characters in the begining.
ODD->Then add first character at the end. */


public class Main {
    public static int getLength(String s){
        int length=0;
        for(int i=0;i<s.length();i++){
            try{
                if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z')){
                    length++;
                }
             }
            catch(Exception e){
                break;
            }
         }
        return length;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       for(String word:s.split(",")){
           int sum=0;
           String ans="";
           int length=getLength(word);
           String reduced=word.substring(length+1,word.length());
           for(int i=0;i<reduced.length();i++){
               sum+=Math.pow((int)(reduced.charAt(i)-'0'),2);
           }
           if(sum%2==0){
               ans=word.substring(length-2,length)+word.substring(0,length-2);
           }
           else{
               ans=word.substring(1,length-1)+word.substring(0,1);
           }
           System.out.print(ans+" ");
       } 
    }
