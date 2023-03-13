package dz5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выбери действие");
            System.out.println("1. Добавить");
            System.out.println("2. Найти");
            System.out.println("3. Выйти");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Имя");
                String name = scanner.nextLine();
                System.out.println("Номер");
                String number = scanner.nextLine();
                phonebook.put(name, number);
                System.out.println("Добавлено");
            } else if (choice.equals("2")) {
                System.out.println("Имя");
                String name = scanner.nextLine();
                String number = phonebook.get(name);
                if (number == null) {
                    System.out.println("Не найдено");
                } else {
                    System.out.println("Номер " + number);
                }
            } else if (choice.equals("3")) {
                System.out.println("Конец");
                break;
            } else {
                System.out.println("Не правильный выбор");
            }
        }
    }
}