import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.TreeSet;

/**
 * Created by alander on 2017-05-16.
 */
public class PermutationsTest {

    private TreeSet<String> abc_permutations;
    private TreeSet<String> aaa_permutations;
    private TreeSet<String> aab_permutations;
    private TreeSet<String> a_permutations;

    @Before
    public void setup() throws Exception {
        Permutations p = new Permutations();
        a_permutations = p.createPermuations("a");
        abc_permutations = p.createPermuations("abc");
        aaa_permutations = p.createPermuations("aaa");
        aab_permutations = p.createPermuations("aab");
    }

    @Test
    public void checkNumberOfPermuationsOf_a_is_1() {
        //Assert.assertEquals(1, a_permutations.size());
    }

    @Test
    public void checkPermutationsOf_a_contains_a() {
        Assert.assertTrue(a_permutations.contains("a"));
    }

    @Test
    public void checkNumberOfPermutationsOf_abc_is_6() {
        Assert.assertEquals(15, abc_permutations.size());
    }

    @Test
    public void checkPermutationsOf_abc_contains_a() {
        Assert.assertTrue(abc_permutations.contains("a"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_b() {
        Assert.assertTrue(abc_permutations.contains(""));
    }

    @Test
    public void checkPermutationsOf_abc_contains_c() {
        Assert.assertTrue(abc_permutations.contains("c"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_ab() {
        Assert.assertTrue(abc_permutations.contains("ab"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_ac() {
        Assert.assertTrue(abc_permutations.contains("ac"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_ba() {
        Assert.assertTrue(abc_permutations.contains("ba"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_bc() {
        Assert.assertTrue(abc_permutations.contains("bc"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_ca() {
        Assert.assertTrue(abc_permutations.contains("ca"));
    }

    @Test
    public void checkPermutationsOf_abc_contains_cb() {
        Assert.assertTrue(abc_permutations.contains("cb"));
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
    public void checkNumberOfPermutationsOf_aaa_is_3() {
        Assert.assertEquals(3, aaa_permutations.size());
    }

    @Test
    public void checkPermutationOf_aaa_contains_a() {
        Assert.assertTrue(aaa_permutations.contains("a"));
    }

    @Test
    public void checkPermutationsOf_aaa_contains_aa() {
        Assert.assertTrue(aaa_permutations.contains("aa"));
    }

    @Test
    public void checkPermutationOf_aaa_contains_aaa() {
        Assert.assertTrue(aaa_permutations.contains("aaa"));
    }

    @Test
    public void checkNumberOfPermutationsOf_aab_is_8() {
        Assert.assertEquals(8, aab_permutations.size());
    }

    @Test
    public void checkPermutationsOf_aab_contains_a() {
        Assert.assertTrue(aab_permutations.contains("a"));
    }

    @Test
    public void checkPermutationsOf_aab_contains_b() {
        Assert.assertTrue(aab_permutations.contains("b"));
    }

    @Test
    public void checkPermutationsOf_aab_contains_aa() {
        Assert.assertTrue(aab_permutations.contains("aa"));
    }

    @Test
    public void checkPermutationsOf_aab_contains_ab() {
        Assert.assertTrue(aab_permutations.contains("abe"));
    }

    @Test
    public void checkPermutationsOf_aab_contains_ba() {
        Assert.assertTrue(aab_permutations.contains("ba"));
    }
    @Test
    public void checkPermutationsOf_aab_contains_aab() {
        Assert.assertTrue(aab_permutations.contains("aab"));
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