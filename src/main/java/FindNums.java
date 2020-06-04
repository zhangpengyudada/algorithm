public class FindNums {
    //二维数组的查找是否存在指定数字
    public boolean findNums(int[][] nums,int taret){
        if((nums.length==0 || nums==null)||(nums.length==1&&nums[0].length==0))return false;
        int i=0;
        int j=nums[0].length-1;
        while (i<=nums.length-1 && j>=0){
            //先判断是否相等，否则可能越界
            if(taret==nums[i][j])return true;
            if (taret>nums[i][j])i++;
            else if (taret<nums[i][j])j--;
        }
        return false;
    }
}
