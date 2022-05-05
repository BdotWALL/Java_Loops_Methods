import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int num = scan.nextInt();
        
            if (num != 5) {
                continue;
            }

            if (num == 5) {
            System.out.println("Process finished with exit code 0");
            break;
    }
}
}
}
