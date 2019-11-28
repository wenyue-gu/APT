import java.util.*;
import java.io.*;

public class Conflicts {
    public String[] conflict(String[] info){
        // write code here
        ArrayList<String> rm = new ArrayList<String>();
        ArrayList<String> t = new ArrayList<String>();

        ArrayList<String> ret = new ArrayList<String>();
        for(int i = 0; i<info.length; i++){
            String[] temp = info[i].split(":");
            if(!rm.contains(temp[1])){
                rm.add(temp[1]);
                t.add(temp[2]);
            }
            else{
                int tem = rm.indexOf(temp[1]);
                String s = t.get(tem) + "," + temp[2];
                t.set(tem,s);
            }
        }

        for(int j = 0; j<t.size();j++){
            String[] temp2 = t.get(j).split(",");
            for(int k = 0; k<temp2.length; k++){
                for(int l = 0; l<temp2.length; l++){
                    if(l!=k && temp2[l].equals(temp2[k]) && !ret.contains(rm.get(j))){
                        ret.add(rm.get(j));
                        break;
                    }
                }
            }
        }
        Collections.sort(ret);
        String[] re = ret.toArray(new String[0]);
        return re;
    }
}