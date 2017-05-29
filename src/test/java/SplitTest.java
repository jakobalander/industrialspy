import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alander on 2017-05-21.
 */
public class SplitTest {

    private Split splitter;

    @Before
    public void before() {
        splitter = new Split();
    }

    @Test
    public void testExtractionOfFirstCharacter() throws Exception {
        splitter.split("abcde", 0);
        Assert.assertEquals('a', splitter.getChar());
    }

    @Test
    public void testExtractionOfLastCharacter() throws Exception {
        splitter.split("abcde", 4);
        Assert.assertEquals('e', splitter.getChar());
    }

    @Test
    public void testCompositionOfRemainderWhenFirstCharIsExtracted() throws Exception {
        splitter.split("abcde", 0);
        Assert.assertEquals("bcde", splitter.getRemainder());
    }

    @Test
    public void testCompositionOfRemainderWhenLastCharIsExtracted() throws Exception {
        splitter.split("abcde", 4);
        Assert.assertEquals("abcd", splitter.getRemainder());
    }

    @Test
    public void testCompositionOfRemainderWhenMiddleCharIsExtracted() throws Exception {
        splitter.split("abcde", 2);
        Assert.assertEquals("abde", splitter.getRemainder());
    }
}