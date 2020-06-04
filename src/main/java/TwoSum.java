import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        //for循环数组
        for(int i=0;i<nums.length;i++){
            //先用指定的总和减去数组里的值，如果这个值在map里，则符合要求
            int count = target-nums[i];
            //检查map里key键是否有这个值
            if(map.containsKey(count)){
                //如果有的话，说明符合要求
                return new int[] { map.get(count), i };
            }
            //没有的话，用值当map的key键，用数组的key当value键
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("无这两个参数组合");
    }

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[] nums={1,2,3,4,5};
        int[]  key= twoSum.twoSum(nums,3);
        System.out.println(Arrays.toString(key));
    }
}
