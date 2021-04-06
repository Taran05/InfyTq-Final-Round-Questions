/* Given a string s, find the length of the longest prefix which is also a suffix. The prefix and suffix must not overlap.*/


public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int mid=s.length()/2;
        int p1=mid,p2=mid;
        while(p1>0){
            String prefix=s.substring(0,p1);
            String suffix=s.substring((n%2==0)?p2:p2+1,n);
            p1--;
            p2++;
            if(prefix.equals(suffix)){
                System.out.print(prefix.length());
                break;
            }
            
        }
       } 
    }
