class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() <= 0) return 0;
        int maxLength = 0;
        int left = 0,right = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){

        char letter = s.charAt(right);
           if (!set.contains(letter)) {
                set.add(letter);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } 
            else{
                set.remove(s.charAt(left));
                left++;
            }

        }

        return maxLength;
        
    }
}
