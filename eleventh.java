/* Given an array with positive numbers. The task is that we find largest subset from array that contains elements which are Fibonacci Numbers. If more than 2 elements exists, then
print it's length, else print -1 */


class Main{ 
public static int longestFib(int a[],int max){
        ArrayList<Integer> al=new ArrayList<Integer>();
        int num1=0;
        al.add(num1);
        int num2=1;
        al.add(num2);
        int sum=0;
        while(num1+num2<=max){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            al.add(sum);
        }
        int length=0;
        for(int i=0;i<a.length;i++){
            if(al.contains(a[i])){
                length++;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=-1;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        int length=longestFib(a,max);
        length=(length > 2) ? length : -1;
        System.out.print(length);
    }
}

