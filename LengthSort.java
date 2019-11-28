import java.util.Arrays;
import java.util.Comparator;

public class LengthSort {
    public String[] rearrange(String[] values){
        Comp comparator = new Comp();
        Arrays.sort(values, comparator);
        return values;
    }

    public class Comp implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            }
            return o1.compareTo(o2);
        }
    }
}