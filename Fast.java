import java.util.*;

public class Fast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s.charAt(i) == (s1.charAt(i))) {
                s2 += '0';
            } else {
                s2 += '1';
            }
        }
        System.out.println(s2);
    }
}
