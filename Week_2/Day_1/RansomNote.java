import java.util.*;
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1 = new int[26];
        for (char c:ransomNote.toCharArray()) {
            int idx = c-'a';
            freq1[idx]=freq1[idx] + 1;
        }
        for (char c:magazine.toCharArray()) {
            int idx = c-'a';
            freq1[idx]=freq1[idx] - 1;
        }
        for (int i=0; i<freq1.length; i++) {
            if (freq1[i]>0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ransomNote: ");
        String ransomNote = sc.next();
        System.out.print("Enter magazine: ");
        String magazine = sc.next();
        System.out.println(canConstruct(ransomNote, magazine));
        sc.close();
    }
}
