import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alander on 2017-05-23.
 */
public class PrimeTest {
    @Test
    public void test_isPrime_2_returns_true() throws Exception {
        Assert.assertTrue(Prime.isPrime(2));
    }

    @Test
    public void test_isPrime_13_returns_true() throws Exception {
        Assert.assertTrue(Prime.isPrime(13));
    }

    @Test
    public void test_isPrime_1_returns_false() throws Exception {
        Assert.assertFalse(Prime.isPrime(1));
    }
    @Test
    public void test_isPrime_4_returns_false() throws Exception {
        Assert.assertFalse(Prime.isPrime(4));
    }

    @Test
    public void test_isPrime_15_returns_false() throws Exception {
        Assert.assertFalse(Prime.isPrime(15));
    }

    @Test
    public void test_isPrime_20_returns_false() throws Exception {
        Assert.assertFalse(Prime.isPrime(20));
    }
}