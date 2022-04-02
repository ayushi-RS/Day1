

class Solution {
    public void moveZeroes(int[] nums) {
        
        int zero = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] == 0){
                zero++;
                continue;
            }
            
          if(nums[i] != 0){
              
              nums[i-zero] = nums[i];
              
              if(zero>=1)
                nums[i] = 0;
          }
        }
      
    }
}