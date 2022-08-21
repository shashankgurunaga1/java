import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 0;
        int n1 = 1;
        int counter = 0;
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        numlist.add(n);
        numlist.add(n1);
        ArrayList<Integer> numlist1 = new ArrayList<Integer>();

        numlist1 = fibonacci(n, n1, numlist, counter);
        for (int i = 0; i < numlist1.size(); i++) {
            System.out.println(numlist1.get(i));
        }

    }

    static ArrayList<Integer> fibonacci(int n, int n1, ArrayList<Integer> numlist, int counter) {
        if (counter == 5) {
            return numlist;
        } else {
            int sum = n + n1;
            n = n1;
            n1 = sum;
            numlist.add(sum);
            counter++;
            return fibonacci(n, n1, numlist, counter);

        }

    }
}
