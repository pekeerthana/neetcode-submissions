class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s == null || s.isEmpty()) return 0;
        if( s.length() == 1) return 1;
        HashMap<Character,Integer> map = new HashMap<>();
        
        int i = 0; int curLen =0; 
        int j =0;
        while( j < s.length()){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            map.put(s.charAt(j),j);
            curLen = Math.max(curLen,j-i+1 );
            j++;
        }
        return curLen; 
        
    }
}
