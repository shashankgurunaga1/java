import java.util.*;

public class Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        ArrayList<Character> chararr = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {

                chararr.add(s.charAt(i));
            }
        }
        Collections.sort(chararr);
        for (int j = 0; j < chararr.size(); j++) {
            if (j != chararr.size() - 1) {
                s1 = s1 + chararr.get(j) + "+";
            } else {
                s1 = s1 + chararr.get(j);
            }
        }

        System.out.println(s1);
    }
}
