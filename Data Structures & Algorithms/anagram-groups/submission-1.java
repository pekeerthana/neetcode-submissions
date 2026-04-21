class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> freq = new HashMap<>();

        for (String str : strs) {

            int[] count = new int[26];

            for (char letter : str.toCharArray()) {
                count[letter - 'a']++;
            }

            String cur = Arrays.toString(count);

            if (!freq.containsKey(cur)) {
                freq.put(cur, new ArrayList<>(Arrays.asList(str)));
            } else {
                ArrayList<String> list = freq.get(cur);
                list.add(str);
                freq.put(cur, list);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for (String val : freq.keySet()) {
            result.add(freq.get(val));
        }

        return result;
    }
}