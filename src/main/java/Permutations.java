import java.util.TreeSet;

/**
 * Created by alander on 2017-05-16.
 */
public class Permutations {

    private final StringSplitter splitter;

    Permutations(StringSplitter splitter) {
        this.splitter = splitter;
    }
    TreeSet<String> createPermuations(String s) {
        TreeSet<String> permutations;
        permutations = recurse(s);
        return permutations;
    }

    private TreeSet<String> recurse(String base) {
        TreeSet<String> set = new TreeSet<>();
        for(int i=0; i<base.length(); i++) {
            splitter.split(base, i);
            TreeSet<String> parts;
            if(splitter.getRemainder().length() > 1) {
                 parts = recurse(splitter.getRemainder());
            } else {
                parts = new TreeSet<>();
                parts.add(splitter.getRemainder());
            }
            for(String str: parts) {
                set.add(splitter.getChar() + str);
            }
        }
        return set;
    }


}
