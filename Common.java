public class Common {
    public int count (String a, String b) {
        int q = 0;
        String[] as = new String[a.length()];
        String[] bs = new String[b.length()];
        while(q<a.length()){
            as[q] = a.substring(q,q+1);
            bs[q] = b.substring(q,q+1);
            q++;
        }
        int count = 0;
        int o = 0;
        while(o<as.length){
            if(isin(as[o], bs)){
                boolean l = true;
                int p = 0;
                while(l){
                    if(bs[p].equals(as[o])){
                        l = false;
                        bs[p] = "";
                    }
                    p++;
                }
                count++;
            }
            o++;
        }
        return count;

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