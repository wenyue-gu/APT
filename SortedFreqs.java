import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {

        Map<String, Integer> map = new TreeMap<>();
        for (String s: data) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(String k:map.keySet()){
            result.add(map.get(k));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}