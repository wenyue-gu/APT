public class WordScore {
    public int[] score(String[] words, String want, String avoid) {
        // replace with your code
        int[] ret = new int[words.length];
        //int[] wan = new int[want.length()];
        //int[] av = new int[avoid.length()];

        //for(int w = 0; w<want.length(); w++){
        //    wan[w] = Character.getNumericValue(want.charAt(w));
        //}






        for(int i = 0; i<words.length; i++){
            int[] temp = new int[words[i].length()];
            for(int j = 0; j<words[i].length(); j++){
                temp[j] = Character.getNumericValue(words[i].charAt(j));
                for(int w = 0; w<want.length(); w++) {
                    int wan = Character.getNumericValue(want.charAt(w));
                    if (Character.getNumericValue(words[i].charAt(j)) == wan){
                        ret[i]+=1;
                        break;
                    }
                }
                for(int a = 0; a<avoid.length(); a++) {
                    int an = Character.getNumericValue(avoid.charAt(a));
                    if (Character.getNumericValue(words[i].charAt(j)) == an){
                        ret[i]-=1;
                        break;
                    }
                }
            }


        }
        return ret;
    }
}