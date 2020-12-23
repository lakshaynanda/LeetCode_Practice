class Q35SearchInPosition {
    public int searchInsert(int[] nums, int target) {
        int found = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found = i;
            }
        }
        if(found == -1) {
            for(int j=0;j<nums.length;j++){
                if(nums[j]>target){
                    found = j;
                    break;
                } else {
                    found = nums.length;
                }
            }
        }
        return found;
    }
}