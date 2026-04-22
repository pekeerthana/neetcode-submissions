class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:nums)
        {
            if(!freq.containsKey(num)){
                freq.put(num,1);
            }
            else{
                int val = freq.get(num);
                freq.put(num,val+1);
            }
        }

       LinkedHashMap<Integer, Integer> sortedMap = freq.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        int i = 1;
        int[] result = new int[k];
        for(int key: sortedMap.keySet())
        {
            if(i<=k){
                result[i-1] = key;
            }
            i++;
           
        }

        return result;

        
    }
}
