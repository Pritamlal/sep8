public class pattern10{
    public static void main(String[] args) {
        int n = 5;  // Number of elements in each row
        int start = 1;  // Starting number for each row

        for (int i = 1; i <= 4; i++) {  // Loop for 4 rows
            if (i % 2 == 1) {  // For odd rows (1st and 3rd), print in ascending order
                for (int j = start; j < start + n; j++) {
                    System.out.print(j + " ");
                }
            } else {  // For even rows (2nd and 4th), print in descending order
                for (int j = start + n - 1; j >= start; j--) {
                    System.out.print(j + " ");
                }
            }
            start += n;  // Increment start by n for the next row
            System.out.println();
        }
    }
}
