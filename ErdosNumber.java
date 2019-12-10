import java.util.*;

public class ErdosNumber {
    public String[] calculateNumbers(String[] pubs) {
        Map<String, HashSet<String>> map;
        Map<String, Integer> resultMap;

        map = buildMap(pubs);
        resultMap = createResult(map);

        String[] resultArray = new String[resultMap.keySet().size()];
        int index = 0;
        for (String name: resultMap.keySet()) {
            if (resultMap.get(name) == -1)
                resultArray[index] = name;
            else
                resultArray[index] = name + " " + resultMap.get(name);
            index ++;
        }

        return resultArray;
    }

    private Map<String, Integer> createResult(Map<String, HashSet<String>> map) {
        Map<String, Integer> resultMap = new TreeMap<>();

        resultMap.put("ERDOS", 0);
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        ((LinkedList<String>) q).add("ERDOS");
        visited.add("ERDOS");

        while (q.size() > 0) {
            String current = q.remove();
            Integer dist = resultMap.get(current) + 1;
            HashSet<String> neighbors = map.get(current);

            for (String s: neighbors) {
                if (! visited.contains(s)) {
                    resultMap.put(s, dist);
                    visited.add(s);
                    ((LinkedList<String>) q).add(s);
                }
            }
        }

        for (String s: map.keySet()) {
            if (!resultMap.keySet().contains(s)) {
                resultMap.putIfAbsent(s, -1);
            }
        }

        return resultMap;
    }


    private Map<String, HashSet<String>> buildMap(String[] pubs) {
        Map<String, HashSet<String>> map = new TreeMap<>();

        for (String pub: pubs) {
            String[] names = pub.split(" ");

            for (String n: names) {
                map.putIfAbsent(n, new HashSet<String>());
                map.get(n).addAll(Arrays.asList(names));
            }
        }

        for (String s: map.keySet()) {
            map.get(s).remove(s);
        }

        return map;
    }
}