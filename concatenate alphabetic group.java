/* Given a string, The task is to form group of characters and arrange these groups in ascending order. Print second group from ascending followed by second last group in
ascending */


public class Main {
    public static void main(String[] args) {
       String s="HeLloOWorlDd";
       StringBuilder sb=new StringBuilder(s);
       ArrayList<String> store=new ArrayList<>();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                continue;
            }
            String group=String.valueOf(sb.charAt(i));
            for(int j=i+1;j<sb.length();j++){
                if(Character.toLowerCase(sb.charAt(i))==Character.toLowerCase(sb.charAt(j))){
                    group+=sb.charAt(j);
                    sb.setCharAt(j,' ');
                }
            }
            sb.setCharAt(i,' ');
            store.add(group);
        }
       for(int i=0;i<store.size();i++){
           for(int j=i+1;j<store.size();j++){
               if((store.get(i).toLowerCase()).compareTo(store.get(j).toLowerCase())>0){
                   String temp=store.get(i);
                   store.set(i,store.get(j));
                   store.set(j,temp);
               }
           }
       }
        int n=store.size();
        for(int i=0;i<store.size()/2;i++){
            System.out.print(store.get(i));
            System.out.print(store.get(n-i-1));
        }
        if(store.size()%2!=0){
            System.out.print(store.get(n/2));
        }
   }
}
