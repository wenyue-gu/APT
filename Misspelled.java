import java.util.*;
import java.io.*;


public class Misspelled {
    public int howMany(String[] words, String[] dictionary) {
        // write code here
        int sum = words.length;
        for(int i = 0; i<words.length; i++){
            boolean a = false;
            for(int j = 0;j<dictionary.length;j++) {
                if (words[i].equals(dictionary[j])){
                    a = true;
                    break;
                }
            }
            if(a == true){
                sum = sum-1;
            }

        }


        return sum;
    }




}