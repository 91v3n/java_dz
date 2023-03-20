package FinalDZ;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("Apple", "Macbook Pro", 2.0, 8, 256, 512));
        laptops.add(new Laptop("Dell", "Inspiron 15", 1.8, 4, 128, 256));
        laptops.add(new Laptop("HP", "Pavilion x360", 2.2, 16, 512, 1000));
        laptops.add(new Laptop("Lenovo", "IdeaPad S340", 1.6, 8, 256, 512));
        laptops.add(new Laptop("Acer", "Aspire 5", 2.4, 12, 256, 512));
        laptops.add(new Laptop("Asus", "VivoBook S15", 1.8, 16, 512, 1000));
        laptops.add(new Laptop("Microsoft", "Surface Laptop 4", 2.1, 16, 512, 1000));
        laptops.add(new Laptop("Samsung", "Notebook 9 Pro", 2.0, 16, 512, 1000));
        laptops.add(new Laptop("MSI", "GF75 Thin", 2.3, 16, 512, 1000));
        laptops.add(new Laptop("Razer", "Blade 15", 2.6, 32, 1000, 1000));

        // Вывод списка всех ноутбуков
        for (Laptop laptop : laptops) {
            System.out.println(laptop.getBrand() + " " + laptop.getModel() + " " + laptop.getCpuFrequency() + " GHz "
                    + laptop.getRam() + " GB RAM " + laptop.getGpuMemory() + " GB GPU " + laptop.getHddSize() + " GB HDD");
        }

        // Запрос параметров фильтрации у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите минимальную частоту CPU (в GHz): ");
        double minCpuFrequency = scanner.nextDouble();
        System.out.print("Введите минимальный объем ОЗУ (в GB): ");
        int minRam = scanner.nextInt();
        System.out.print("Введите минимальный объем памяти GPU (в GB): ");
        int minGpuMemory = scanner.nextInt();
        System.out.print("Введите минимальный размер HDD (в GB): ");
        int minHddSize = scanner.nextInt();

        // Вывод списка ноутбуков с заданными характеристиками
        System.out.println("\nСписок ноутбуков с частотой CPU больше " + minCpuFrequency + " GHz, ОЗУ больше " + minRam
                + " GB, памятью GPU больше " + minGpuMemory + " GB и размером HDD больше " + minHddSize + " GB:");

        for (Laptop laptop : laptops) {
            if (laptop.getCpuFrequency() >= minCpuFrequency && laptop.getRam() >= minRam
                    && laptop.getGpuMemory() >= minGpuMemory && laptop.getHddSize() >= minHddSize) {
                System.out.println(laptop.getBrand() + " " + laptop.getModel() + " " + laptop.getCpuFrequency() + " GHz "
                        + laptop.getRam() + " GB RAM " + laptop.getGpuMemory() + " GB GPU " + laptop.getHddSize() + " GB HDD");
            }
        }
    }
}