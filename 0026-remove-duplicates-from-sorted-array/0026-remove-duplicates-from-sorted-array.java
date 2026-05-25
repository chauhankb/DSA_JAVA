class Solution {
    public int removeDuplicates(int[] nums) {
       /* int n=nums.length;
        if(n<=1){
            return n;
        }
        int k=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;*/
        ArrayList<Integer> a=new ArrayList<>();
        int n=nums.length;
       if(n == 0){
          return  0;
        }

        a.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                a.add(nums[i]);
            }
        }

        int result[] = new int[a.size()];

       for(int i = 0; i < a.size(); i++) {
            nums[i] = a.get(i);
        }


        return a.size();

    }
}