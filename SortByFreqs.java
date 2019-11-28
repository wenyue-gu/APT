import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {

        HashMap<String, Integer> myMap = new HashMap<>();

        for(String d: data) {
            myMap.putIfAbsent(d, 0);
            myMap.put(d, myMap.get(d) + 1);
        }

        List<HashMap.Entry<String, Integer>> list = new ArrayList<>(myMap.entrySet());
        Collections.sort(list,
                ((Comparator<HashMap.Entry<String, Integer>>) (o1, o2) -> -(o1.getValue()).compareTo(o2.getValue()))
                        .thenComparing(HashMap.Entry::getKey));

        String[] ret = new String[myMap.keySet().size()];

        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i).getKey();
        }

        return ret;

    }
}