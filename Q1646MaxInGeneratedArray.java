class Q1646MaxInGeneratedArray {
    public int getMaximumGenerated(int n) {
        int nums[] = new int[n+1];
        if(n==0){
            return nums[0];
        }
        nums[1] = 1;
        if(n==1){
            return nums[1];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 2; i <= n; i++) {
            if(i % 2 == 0){
                nums[i] = nums[i/2];
            } else {
                nums[i] = nums[i/2] + nums[(i/2)+1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}

