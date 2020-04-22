class Q9Palindrome {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int remainder=0;
        int num=x;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            remainder=x%10;
            reverse=reverse*10+remainder;
            x/=10;
        }
        if(num==reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}