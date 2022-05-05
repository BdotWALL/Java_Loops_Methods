import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num > 0) {
                System.out.println("Number is  " + num);
                continue;
            }

            if (num == 0){
                System.out.println("Process finished with exit code 0");
                break;
            }
        }
    }
}
