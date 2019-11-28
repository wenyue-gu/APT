import java.util.*;
import java.io.*;
public class SetAside {
    public String common(String[] list) {
        ArrayList<String> s = new ArrayList<String>();
        String str = list[0];
        String[] l = str.split(" ");
        for(int i = 0;i<l.length;i++){
            if(!s.contains(l[i])){
                s.add(l[i]);
            }
        }
        for(int j = 0;j < list.length; j++){
            String t = list[j];
            String [] b = t.split(" ");
            ArrayList<String> k = new ArrayList<String> (Arrays.asList(b));
            s.retainAll(k);
        }
        Collections.sort(s);
        return String.join(" ", s);
    }
}