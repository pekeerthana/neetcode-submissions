class Solution {
    public boolean isValid(String s) {

        Stack<Character> chars = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');  map.put('}','{');  map.put(')','(');

        for(char c: s.toCharArray()){

           if(map.containsKey(c)){

                if(!chars.isEmpty() && map.get(c) == chars.peek()) chars.pop();
                else return false;
           }
           else{chars.push(c);}

        }

        return chars.isEmpty();
        
    }
}
