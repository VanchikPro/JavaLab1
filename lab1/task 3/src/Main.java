import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        int min;
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        }
        else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        }
        else {
            min = num3;
        }
        System.out.print("Наименьшее число: " + min);
    }
}
