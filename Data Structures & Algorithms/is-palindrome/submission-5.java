class Solution {
    public boolean isPalindrome(String s) {

        String lowerS = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(left < right && lowerS.charAt(left) != lowerS.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
        
    }   
}
