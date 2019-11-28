public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        // fill in code here
        int[] a = new int[strands.length];
        int k = 0;
        while(k<strands.length){
            String element = strands[k];
            int i = 0;
            while(i<element.length()){
                if(element.substring(i, i+1).equals(nuc)){
                    a[k]++;
                }
                i++;
            }
            k++;
        }
        String ans = "";
        if(a[0]!=0){
            ans = strands[0];
        }
        int j = 1;
        int f = 0;
        while(j<strands.length){
            if(a[j]>a[f]){
                ans = strands[j];
                f = j;
            }
            else if(a[j]==a[f]){
                if (a[j] != 0 && a[f] != 0) {
                    if (strands[j].length() > strands[f].length()) {
                        ans = strands[j];
                        f = j;
                    }
                }
            }
            j++;
        }
        return ans;
    }
}