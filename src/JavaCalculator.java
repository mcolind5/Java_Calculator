import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int selection;
        double num1, num2, ans;
        char symbol;
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("******************");
            System.out.println("Java Calculator");
            System.out.println("******************");

            do {
                System.out.println("""
                        1. Addition
                        2. Subtraction
                        3. Multiplication
                        4. Division
                        5. Modulus
                        
                        Please select an option (1-5): """);

                selection = scanner.nextInt();
                if (selection < 1 || selection > 5) {
                    System.out.println("ERROR, number must be 1-5");
                }

            } while (selection > 5 || selection < 1);


            System.out.println("Please enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.println("Please enter the second number: ");
            num2 = scanner.nextDouble();

            switch (selection) {
                case 1:
                    ans = num1 + num2;
                    symbol = '+';
                    break;
                case 2:
                    ans = num1 - num2;
                    symbol = '-';
                    break;
                case 3:
                    ans = num1 * num2;
                    symbol = '*';
                    break;
                case 4:
                    ans = num1 / num2;
                    symbol = '/';
                    break;
                case 5:
                    ans = num1 % num2;
                    symbol = '%';
                    break;
                default:
                    ans = 0;
                    symbol = '_';
            }
            System.out.println(num1 + " " + symbol + " " + num2 + " = " + ans);
            System.out.println("Reset calculator? (y/n): ");
            char reset = scanner.next().charAt(0);
            if(reset == 'n'){
                isRunning = false;
            }
        }



    }
}
