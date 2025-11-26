package se.lexicon;

import java.util.Scanner;

public class calculatorApplication {

    void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double number1 = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        double number2 = scanner.nextInt();

        System.out.println("Please choose the operation: " + " + " + " - " + " * " + " / ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
                case '-':
                    result = number1 - number2;
                    break;
                    case '*':
                        result = number1 * number2;
                        break;
                        case '/':
                            result = number1 / number2;
                            break;

        }
        System.out.println("The result is: " + result);



        boolean isContinue = true;
        while (isContinue) {

            System.out.println("Do you want to continue? (yes/no):");
            String answer = scanner.nextLine();//no
            if (answer.equalsIgnoreCase("no")) {
                isContinue = false;
            }




        }
        System.out.println("Thank you, see you later!");

    }
}
