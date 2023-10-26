import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите число-действие: ");
        int d = scanner.nextInt();
        scanner.close();


        switch (d) {
            case 1:
                System.out.println("Сумма: " + sum(a,b));
                break;
            case 2:
                System.out.println("Разность: " + razn(a,b));
                break;
            case 3:
                System.out.println("Произведение: " + proizv(a,b));
                break;
            case 4:
                if (b==0){
                    System.out.println("DEL 0");
                    break;
                }
                System.out.println("Частное: " + chast(a,b));
                break;
            default:
                System.out.println("ERROR");
        }
    }
    public static int sum (int a, int b) {
        return a+b;
    }
    public static int razn (int a, int b) {
        return a - b;
    }
    public static int proizv (int a, int b) {
        return a * b;
    }
    public static int chast (int a, int b) {
        return a / b;
    }
}