/* You are given a list of string each having components to it: words and integers
These components are seperated by ":
1) If the square of the digits in the number component is even, then you must rotate the word to the right by one.
2) If the square of the digits in the number component is odd, then you must roatate the word to the left by two.
Finally print the repeated word */



public class Main {
    public static boolean sumIsEven(String nums){
        int even=0, odd=0;
        for(int i=0;i<nums.length();i++){
            if(Integer.parseInt(String.valueOf(nums.charAt(i)))%2!=0){
                odd++;
            }
        }
        return (odd%2==0);
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String [] temp=s.split(",");
        for(String e : temp){
            String [] sarray=e.split(":");
            int n=sarray[0].length();
            if(sumIsEven(sarray[1])){
            System.out.println(sarray[0].substring(n-1)+sarray[0].substring(0,n-1));
            }
            else{
            System.out.println(sarray[0].substring(2,n)+sarray[0].substring(0,2));
            }
        }
        
    }
}
