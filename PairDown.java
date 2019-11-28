import java.util.*;
import java.io.*;
public class PairDown {
    public int[] fold(int[] list) {
        // change this code
        int k = list.length;
        int[] ret;
        if(k%2 == 0){
            ret = new int[k/2];
            for(int z = 0;z< ret.length; z++){
                ret[z] = list[2*z] + list[2*z+1];
            }
        }
        else{
            ret = new int[k/2+1];
            for(int z = 0;z< ret.length-1; z++){
                ret[z] = list[2*z] + list[2*z+1];
            }
            ret[ret.length-1] = list[list.length-1];
        }



        return ret;
    }
}