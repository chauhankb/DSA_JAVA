class Solution {
    public int[] twoSum(int[] nums, int target) {
       // Arrays.sort(nums);
        int sum=0;
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }*/

       /* Arrays.sort(nums);

        int l=0;
        int r=nums.length-1;

        while(l<=r){
            sum=nums[l]+nums[r];
            if(sum==target){
                return new int[]{l,r};
            }
            if(sum>target){
                r--;
            }
            else{
                l++;
            }
            

        }*/


        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            int second=target-first;

            if(hm.containsKey(second)){
                return new int[]{hm.get(second),i};
            }

            hm.put(nums[i],i);
        }

        return new int[]{-1,-1};

    }
}