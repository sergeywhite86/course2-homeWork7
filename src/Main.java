import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(-3, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("ball", "sun", "apple", "cat", "cat", "sun"));
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три", "четыре"));
        System.out.println("Task1");
        task1(nums);
        System.out.println();
        System.out.println("Task2");
        task2(nums);
        System.out.println();
        System.out.println("Task3");
        task3(words);
        System.out.println();
        System.out.println("Task4");
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        nums.stream().filter(val -> val % 2 != 0).forEach(val -> System.out.printf("%d ", val));
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> set = new HashSet<>(nums);
        set.stream().filter(val -> val % 2 == 0).sorted().forEach(val -> System.out.printf("%d ", val));
    }

    public static void task3(List<String> words) {
        Set<String> set = new HashSet<>(words);
        set.forEach(word -> System.out.printf("%s ", word));
    }

    public static void task4(List<String> words) {
        Map<String, Integer> countWord = new HashMap<>();
        for (String word : words) {
            int frequency = Collections.frequency(words, word);
            countWord.put(word, frequency);
        }
        for (Map.Entry<String, Integer> word : countWord.entrySet()) {
            if (word.getValue() > 1) {
                System.out.printf("%s - %d повторений/я ", word.getKey(), word.getValue());
            }
        }
    }
}