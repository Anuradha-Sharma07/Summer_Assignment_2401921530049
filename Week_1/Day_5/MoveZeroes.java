import java.util.Arrays;
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            res[j] = 0;
            j++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
