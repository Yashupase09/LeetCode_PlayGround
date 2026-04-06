/*Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length;i++)
        {
            char[] chars = strs[i].toCharArray();

            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());

        
    }
}
