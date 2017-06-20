import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by alander on 2017-05-23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iterations; i++) {
            String line = sc.nextLine();
            int primes = 0;
            TreeSet<String> perms = new Permutations().createPermuations(line);
            perms.remove("");
            TreeSet<Integer> ints = new TreeSet<>();
            for(String s : perms) {
                ints.add(Integer.parseInt(s));
            }
            for(int num : ints) {
                if(Prime.isPrime(num)) {
                    primes++;
                }
            }
            System.out.println(primes);
        }
    }
}
