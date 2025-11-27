import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        // ok so looking at the examples provided...
        // if a is 4, it prints 3 numbers (1, 3, 5)
        // if a is 5, it prints 5 numbers
        // so if its even, we decrease count by 1 to match the pattern
        
        int n;
        if (a % 2 == 0) {
            n = a - 1; // even case handled here
        } else {
            n = a; // odd case stays same
        }

        int val = 1;
        System.out.print("Output: ");
        
        // looping n times to print the series
        for (int i = 0; i < n; i++) {
            System.out.print(val);
            
            if (i < n - 1) {
                System.out.print(", ");
            }
            val += 2; // incrementing by 2 for odd series
        }
    }
}
