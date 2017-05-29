/**
 * Created by alander on 2017-05-21.
 */
public class Split implements StringSplitter {
    private char ch;
    private String remainder;

    @Override
    public void split(String base, int index) {
        ch = base.charAt(index);
        String firstPart = base.substring(0,index);
        String lastPart = "";
        if(index < base.length()) {
            lastPart = base.substring(index+1);
        }
        remainder = firstPart + lastPart;
    }

    @Override
    public char getChar() {
        return this.ch;
    }

    @Override
    public String getRemainder() {
        return remainder;
    }
}
