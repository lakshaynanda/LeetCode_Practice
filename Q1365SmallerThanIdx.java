class Q1365SmallerThanIdx {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];
        int incr=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i)
                {
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }    
            }
            res[i]=count;
        }
    return res;
    }
}