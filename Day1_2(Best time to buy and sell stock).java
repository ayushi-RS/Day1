class Solution {
    public int maxProfit(int[] p) {
        
        int min = p[0], max =0;
        
        int profit=0;
        
        for(int i=0;i<p.length;i++){
            if(p[i]<min){
                min = p[i];
            }
            profit = p[i] - min;
            if(profit>max)
                max = profit;
        }
        
        return max;
        
        
        
        
    }
}