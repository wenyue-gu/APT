import java.util.Arrays;
import java.util.Comparator;

public class Dirsort {
    public String[] sort(String[] dirs) {
        Comp comparator = new Comp();
        Arrays.sort(dirs, comparator);
        return dirs;
    }

    public class Comp implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String[] a = o1.split("/");
            String[] b = o2.split("/");
            if (a.length != b.length) {
                return (a.length > b.length)? 1 : -1;
            }
            for (int i = 0; i < a.length; i++) {
                int t = a[i].compareTo(b[i]);
                if (t != 0) return t;
            }
            return 0;
        }
    }
}