import java.util.*;
import java.io.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        Set<String> ret = new LinkedHashSet<String>();
        for(String l:list){
            if(l.length()>=minLength){
                    ret.add(l);
            }

        }


        return ret.toArray(new String[ret.size()]);
    }
}