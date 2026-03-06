class Solution {
    public boolean checkOnesSegment(String s) {
        int[] arr = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i) - '0';
        }
        int f=0;
        for(int i=0;i<arr.length;i++){
            if(f==0){
                if(arr[i]==0) f=1;
            }
            else{
                if(arr[i]==1) return false;
            }
        }
        return true;
        // int count=0;
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]==1){
        //         if(arr[i]!=arr[i+1])
        //           count++;
        //           return false;
        //     }
        // }

        // if(count>1){
        //     return false;
        // }
        // else{
        //     return true;
        // }
        

    }
}