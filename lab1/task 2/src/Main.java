import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scan.nextDouble();
            if (x>0) {
                double y = Math.pow(x, 5) + Math.pow(Math.log(x), 3) + Math.sqrt(Math.pow(x, 3));
                System.out.println("y = " + y);
            }
            else {
                System.out.print("Необходимо ввести положительное значение x");
            }
    }
}
