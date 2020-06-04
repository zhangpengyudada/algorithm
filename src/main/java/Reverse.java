import java.util.Arrays;

public class Reverse {
    public  int reverse(int y){
        int reverseSum=0;
        //不等于0才走下边
        while (y!=0){
            int pop = y % 10;
            //reverseSum  大于最大值或者reverseSum大于最大值-7
            if(reverseSum>Integer.MAX_VALUE|| (reverseSum == Integer.MAX_VALUE / 10 && pop > 7) ){
                return 0;
                //reverseSum  小于最小值或者reverseSum大于最小值加-8
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
