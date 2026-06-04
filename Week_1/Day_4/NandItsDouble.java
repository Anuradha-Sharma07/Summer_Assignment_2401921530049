import java.util.*;
public class NandItsDouble{
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num) ||
                (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        boolean result = checkIfExist(arr);
        System.out.println(result);
    }
}
