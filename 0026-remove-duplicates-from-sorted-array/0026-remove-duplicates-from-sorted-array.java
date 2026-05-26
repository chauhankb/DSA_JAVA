class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> a1=new ArrayList<>();

        int n=nums.length;
        if(n<=1){
            return n;
        }
        a1.add(nums[0]);

        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                a1.add(nums[i]);
            }
        }

        for(int i=1;i<a1.size();i++){
            nums[i]=a1.get(i);
        }

        return a1.size();
        
    }
}