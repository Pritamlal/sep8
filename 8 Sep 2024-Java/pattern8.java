public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=0;i<n;i++){
            if(i%2==0){
                for(j=1;j<=n;j++){
                    System.out.print(j+" ");
                }
            }
            else{
                for(j=n;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        
    }
}
