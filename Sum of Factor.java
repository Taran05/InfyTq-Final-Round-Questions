/* For a given list of numbers, find it's factors and add the factors then if the sum of all factors are present in the list, return the sum. If it is not present, return -1 */



public class Main {
        public static void main(String[] args) {
        String s="0,1,6";
        String [] temp=s.split(",");
        int sum=0;
        for(String ele : temp){
            int n=Integer.parseInt(ele);
            if(n==1 || n==0){
                sum=1;
            }
            else{
            sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum+=i;
                }
              }
            }
           if(Arrays.asList(temp).contains(String.valueOf(sum))){
                System.out.println(sum);
           }
            else{
             System.out.println(-1);
          }
        } 
    }
}
