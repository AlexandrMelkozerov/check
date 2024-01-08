import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Угадайте число от 1 до 10.");
        System.out.print("Введите ваше предположение: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess != secretNumber) {
            if (guess > secretNumber) {
                System.out.println("Ваше число больше, чем загаданное. Введите другое число: ");
            } else if (guess < secretNumber) {
                System.out.println("Ваше число меньше, чем загаданное. Введите другое число: ");
            }
            guess = scanner.nextInt();
        }
        System.out.println("Вы угадали! Это число " + secretNumber + "! ");
    }
}нененен