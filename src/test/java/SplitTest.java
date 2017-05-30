import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alander on 2017-05-21.
 */
public class SplitTest {

    private Split split_abcde_0;
    private Split split_abcde_2;
    private Split split_abcde_4;

    @Before
    public void before() {
        split_abcde_0 = new Split("abcde", 0);
        split_abcde_2 = new Split("abcde", 2);
        split_abcde_4 = new Split("abcde", 4);

    }

    @Test
    public void testExtractionOfFirstCharacter() throws Exception {
        Assert.assertEquals('a', split_abcde_0.getChar());
    }

    @Test
    public void testExtractionOfLastCharacter() throws Exception {
        Assert.assertEquals('e', split_abcde_4.getChar());
    }

    @Test
    public void testCompositionOfRemainderWhenFirstCharIsExtracted() throws Exception {
        Assert.assertEquals("bcde", split_abcde_0.getRemainder());
    }

    @Test
    public void testCompositionOfRemainderWhenLastCharIsExtracted() throws Exception {
        Assert.assertEquals("abcd", split_abcde_4.getRemainder());
    }

    @Test
    public void testCompositionOfRemainderWhenMiddleCharIsExtracted() throws Exception {
        Assert.assertEquals("abde", split_abcde_2.getRemainder());
    }
}