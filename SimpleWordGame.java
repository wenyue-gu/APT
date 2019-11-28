public class SimpleWordGame{
    public int points(String[] player,
                      String[] dictionary) {
        // you write code here
        int i = 0;
        int n = 0;
        int sum = 0;
        String[] set = new String[player.length];
        while (i<player.length){
            if(isin(player[i], dictionary) && !isin(player[i], set)){
                set[n] = player[i];
                sum = sum + player[i].length()*player[i].length();
                n++;
            }
            i++;

        }
        return sum;


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