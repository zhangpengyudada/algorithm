import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int count = target-nums[i];
            if(map.containsKey(count)){
                return new int[] { map.get(count), i };
            }
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
