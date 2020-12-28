class Q59MaximumSubArray {
    //Kadane Algorithm
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int max_end = 0;
        for(int i = 0; i < n; i++) {
            max_end += nums[i];
            if(max < max_end){
                max = max_end;
            }
            if(max_end < 0){
                max_end = 0;
            }
        }
        return max;
    }
}