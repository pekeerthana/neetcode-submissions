class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        int[] freq = new int[27];
        for(char letter: s.toCharArray()){
            freq[letter -'a']++;
        }

        for(char letter: t.toCharArray()){
            freq[letter-'a']--;
        }

        return Arrays.stream(freq).allMatch(n -> n == 0);

    }
}
