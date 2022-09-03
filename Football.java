import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        if (count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println(count);
    }
}
