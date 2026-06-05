import java.util.Arrays;
public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] res= new int[heights.length];
        int count=0;
        for (int i=0;i<heights.length;i++) {
            res[i]=heights[i];
        }
        Arrays.sort(heights);
        for (int i=0;i<heights.length;i++) {
            if (res[i]!=heights[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int result = heightChecker(heights);
        System.out.println(result);
    }
}