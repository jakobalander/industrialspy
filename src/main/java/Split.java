/**
 * Created by alander on 2017-05-21.
 */
public class Split {
    private char ch;
    private String remainder;

    Split(String base, int index) {
        split(base, index);
    }

    public void split(String base, int index) {
        ch = base.charAt(index);
        String firstPart = base.substring(0,index);
        String lastPart = "";
        if(index < base.length()) {
            lastPart = base.substring(index+1);
        }
        remainder = firstPart + lastPart;
    }

    public char getChar() {
        return this.ch;
    }

    public String getRemainder() {
        return remainder;
    }
}
