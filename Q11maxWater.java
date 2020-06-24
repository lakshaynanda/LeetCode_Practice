class maxWater {
    public int maxArea(int[] height) {
        int maxArea=0;
        int l=0;
        int r=height.length-1;
        
        while(l<r)
        {
            maxArea=Math.max(maxArea,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maxArea;
    }
    /* Brute Force Method
    public int maxArea(int[] height) {
        int maxWater=0;
        for(int l=0;l<height.length;l++)
        {
            for(int r=l+1;r<height.length;r++)
            {
                maxWater=Math.max(maxWater,Math.min(height[l],height[r])*(r-l));
            }
        }
    return maxWater;
    }*/
}