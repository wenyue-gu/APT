public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        // fill in code here
        int k = 0;
        while(k<orders.length){
            String element = orders[k];
            String[] arr = element.split(" ");
            boolean[] check = new boolean[arr.length];
            int i = 0;
            while(i<arr.length){
                String parts = arr[i];
                for(String items:available){
                    if(parts.equals(items)){
                        check[i] = true;
                    }
                }
                i++;
            }
            int j = 0;
            boolean a = true;
            while(j<check.length){
                if(check[j]==false){
                    a = false;
                }
                j++;
            }
            if(a){
                return k;
            }
            else{
                k++;
            }
        }
        return -1;
    }
}
