public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        int count = n * 2 - 1;
        int i,j;
    for(i=1; i<=count; i++)
    {
        for(j=1; j<=count; j++)
        {
            if(j==i || (j==count - i + 1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }

        System.out.println("\n");
    }

    }
}
