class Q91DecodeWays {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()+1];
        dp[0]=1;
        dp[1]=(s.charAt(0)=='0')?0:1;
        
        for(int i=2;i<s.length()+1;i++)
        {
            int currDigit=(s.charAt(i-1)-'0');
            int twoDigit=(s.charAt(i-2)-'0')*10+currDigit;
            
            if(currDigit>=1)
            {
                dp[i]+=dp[i-1];
            }
            if(twoDigit>=10 && twoDigit<=26)
            {
                dp[i]+=dp[i-2];
            }    
        }
        
        return dp[s.length()];
    }
}

