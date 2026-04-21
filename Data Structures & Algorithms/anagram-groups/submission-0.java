class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,ArrayList<String>> anagrams = new HashMap<>();

        for(String str: strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String cur = new String(temp);
            if(!anagrams.containsKey(cur)){
                anagrams.put(cur, new ArrayList<>(Arrays.asList(str)));
            }
            else{
                ArrayList<String> grp = anagrams.get(cur);
                grp.add(str);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();
        for(String val : anagrams.keySet()){
            result.add(anagrams.get(val));
        }
        
        return result;
    }
}
