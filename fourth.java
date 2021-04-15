/*Take a string as input. Seperate all the integers from it. Then take each integer only once and form a largest even number possible. Print largest even number possible and if the
number cannot be made then print -1.*/


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<Integer> nums=new ArrayList<>();
        char [] words=s.toCharArray();
        for(char c : words){
            if(Character.isDigit(c)){
                nums.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        Collections.sort(nums, Collections.reverseOrder());
        int n=nums.size(),i=1;
        if(nums.get(n-1)%2!=0){
            for(i=n-1;i>=0;i--){
                if(nums.get(i)%2==0){
                    int removed=nums.remove(i);
                    nums.add(removed);
                    break;
                }
            }
        }
        if(i<0){
            System.out.print(-1);
        }
        else{
        System.out.print(nums.toString());
        }
      }
 }
 
