/*Seperate odd place integers in a string. You have to return a 4-digit OTP by squarring the digits.*/
  
  
 public class Main {
    public static void main(String[] args) {
       String s="5621381275";
        String temp[] = s.split("");
        String ans="";
        for(int i=0;i<temp.length;i++){
            if(i%2!=0){
                ans+=String.valueOf((int)Math.pow(Integer.parseInt(temp[i]),2));
            }
            if(ans.length()>=4){
                break;
            }
        }
        System.out.print(ans.substring(0,4));
    }
}
