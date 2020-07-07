import java.util.HashMap;
import java.util.Map;

public class 多数元素 {
    /*
    我的想法是首先将数组里面的元素都放入一个数据结构中，遇到重复的值就加一；思来想去感觉 Map 比较适合我的需求。将元素值作为key；循环遍历数组，如果map中没有这个key则将key存入map中，并将value设置为一，；如果存在key，则将value值加一然后存入map。
然后我们循环遍历出map中value值最大的元素，并返回。
     */

    public  int majorityElement(int[] nums){
        HashMap<Integer,Integer> hms=new HashMap<Integer, Integer>(nums.length);

        for (int num:nums){
            if (hms.containsKey(num)){
                int itms=hms.get(num);
                hms.put(num,itms++);
            }else {
              hms.put(num,1);
            }
        }
        //获取最大次数的元素
        int maxKey = -1;
        //获取最大元素的最大次数
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> hm:hms.entrySet()){
            if (hm.getValue()>maxValue){
                maxValue = hm.getValue();
                maxKey=hm.getKey();
            }else {
                return -1;
            }
        }
        if (maxValue <=nums.length/2){
            return  -1;
        }
        return maxKey;
    }
    /*
    摩尔投票法思路
候选人(cand_num)初始化为nums[0]，票数count初始化为1。
当遇到与cand_num相同的数，则票数count = count + 1，否则票数count = count - 1。
当票数count为0时，更换候选人，并将票数count重置为1。
遍历完数组后，cand_num即为最终答案。

为何这行得通呢？
投票法是遇到相同的则票数 + 1，遇到不同的则票数 - 1。
且“多数元素”的个数> ⌊ n/2 ⌋，其余元素的个数总和<= ⌊ n/2 ⌋。
因此“多数元素”的个数 - 其余元素的个数总和 的结果 肯定 >= 1。
这就相当于每个“多数元素”和其他元素 两两相互抵消，抵消到最后肯定还剩余至少1个“多数元素”。

无论数组是1 2 1 2 1，亦或是1 2 2 1 1，总能得到正确的候选人。
     */
    public int majority(int[] nums) {
        int cand_num=nums[0],count=1;
        for (int i=0;i<nums.length;i++){
            if (cand_num==nums[i]){
                ++count;
            }else if (--count==0){
               cand_num=nums[i];
               count=1;
            }
        }
        return  cand_num;
    }

}
