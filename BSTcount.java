import java.util.HashMap;

public class BSTcount {
    public long howMany(int[] values) {
        return helpcount(values.length);
    }

    public long helpcount(int size) {
        HashMap<Integer, Long> s = new HashMap<>();
        s.put(0, 1L);
        s.put(1, 1L);

        if (s.containsKey(size)) return s.get(size);
        long total = 0;

        for (int i = 0; i < size; i++) {
            if (!s.containsKey(i)) {
                s.put(i, helpcount(i));
            }
            if (!s.containsKey(size - i - 1)) {
                s.put(size - i - 1, helpcount(size - 1 - i));
            }
            total += s.get(i) * s.get(size - i - 1);
        }

        return total;
    }
}