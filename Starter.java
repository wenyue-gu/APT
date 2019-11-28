public class Starter {
    public int begins(String[] words, String first) {
        // replace this code

        String[] set = new String[words.length];
        int i = 0;
        int s = 0;
        while(i<words.length){
            if(words[i].substring(0,1).equals(first) && !isin(words[i], set)){
                set[s] = words[i];
                s++;

            }
            i++;

        }
        return s;
    }

    public boolean isin(String k, String[] j){
        int i = 0;
        while(i<j.length){
            if(k.equals(j[i])){
                return true;
            }
            i++;
        }
        return false;
    }
}