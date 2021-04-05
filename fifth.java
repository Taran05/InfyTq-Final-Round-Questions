/* A non-empty input string contains only brackets (,),{,},[,]. It returns output based on :
1.)If the input string is properly nested, then return 0.
2.)If it is not properly nested, then return position of element in the input string (n+1)*/


import java.util.*;
public class Main {
    public static int balancedParenthesis(String s){
       int ans=0,i;
       Stack<Character> store=new Stack<>();
       for(i=0;i<s.length();i++){
           if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
               store.push(s.charAt(i));
           }
           else if(s.charAt(i)=='}'){
               if(!store.empty() && store.peek()=='{'){
                   store.pop();
               }
               else{
                   ans=i+1;
                   break;
               }
           }
           else if(s.charAt(i)==']'){
               if(!store.empty() && store.peek()=='['){
                   store.pop();
               }
               else{
                   ans=i+1;
                   break;
               }
           }
           else if(s.charAt(i)==')'){
               if(!store.empty() && store.peek()=='('){
                   store.pop();
               }
               else{
                   ans=i+1;
                   break;
               }
           }         
       }
         if(!store.empty()){
               ans=i+1;
           }
        return ans;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.print(balancedParenthesis(s));
    }
}
