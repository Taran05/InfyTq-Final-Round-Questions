/* Take input from the user in the given format (consists of code and names).
Find the maximum digit from the code which is less than or equal to the length of name and the put the place char in the final string. If their is no any digit found which
satisfies the condition, then simply put 'X*/



import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      for(String e : s.split(",")){
         String temp[]=e.split(":");
          String word=temp[0];
          String num=temp[1];
          int index=-1;
          for(int i=0;i<num.length();i++){
              if(word.length()>=(int)(num.charAt(i)-'0')){
                  index=Math.max(index,(int)(num.charAt(i)-'0'));
              }
          }
          if(index== -1){
              System.out.print('X');
          }
          else{
               System.out.print(word.charAt(index-1));
          }
        }
    }
}
