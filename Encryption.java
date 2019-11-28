import java.util.*;
import java.io.*;

public class Encryption {
    public String encrypt(String message){
        // you write code here
        String[] c = message.split("");
        String[] c2 = new String[c.length];
        String[] c3 = new String[c.length];
        int ind = 97;
        int i = 0;
        for(String ch:c){
            if(!isin(ch, c3)){
                c2[i] = Character.toString((char)ind);
                c3[i] = ch;
                ind++;
            }
            else{
                int s = find(ch, c3);
                c2[i]=c2[s];
                }
            i++;
        }

        return String.join("", c2);
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

    public int find(String a, String[] b){
        ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(b));
        return s1.indexOf(a);
    }
}