package dynamicconnectivity;

class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Red Roses run no risk, sir, on nurses order."));
    }

    public static boolean isPalindrome(String input) {
        String s = input.toLowerCase();
        int l = 0, r = s.length() - 1;
        boolean skipLeft, skipRight;

        while (l <= r) {

            if (!Character.isAlphabetic(s.charAt(l)) && !Character.isDigit(s.charAt(l))) {
                l++;
                skipLeft = true;
            } else {
                skipLeft = false;
            }

            if (!Character.isAlphabetic(s.charAt(r)) && !Character.isDigit(s.charAt(r))) {
                r--;
                skipRight = true;
            } else
                skipRight = false;
            if (skipLeft || skipRight) {
                continue;
            }

            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}