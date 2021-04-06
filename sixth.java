/* Take input from the user in the given format (consists of code and names).
Find the maximum digit from the code which is less than or equal to the length of name and the put the place char in the final string. If their is no any digit found which
satisfies the condition, then simply put 'X*/



public class Main {
    // This function returns the length of the character part of the main string
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
            int length=getLength(word);
            String reduced=word.substring(length+1,word.length());
            int max=0;
            for(int i=0;i<reduced.length();i++){
                if((int)(reduced.charAt(i)-'0')<=length){
                    max=Math.max(max,(int)(reduced.charAt(i)-'0'));
                }
            }
             if(max==0){
                 System.out.print('X');
             }
            else{
                System.out.print(word.charAt(max-1));
            }
             
        }
    }
}
