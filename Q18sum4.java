class sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums==null || nums.length<4)
        {
            return res;
        }
        Arrays.sort(nums);
        int size=nums.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                int left=j+1;
                int right=size-1;
                while(left<right)
                {
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        ArrayList<Integer> l=new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[left]);
                        l.add(nums[right]);
                        res.add(l);
                        int leftPrev=nums[left];
                        while(left<size && nums[left]==leftPrev)
                        {
                            left++;
                        }
                        int rightPrev=nums[right];
                        while(right>left && nums[right]==rightPrev)
                        {
                            right--;
                        }
                    }
                    else if(sum<target)
                    {
                        left++;
                    }else
                    {
                        right--;
                    } 
                }
                while(j+1<size && nums[j+1]==nums[j])
                {
                    j++;
                }
            }
            while(i+1<size && nums[i+1]==nums[i])
            {
                i++;
            }
        }
        return res;
    }
}