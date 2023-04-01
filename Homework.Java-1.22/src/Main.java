import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = null;
        Integer num2 = null;

        while (num1 == null) {
            try {
                System.out.print("Introduceti primul numar: ");
                num1 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nu ati introdus un numar valid. Va rugam sa incercati din nou.");
            }
        }

        while (num2 == null) {
            try {
                System.out.print("Introduceti al doilea numar: ");
                num2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nu ati introdus un numar valid. Va rugam sa incercati din nou.");
            }
        }

        int sum = num1 + num2;
        System.out.println("Suma celor doua numere este: " + sum);
    }
}
