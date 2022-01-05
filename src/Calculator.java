import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String a;
    static String b;
    static String c;
    static String[] data;

    static {
        try {
            System.out.println("Input");
            data = reader.readLine().replaceAll("\\s+", "").split("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        a = data[0]; // first num
        b = data[1]; // operand
        c = data[2]; // second num
    }


    public static void main(String[] args) throws IOException {
        int input1 = getNum1();
        char operand = getOperand();
        int input2 = getNum2();

        int res = calculation(input1,input2,operand);
        System.out.println("Output " + res);

    }


    public static int getNum1() throws IOException {
        if(!a.isEmpty()) {
            int num1 = Integer.parseInt(a);
            return num1;
        }
        else if(a.equals(RomanNumeral.values())){
            int num1 = a.
        }
        else System.out.println("Error, while entering first num. Try again");
        int num1 = getNum1(); // рекурсия
        return num1;
    }

    public static int getNum2() throws IOException {
        if (!c.isEmpty()) {
            int num2 = Integer.parseInt(c);
        }
        else System.out.println("Error, while entering second num. Try again");
        int num2 = getNum2();

        return num2;
    }

    public static char getOperand() {
        char operand;
        if (!b.isEmpty()) {
            operand = b.charAt(0);
            return operand;
        }
        else System.out.println("Error, while entering operand. Try again");
        operand = getOperand();
        return operand;
    }

    public static int GetRomanNumber(){
        int romanNum;
        for (RomanNumeral r :
                RomanNumeral.values()) {
            if (r.equals(RomanNumeral.I)) {
                romanNum = RomanNumeral.I.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.II)){
                romanNum = RomanNumeral.II.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.III)){
                romanNum = RomanNumeral.III.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.IV)){
                romanNum = RomanNumeral.IV.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.V)){
                romanNum = RomanNumeral.V.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.VI)){
                romanNum = RomanNumeral.VI.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.VII)){
                romanNum = RomanNumeral.VII.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.VIII)){
                romanNum = RomanNumeral.VIII.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.IX)){
                romanNum = RomanNumeral.IX.value;
                return romanNum;
            }
            else if (r.equals(RomanNumeral.X)){
                romanNum = RomanNumeral.X.value;
                return romanNum;
            }
        }
        return 0;
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