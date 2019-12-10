import java.lang.reflect.Array;
import java.util.*;

public class FriendScore {
    Map<Integer, Set<Integer>> graph;

    public int highestScore(String[] friends) {
        makeGraph(friends);
        int max = 0;

        for (int i = 0; i < friends.length; i++) {
            Set<Integer> set = twoFriends(i);
            max = Math.max(max, set.size());
        }

        return max;
    }

    private Set<Integer> twoFriends(int i) {
        Set<Integer> directFriends = new HashSet<>();
        directFriends.addAll(graph.get(i));

        Set<Integer> twoFriends = new HashSet<>();
        for (Integer f: directFriends) {
            twoFriends.addAll(graph.get(f));
        }

        twoFriends.remove(i);
        twoFriends.addAll(directFriends);
        return twoFriends;

    }

    private void makeGraph(String[] friends) {
        graph = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            String[] s = friends[i].split("");

            graph.put(i, new HashSet<>());

            for(int j = 0; j < s.length; j++) {
                if (s[j].equals("Y"))
                    graph.get(i).add(j);
            }
        }
    }
}