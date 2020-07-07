public class 丑数 {
    public boolean isUgly(int num) {
        int[] nums={2,3,5};
        for (int n:nums){
            while (num%n==0){
               num= num/n;
            }
        }
        if (num==1){
            return  true;
        }
        return false;
    }
}
