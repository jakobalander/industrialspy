import java.util.TreeSet;

/**
 * Created by alander on 2017-05-16.
 */
public class Permutations {

    TreeSet<String> createPermuations(String s) {
        TreeSet<String> permutations;
        permutations = recurse(s);
        return permutations;
    }

    private TreeSet<String> recurse(String base) {
        TreeSet<String> set = new TreeSet<>();
        for(int i=0; i<base.length(); i++) {
            Split split = new Split(base, i);
            TreeSet<String> parts;
            if(split.getRemainder().length() > 1) {
                 parts = recurse(split.getRemainder());
            } else {
                parts = new TreeSet<>();
                parts.add(split.getRemainder());
            }
            for(String str: parts) {
                set.add(split.getChar() + str);
            }
            set.addAll(parts);
        }
        return set;
    }


}
