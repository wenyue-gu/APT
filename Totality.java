public class Totality {
    public int sum(int[] a, String stype) {
        int n = a.length;
        int num = n/2;
        int i = 0;
        int sum = 0;
        if (stype.equals("odd")){
            while(i<n/2){
                sum = sum + a[2*i+1];
                i++;
            }
        }
        else if (stype.equals("even")){
            if (n%2==0) {
                while (i < n / 2) {
                    sum = sum + a[2 * i];
                    i++;
                }
            }
            else{
                while (i < n / 2 +1) {
                    sum = sum + a[2 * i];
                    i++;
                }
            }
        }
        else{
            while(i<n){
                sum = sum + a[i];
                i++;
            }
        }
        return sum;
    }
}