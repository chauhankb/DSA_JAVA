class Solution {
    public String reversePrefix(String s, int k) {
      char[] arr = s.toCharArray();

        int l = 0;
        int r = k - 1;

        while (l < r) {
            char ch = arr[l];
            arr[l] = arr[r];
            arr[r] = ch;

            l++;
            r--;
        }

        return new String(arr);


    }
}