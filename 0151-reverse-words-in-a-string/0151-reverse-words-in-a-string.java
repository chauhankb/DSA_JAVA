class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        // s.trim() is to trim the string by starting and ending
        // s = "  hello world  "
        //after s.trim() the s = "hello world"
        StringBuilder str = new StringBuilder();

        int n = word.length;

        for(int i = n - 1; i >= 0; i--){
            str.append(word[i]);
            if(i > 0){
                str.append(" ");
            }
        }
        return str.toString();
    }
}