public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x%10==0 ||x==0)) return false;
        int revertNum=0;
        while (x>revertNum){
            revertNum=revertNum*10+x%10;
            x/=10;
        }
//        int i=revertNum/10;
        return x==revertNum || x==revertNum/10;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        boolean palindrome = solution.isPalindrome(121);
        System.out.println(palindrome);

    }
}
