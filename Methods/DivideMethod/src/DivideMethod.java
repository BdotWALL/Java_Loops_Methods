import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int numOne = input.nextInt();
        System.out.print("Enter another number:");
        int numTwo = input.nextInt();



        divide(numOne, numTwo);
    }

    public static void  divide(double num1, double num2) {
        double answer = num1/num2;
        System.out.println(num1 + " / " + num2 + " = " + answer);

    }

}
