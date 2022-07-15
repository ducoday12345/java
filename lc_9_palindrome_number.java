public class lc_9_palindrome_number {
    class Solution {
        public boolean isPalindrome(int x) {
            int reverse = 0;
            int temp = x;
            while(x>0){
                int remainder = x%10;
                reverse = reverse*10 + remainder;
                x = x/10;
            }
            if (reverse == temp) return true;
            return false;
        }
    }

}
