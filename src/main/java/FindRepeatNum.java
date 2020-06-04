import java.util.HashSet;

public class FindRepeatNum {
    //找出重复的数组
    public  int findRepeatNum(int[] nums){
        HashSet<Integer> hashSet=new HashSet();
        int res=-1;
        for (int num:nums){
            if (!hashSet.add(num)){
                res=num;
                System.out.println(res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4,4,5};
        FindRepeatNum findRepeatNum=new FindRepeatNum();
        findRepeatNum.findRepeatNum(nums);
    }
}
