import java.util.*;
import java.io.*;

public class Infrequent {
    public String find(String[] phrases){
        // write code here
        int[] p = new int[50];
        String[] h = new String[50];
        int k = 0;
        for(int i = 0; i<phrases.length; i++){
            String[] g = phrases[i].toLowerCase().split(" ");
            for(int j = 0; j<g.length; j++){
                if(isin(g[j],h)==-1){
                    h[k] = g[j];
                    p[k] = 1;
                    k++;
                }
                else{
                    p[isin(g[j],h)]+=1;
                }
            }
        }

        int n = p[0];
        int m = 0;
        for(int l = 1; l<p.length; l++){
            if(p[l]!=0) {
                if (p[l] != p[l - 1] && p[l] != p[l + 1]) {
                    m = l;
                }
            }
        }


        return h[m];
    }
    public int isin(String k, String[] j){
        int i = 0;
        while(i<j.length){
            if(k.equals(j[i])){
                return i;
            }
            i++;
        }
        return -1;
    }}