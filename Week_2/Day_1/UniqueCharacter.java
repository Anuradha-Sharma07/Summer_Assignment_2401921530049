import java.util.*;
public class UniqueCharacter{
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i=0; i<s.length();i++) {
            if (map.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.next();
        System.out.println(firstUniqChar(s));
        sc.close();
    }
}
