import java.util.Arrays;

public class Reverse {
    public  int reverse(int y){
        int reverseSum=0;
        while (y!=0){
            int pop = y % 10;
            if(reverseSum>Integer.MAX_VALUE|| (reverseSum == Integer.MAX_VALUE / 10 && pop > 7) ){
                return 0;
            }else if(reverseSum < Integer.MIN_VALUE / 10 || (reverseSum == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }
            reverseSum=reverseSum*10+pop;
            y/=10;
        }
        return reverseSum;
    }

    public static void main(String[] args) {
       Reverse reverse=new Reverse();
        int i = reverse.reverse(123);
        System.out.println(i);
    }
}
