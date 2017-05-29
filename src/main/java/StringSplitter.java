/**
 * Created by alander on 2017-05-25.
 */
public interface StringSplitter {
    void split(String base, int index);

    char getChar();

    String getRemainder();
}
