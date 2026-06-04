public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i+1<n && arr[i]<arr[i+1]) {
            i++;
        }
        if (i==0 || i==n-1) {
            return false;
        }
        while (i+1<n && arr[i]>arr[i+1]) {
            i++;
        }
        return i==n-1;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        boolean result = validMountainArray(arr);
        System.out.println(result);
    }
}