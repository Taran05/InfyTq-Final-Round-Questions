/*Seperate odd place integers in a string. You have to return a 4-digit OTP by squarring the digits.*/
  
  
  public class Main {
    public static void main(String[] args) {
       String s="5624381275";
       String odd="";
        
        int i=0;
       for(String e:s.split("")){
           if(i%2!=0){
               odd+=Math.round(Math.pow(Integer.parseInt(e),2));
           }
           if(odd.length()>=4){
               break;
           }
           i++;
      }
       
       
    }
}
