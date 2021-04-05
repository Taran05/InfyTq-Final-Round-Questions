/* Program to reverse a string without duplicates */

public class Main {
    public static void main(String[] args) {
        String s="google";
        String ans="";
        for(String i : s.split("")){
            if(!ans.contains(i)){
                ans=i+ans;
            }
        }
        System.out.print(ans);
     }
 }
