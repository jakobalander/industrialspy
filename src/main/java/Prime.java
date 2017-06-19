import static java.lang.Math.sqrt;

/**
 * Created by alander on 2017-05-23.
 */
public class Prime {
    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        boolean isPrime = true;
        for(int i=2; i<=sqrt(number); i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return isPrime;
    }
}
