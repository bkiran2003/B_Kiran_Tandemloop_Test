import java.util.Scanner;

public class Problem_1 {

    // yo this is the main calc class
    // basic ops like add sub etc
    public static class Calculator {
        
        public double add(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            // cant divide by zero obviously so adding check
            if (b == 0) {
                System.out.println("cant divide by 0 bro"); 
                return 0;
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        // taking inputs here
        // ngl scanner is kinda annoying sometimes
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        
        System.out.println("Enter operation (+, -, *, /):");
        String op = sc.next();

        double res = 0;

        // switch case is cleaner than if-else fr
        switch(op) {
            case "+": 
                res = calc.add(a, b); 
                break;
            case "-": 
                res = calc.subtract(a, b); 
                break;
            case "*": 
                res = calc.multiply(a, b); 
                break;
            case "/": 
                res = calc.divide(a, b); 
                break;
            default: 
                System.out.println("invalid op provided");
                return;
        }

        System.out.println("Result is: " + res);
    }
}
