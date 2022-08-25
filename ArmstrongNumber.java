import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int newint = 0;
        int tempvar = n;// stores the value of n so that once n goes through for loop we can check the
                        // new integer after while loop with the old value of n
        int rem;
        while (n > 0) {
            rem = n % 10;
            newint += (rem * rem * rem);
            n = n / 10;
        }
        if (newint == tempvar) {
            System.out.println("The number is an Armstrong Number");
        } else {
            System.out.println("The number is not an Armstrong Number");
        }
    }
}