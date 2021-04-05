/*Take a string as input. Seperate all the integers from it. Then take each integer only once and form a largest even number possible. Print largest even number possible and if the
number cannot be made then print -1.*/


import java.util.*;
public class Main {
    public static boolean isDigit(String s){
        try{
        int n=Integer.parseInt(s);
        if(n>=0 && n<=9)
            return true;
        }
        catch(Exception e){
            return false;
        }      
        return false;
    }
    public static ArrayList<Integer> getDuplicateRemovedNumbers(String s){
        ArrayList<Integer> output=new ArrayList<>();
        for(String e:s.split("")){
            if(isDigit(e)){
                int n=Integer.parseInt(e);
                if(!output.contains(n)){
                    output.add(n);
                }
            }
        }
        Collections.sort(output,Collections.reverseOrder());
        return output;
    }
    public static String buildLargest(ArrayList<Integer> output){
        String ans="";
        int n=output.size();
        if(!(output.get(n-1)%2==0)){  
            for(int i=n-1;i>=0;i--){
                if(output.get(i)%2==0){
                    int removed=output.remove(i);
                    output.add(removed);
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
                ans+=output.get(i);
            }
        return (ans.equals("")?"-1":ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.print(buildLargest(getDuplicateRemovedNumbers(s)));
       
    }
}
