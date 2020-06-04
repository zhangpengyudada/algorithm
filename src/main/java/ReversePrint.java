public class ReversePrint {
    public int[] reversePrint(int[] nums){
        int[] res=new int[nums.length];
        int j=nums.length-1;
        for (int i=0;i<nums.length;i++){
            res[j]=nums[i];
            j--;
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums={1,2};
        ReversePrint reversePrint=new ReversePrint();
        reversePrint.reversePrint(nums);
    }
}
