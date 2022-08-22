import java.util.*;

//Left Rotation using Recursion
public class Arrays1 {
    public static void main(String[] args) {
        int n;
        int k;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        n = sc.nextInt();
        System.out.println("Enter the number of iterations");
        k = sc.nextInt();
        Integer[] arr1 = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        ArrayList<Integer> numlist = new ArrayList<Integer>();
        Collections.addAll(numlist, arr1);
        System.out.println("Numlist:" + numlist);

        ArrayList<Integer> afterleftrotate = new ArrayList<Integer>();
        afterleftrotate = leftrotate(numlist, k, counter);
        System.out.println("List=" + afterleftrotate);

    }

    static ArrayList<Integer> leftrotate(ArrayList<Integer> numlist, int k, int counter) {

        if (counter == k) {
            return numlist;
        } else {
            int firstnum = numlist.get(0);
            numlist.remove(0);
            numlist.add(firstnum);
            counter++;
            return leftrotate(numlist, k, counter);
        }

    }

}
