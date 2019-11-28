public class CounterAttack {
    public int[] analyze(String str, String[] words) {


        int[] set = new int[words.length];
        String[] j = str.split(" ");

        int i = 0;
        while(i<words.length){
            int k = 0;
            while(k<j.length){
                if(j[k].equals(words[i])){
                    set[i]++;
                }
                k++;
            }

            i++;
        }



        // change this code
        return set;
    }
}