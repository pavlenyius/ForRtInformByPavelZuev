import java.util.HashMap;
import java.util.Map;

public class ElementCounter {
    public static Map<Integer, Integer> countElements(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int element : arr) {
            result.merge(element, 1, Integer::sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countElements(arr);
        System.out.println(result); // Вывод: {1=2, 3=1, 4=2, 5=2}
    }
}
