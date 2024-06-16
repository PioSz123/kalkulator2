import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę:");
        double pierwszaLiczba = scanner.nextDouble();

        System.out.println("Wprowadź drugą liczbę:");
        double drugaLiczba = scanner.nextDouble();

        System.out.println("Wybierz operację: +, -, *, /");
        char operacja = scanner.next().charAt(0);

        double wynik;

        switch (operacja) {
            case '+':
                wynik = dodawanie(pierwszaLiczba, drugaLiczba);
                break;
            case '-':
                wynik = odejmowanie(pierwszaLiczba, drugaLiczba);
                break;
            case '*':
                wynik = mnozenie(pierwszaLiczba, drugaLiczba);
                break;
            case '/':
                if (drugaLiczba != 0) {
                    wynik = dzielenie(pierwszaLiczba, drugaLiczba);
                } else {
                    System.out.println("Błąd: Dzielenie przez zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Błąd: Nieznana operacja!");
                scanner.close();
                return;
        }

        System.out.println("Wynik: " + wynik);


        System.out.println("Naciśnij Enter, aby zakończyć program...");
        scanner.nextLine();
        scanner.nextLine();

        scanner.close();
    }

    public static double dodawanie(double a, double b) {
        return a + b;
    }

    public static double odejmowanie(double a, double b) {
        return a - b;
    }

    public static double mnozenie(double a, double b) {
        return a * b;
    }

    public static double dzielenie(double a, double b) {
        return a / b;
    }
}
