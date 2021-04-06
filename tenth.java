/* Input a matrix, check if do we get the same number consecutively atleast 4 times in any fashion(Vertically, Horizontally, Diagonally). Record those sets.
If we get multiple values, then print minimum of them. And, if no such consecutive numbers, then print -1 */



public class Main {
    public static boolean areEqual(int a, int b, int c, int d){
        return(a==b && b==c && c==d &&d==a);
    }
    public static int smallest(ArrayList<Integer> found){
        int small=Integer.MAX_VALUE;
        for(int i:found){
            if(i<small)
                small=i;
        }
        return small;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> found=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                try{
                    if(j<col-3){
                        if(areEqual(mat[i][j],mat[i][j+1],mat[i][j+2],mat[i][j+3])){
                            found.add(mat[i][j]);
                        }
                    }
                    if(i<row-3){
                        if(areEqual(mat[i][j],mat[i+1][j],mat[i+2][j],mat[i+3][j])){
                            found.add(mat[i][j]);
                        }
                    }
                    if(i>=3 || j>=3){
                        if(areEqual(mat[i][j],mat[i-1][j+1],mat[i-2][j+2],mat[i-3][j+3])){
                            found.add(mat[i][j]);
                        }
                    }
                    if(j<col-3 || i>=3){
                        if(areEqual(mat[i][j],mat[i-1][j-1],mat[i-2][j-2],mat[i-3][j-3])){
                            found.add(mat[i][j]);
                    }
                }
            }
                catch(Exception e){
                }
        }
    }
        if(found.size()>0){
            System.out.print(smallest(found));
        }
        else{
            System.out.print("-1");
        }
}
}
