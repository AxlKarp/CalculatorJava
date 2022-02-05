
import java.io.IOException;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) throws IOException {
        int input1 = getNum();
        char operand = getOperand();
        int input2 = getNum();

        int res = calculation(input1,input2,operand);
        System.out.println("Output " + res);

    }


    public static int getNum() throws IOException {
        System.out.println("Enter num");
        Scanner scanner = new Scanner(System.in );
        int num;
        if(scanner.hasNextLine()) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                return num;
            } else {
                num = RomanNumeral.convert(scanner.nextLine());
            }
        }
        else {
                System.out.println("Error, while entering first num. Try again");
                scanner.next();
                num = getNum();// recursion
            }
        return num;
    }


    public static char getOperand() {
        Scanner scanner = new Scanner(System.in);
        char operand;
        if (scanner.hasNext()) {
            operand = scanner.next().charAt(0);
            return operand;
        }
        else System.out.println("Error, while entering operand. Try again");
        operand = getOperand();
        return operand;
    }


    public static int calculation(int num1, int num2, char operand) {
        int result;
     switch (operand){
         case '+':
             result = num1+num2;
             break;
         case '-'  :
             result = num1 - num2;
             break;
         case '*':
           result = num1*num2;
           break;
         case '/':
             result = num1%num2;
             break;
         default:
             System.out.println("ERROR. Repeat");
    result = calculation(num1, num2, getOperand()); //recursion
     }
     return result;
    }
}