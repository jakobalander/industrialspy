import com.google.common.base.Stopwatch;

import java.util.TreeSet;

/**
 * Created by alander on 2017-05-23.
 */
public class Main {
    public static void main(String[] args) {
        String str = "1276543";
        int primes = 0;
        Stopwatch stopwatch = Stopwatch.createStarted();
        TreeSet<String> perms = new Permutations().createPermuations(str);

        System.out.println(stopwatch.elapsed());
        stopwatch.reset();
        stopwatch.start();
        for(String s : perms) {
            if(Prime.isPrime(Integer.parseInt(s))) {
                primes++;
            }
        }
        System.out.println(stopwatch.elapsed());;
        System.out.println("Number of primes " + primes);
    }
}
