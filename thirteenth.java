/* Write a program to find all such numbers which are pronic from the given input. Pronic numbers are those which are product of two consecutive integers. */



public class Main {
    public static boolean isPronic(int n){
        int x=(int)Math.sqrt(n);
        return (x*(x+1)==n) ? true : false;
    }
    public static void main(String[] args) {
        String s="1242";
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPronic(Integer.parseInt(s.substring(i,j)))){
                    al.add(Integer.parseInt(s.substring(i,j)));
                }
            }
        }
          System.out.print(al);
     }
 }
 
