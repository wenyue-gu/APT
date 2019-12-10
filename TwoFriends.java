import java.util.*;
public class TwoFriends {
    private Map<Integer, Set<Integer>> myGraph = new TreeMap<>();
    public int highestScore(String[] friends) {
        // you fill in code here
        for(int i = 0; i<friends.length; i++){
            Set<Integer> temp = new TreeSet<>();
            for(int j = 0; j<friends[i].length(); j++){
                if(friends[i].substring(j,j+1).equals("Y")){
                    temp.add(j);
                }
            }
            myGraph.put(i,temp);
        }
        for(int k =0; k<friends.length; k++){
            twoFriends(k);
        }
        int ret = 0;
        for(int k:myGraph.keySet()){
            if(myGraph.get(k).size()>ret){
                ret = myGraph.get(k).size();
            }
        }
        return ret;

    }

    private Set<Integer> twoFriends(int i){
        Set<Integer> set = new TreeSet<>();
        Set<Integer> friends = myGraph.get(i);
        set.addAll(friends);
        for(int friend:friends){
            set.addAll(myGraph.get(friend));
        }
        set.remove(i);
        return set;
    }
}