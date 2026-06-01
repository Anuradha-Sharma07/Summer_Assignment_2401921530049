import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 8, 15, 2, 5};
        int target = 13;
        int[] result = twosum(nums, target);
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }

    public static int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}