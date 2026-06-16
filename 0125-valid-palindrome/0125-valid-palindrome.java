class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]", "");
        String a=result.toLowerCase();
        

        int l=0;
        int r=a.length()-1;
        boolean pa=true;

        while(r>=l){
            if(a.charAt(l)!=a.charAt(r)){
               pa=false;
               break;
            }
            l++;
            r--;
        }

        return pa;

    }
}