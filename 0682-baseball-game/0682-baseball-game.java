class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1 = new Stack<>();

        for (String s : operations) {
            if (s.equals("C")) {
                int a = s1.pop();
            } else if (s.equals("D")) {
                s1.push(2 * s1.peek());
            } else if (s.equals("+")) {
                int a = s1.pop();
                int b = s1.pop();
                s1.push(b); 
                s1.push(a);
                s1.push(a + b);
            }

            else {
                int a = Integer.parseInt(s);
                s1.push(a);
            }

        }
        int sum = 0;
        while (!s1.isEmpty()) {
            sum = sum + s1.pop();

        }

        return sum;

    }
}