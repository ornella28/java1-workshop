package se.lexicon;

import java.util.Scanner;

public class calculatorApplication {

    void main() {

        Scanner scanner = new Scanner(System.in);


        String answer;//for storing yes or no

        do { // the program will perform this code as long as the answer will be yes

            System.out.println("Please enter the first number: ");
            double number1 = scanner.nextDouble();// because i declared a double

            System.out.println("Please enter the second number: ");
            double number2 = scanner.nextDouble();

            System.out.println("Please choose the operation: " + " + " + " - " + " * " + " / ");
            char operation = scanner.next().charAt(0); //to store the mathematic operation

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

            System.out.println("Do you want to continue? (yes/no):");
            answer = scanner.next();


        }  while (answer.equalsIgnoreCase("yes"));
            //isContinue = false;
            System.out.println("Thank you, see you later!");// will print this message if the answer is no



    }
}
