/* Write a program to find all such numbers which are pronic from the given input. Pronic numbers are those which are product of two consecutive integers. */



public class Main {
    public static boolean isPronic(int n){
        int x=(int)Math.sqrt(n);
        return (x*(x+1)==n) ? true : false;
    }
    public static void main(String[] args) {
        String s="93012562";
        TreeSet<Integer> al=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                al.add(Integer.parseInt(s.substring(i,j)));
            }
        }
        for(int e : al){
           if(isPronic(e)){
               System.out.print(e+" ");
           }
        }
    }
}
