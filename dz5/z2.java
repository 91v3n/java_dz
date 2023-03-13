package dz5;
import java.util.*;

public class z2 {
    public static void main(String[] args) {
        String[] List = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"};

        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String employee : List) {
            String name = employee.split(" ")[0];
            Integer count = nameCountMap.get(name);
            if (count == null) {
                count = 0;
            }
            nameCountMap.put(name, count + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCountMap.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Список повторяющихся имен:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
            }
        }
    }
}
