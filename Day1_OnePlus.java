class Solution {
    public int[] plusOne(int[] digits)
    {
        int len=digits.length-1;
        while(len>-1)
        {
            if(digits[len]==9)
            {
                digits[len]=0;
                len--;
            }
            else
            {
                digits[len]+=1;
                return digits;
            }
        }
        if(digits[0]==0)
        {
            digits=Arrays.copyOf(digits,digits.length+1);
            digits[0]=1;
        }
        return digits;
    }
}
