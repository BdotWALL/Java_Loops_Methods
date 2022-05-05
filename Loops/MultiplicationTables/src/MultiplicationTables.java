import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) throws Exception {   
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();
        int start = 1;
        int end = 11;
        for (int i = start; i < end; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
        }
}
}
