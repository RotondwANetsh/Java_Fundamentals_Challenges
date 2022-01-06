import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char arithOperator;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Mathematical operator: ");
        arithOperator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        if(arithOperator == '+'){
            System.out.println(num1 + " " + arithOperator + " " + num2 + " = " + (num1 + num2));
        }
        else if(arithOperator == '-'){
            System.out.println(num1 + " " + arithOperator + " " + num2 + " = " + (num1 - num2));
        }
        else if(arithOperator == '*'){
            System.out.println(num1 + " " + arithOperator + " " + num2 + " = " + (num1 * num2));
        }
        else if(arithOperator == '/'){
            System.out.println(num1 + " " + arithOperator + " " + num2 + " = " + (num1 / num2));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
