class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        if(s.equals(new StringBuilder(s).reverse().toString()))
            return true;
    return false;
    }
}