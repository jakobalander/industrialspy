import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

/**
 * Created by alander on 2017-05-16.
 */
public class PermutationsTest {

    private TreeSet<String> abc_permutations;
    private TreeSet<String> aaa_permutations;
    private TreeSet<String> aab_permutations;

    @Before
    public void setup() throws Exception {
        Permutations p = new Permutations();
        abc_permutations = p.createPermuations("abc");
        aaa_permutations = p.createPermuations("aaa");
        aab_permutations = p.createPermuations("aab");
    }

    @Test
    public void checkNumberOfPermutationsOf_abc_is_6() {
        Assert.assertEquals(6, abc_permutations.size());
    }

    @Test
    public void checkPermutationsOf_abc_contains_abc() {
        Assert.assertTrue(abc_permutations.contains("abc"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_acb() {
        Assert.assertTrue(abc_permutations.contains("acb"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_bac() {
        Assert.assertTrue(abc_permutations.contains("bac"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_bca() {
        Assert.assertTrue(abc_permutations.contains("bca"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_cab() {
        Assert.assertTrue(abc_permutations.contains("cab"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_cba() {
        Assert.assertTrue(abc_permutations.contains("cba"));
    }

    @Test
    public void checkNumberOfPermutationsOf_aaa_is_1() {
        Assert.assertEquals(1, aaa_permutations.size());
    }

    @Test
    public void checkPermutationOf_aaa_contains_aaa() {
        Assert.assertTrue(aaa_permutations.contains("aaa"));
    }

    @Test
    public void checkNumberOfPermutationsOf_aab_is_3() {
        Assert.assertEquals(3, aab_permutations.size());
    }

    @Test
    public void checkPermutationsOf_aab_contains_aab() {
        Assert.assertTrue(aab_permutations.contains("abc"));
    }

    @Test
    public void checkPermutationsOf_aab_contains_aba() {
        Assert.assertTrue(aab_permutations.contains("aba"));
    }

    @Test
    public void checkPermutationsOf_aab_contains_baa() {
        Assert.assertTrue(aab_permutations.contains("baa"));
    }
}