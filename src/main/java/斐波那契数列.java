public class 斐波那契数列 {
    //f(n)=f(n-1)+f(n-2)
    public int Fibonacci(int n) {
        if (n==0)return 0;
        if(n==1|| n==2 )return 1;
        int[] a=new int[n+1];
        a[1]=1;
        a[2]=1;
        for(int i=3;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];

    }

    public static void main(String[] args) {
        斐波那契数列 f=new 斐波那契数列();
        System.out.println(f.Fibonacci(10));

    }
}
