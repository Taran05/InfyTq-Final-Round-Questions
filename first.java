/*A string of comma seperated numbers are given such that the numbers 4 and 7 are already present in the list. Assume that 7 always comes after 4 in the list.
num1=add all numbers which do not lie between 4 and 7 (excluding 4 and 7)
num2=number formerd by concatenating all numbers between 4 and 7 (including 4 and 7)
Output: return num1+num2*/


public class Main {
    public static void main(String[] args) {
        String s="3,1,6,4,2,3,7,2";
        // converting the string into a string array that does not have "," and then converting that into List<String>
        List<String> numbers = Arrays.asList(s.split(","));
       int index_4=numbers.indexOf("4");
       int index_7=numbers.indexOf("7");
        int num1=0;
        String num2="";
        for(int i=0;i<numbers.size();i++){
            if(i<index_4 || i>index_7){
                //Integer.parseInt() for converting String into Integer
                num1+=Integer.parseInt(numbers.get(i));
            }
            else{
                 num2+=numbers.get(i);
            }   
        }
        //Integer.parseInt() for converting String into Integer
        System.out.print(num1+Integer.parseInt(num2));
    }
}
