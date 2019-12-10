import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OlympicCandles{
    public int numberOfNights(int[] candles){
        int k = 1;
        Integer[] candleList = new Integer[candles.length];
        boolean flag = true;

        for (int i = 0; i < candles.length; i++) {
            candleList[i] = candles[i];
        }

        while(true) {
            if (candles.length < k) break;

            Arrays.sort(candleList, Collections.reverseOrder());
            for (int i = 0; i < k; i++) {
                if (candleList[i] <= 0) {
                    flag = false;
                    break;
                }
                else {
                    candleList[i] -= 1;
                }
            }

            if (!flag) break;
            k ++;
        }

        k --;
        return k;

    }

}