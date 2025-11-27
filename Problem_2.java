import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        // so the logic is basically printing odd numbers 
        // based on the count given in input
        int num = 1;
        
        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            System.out.print(num);
            
            // just adding comma if its not the last one
            // looks better formatting wise
            if (i < a - 1) {
                System.out.print(", ");
            }
            num = num + 2; // getting next odd number
        }
    }
}
