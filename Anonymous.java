public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int sum = 0;
        int[] hl = getCounts(headlines);
        for (String m : messages) {
            int[] ms = getCounts(m.split(" "));
            boolean a = true;
            int i = 97;
            while(i<123){
                if(hl[i]<ms[i]){
                    a = false;
                }
                i++;
            }
            if (a == true) {
                sum += 1;
            }

        }

        // fill in code here
        return sum;
    }

    private int[] getCounts(String[] strings) {
        int[] counts = new int[200];
        for (String s : strings) {
            for (char ch : s.toLowerCase().toCharArray()) {
                counts[ch] += 1;
            }
        }
        return counts;

    }
}
