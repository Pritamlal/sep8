public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i+" ");
                }
                if(j>i){
                    System.out.print(i+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
