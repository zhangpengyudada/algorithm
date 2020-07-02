public class 爬楼梯 {

    public  static int climbStairs(int n) {
      int[] lt=new int[n+1];
      lt[0]=1;
      lt[1]=1;
      for (int i=2;i<n;i++){
          lt[i]=lt[i-1]+lt[i-2];
      }
      return lt[n];
    }

    public static void main(String[] args) {
        climbStairs(10);
    }
}
