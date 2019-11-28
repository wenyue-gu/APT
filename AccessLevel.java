public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        // fill in code here
        String ans = "";
        int num = rights.length;
        int i = 0;
        while(i<num){
            if(rights[i]>=minPermission){
                ans = ans + 'A';
            }
            else{
                ans = ans + 'D';
            }
            i++;
        }
        return ans;
    }
}
