import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Эта программа рассчитывает кинетическую энергию объекта.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите массу объекта в килограммах: ");
        double mass = scanner.nextDouble();
            if (mass <= 0) {
                System.out.println("Ошибка: масса должна быть положительным числом.");
                return;
            }
        System.out.print("Введите скорость объекта в метрах в секунду: ");
        double speed = scanner.nextDouble();
            if (speed < 0) {
                System.out.println("Ошибка: скорость не может быть отрицательной.");
                return;
            }
            double E = (mass * Math.pow(speed, 2))/2;
            System.out.print("Кинетическая энергия объекта в Джоулях: " + E);
    }
}
