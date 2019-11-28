public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // fill in code here
        int i = 0;
        long sum = 0;
        int k = sizes.length;
        while(i<k){
            if(sizes[i]%clusterSize!=0){
                sum+= ((sizes[i]/clusterSize)+1)*clusterSize;
            }
            else{
                sum+= sizes[i];
            }
            i++;
        }

        return sum;
    }
}