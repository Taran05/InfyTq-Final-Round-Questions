import java.util.*;
 
public class Main {
 	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[] s = in.next().toCharArray();
		int[] x = new int[m+1];
		int[] y = new int[m+1];
		for(int i=0; i<m; i++){
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			x[i]=a;
			y[i]=b;	
		}   
		ArrayList<TreeSet<Integer>> values = new ArrayList<TreeSet<Integer>>();
		int[] count = new int[n];
        Arrays.fill(count, 0);
		for(int i=0; i<n; i++)
			values.add(new TreeSet<Integer>());
    
		for(int i=0; i<m; i++){
			if(!values.get(x[i]).contains(y[i])){
				values.get(x[i]).add(y[i]);
				count[y[i]]++;
			}
		}
        
		int[][] dp = new int[n][26];
        for(int[] row : dp)
            Arrays.fill(row, 0);
        
		for(int i=0; i<n; i++)
			dp[i][s[i]-'a'] = 1;
		
		int ans = Integer.MIN_VALUE;
		int[] seen = new int[n];
		Queue<Integer> store = new PriorityQueue<Integer>();
		
		for(int i=0; i<n; i++)
			if(count[i] == 0) store.add(i);
        	
		while(!store.isEmpty()){
			int current = store.poll();
			seen[current] = 1;
			Iterator<Integer> itr = values.get(current).iterator();
			while(itr.hasNext()){
				int next_element = itr.next();
				count[next_element]--;
				for(int j=0; j<26; j++){
					dp[next_element][j] = Math.max(dp[next_element][j], dp[current][j] + ((j ==     (s[next_element]-'a')) ? 1 : 0));
					ans = Math.max(ans, dp[next_element][j]);
				}
				
				if(count[next_element] == 0)
					store.add(next_element);
			}
		}
         
		int cycle_present = 0;
		for(int i=0; i<n; i++){
			if(seen[i]==0){
				 cycle_present= 1;
			}
		}
		
		if(cycle_present==0) System.out.println(ans);
		else System.out.println(-1);
	}
}
