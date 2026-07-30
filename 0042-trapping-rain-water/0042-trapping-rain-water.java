class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n<3){
            return 0;
        }

        int lmb[]=new int[n];
        lmb[0]=height[0];

        for(int i=1;i<n;i++){
            lmb[i]=Math.max(height[i],lmb[i-1]);
        }

        int rmb[]=new int[n];
        rmb[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rmb[i]=Math.max(height[i],rmb[i+1]);
        }
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + (Math.min(lmb[i],rmb[i])-height[i]); 
        }

        return sum;
    }
}