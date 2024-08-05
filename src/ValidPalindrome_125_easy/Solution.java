package ValidPalindrome_125_easy;

class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)){
                if(isPalindrome(String.valueOf(sb.substring(i,sb.length() - 1 - i)))){
                    return true;
                }

                if(isPalindrome(String.valueOf(sb.substring(i + 1,sb.length() - i)))){
                    return true;
                }
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
