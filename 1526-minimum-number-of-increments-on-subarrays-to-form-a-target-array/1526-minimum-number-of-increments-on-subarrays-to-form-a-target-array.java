class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;

        //Imagine we are building a wall with bricks
        //*
        //*       *
        //*       *
        //*   *   *
        //4   1   3
        //We need to add 3 extra bricks for the first one
        //We dont need to add any extra bricks as the next one will manage
        //Now whatever is the last size , we need to add as many bricks
        //Hence we will assign ans with the last value
        int ans = target[n-1];

        for(int i=0;i<n-1;i++){
            if(target[i] > target[i+1])
                ans += target[i] - target[i+1];
        }

        return ans;
    }
}