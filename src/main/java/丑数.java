public class 丑数 {
    public boolean isUgly(int num) {
        /*
        思路：创建一个带2，3，5的数组，然后让n对他们取余，如果取余为0，则表明能整除，除到最后，如果n为1，则表明这个数字n为丑数
         */
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
