import java.util.Scanner;
public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        int[] freq=new int[26];
        for (char c:s.toCharArray()) {
            freq[c-'a']++;
        }
        for (char c:t.toCharArray()) {
            freq[c-'a']--;
        }
        for (int count:freq) {
            if (count!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s=sc.next();
        System.out.print("Enter second string: ");
        String t=sc.next();
        System.out.println(isAnagram(s, t));
        sc.close();
    }
}