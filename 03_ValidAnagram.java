class Solution {
    public boolean isAnagram(String s, String t) {

        Map<String, Integer> map= new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
       
       char[] sArr = new char[s.length()];
       char[] tArr = new char[t.length()];

       for(int i=0; i<s.length();i++)
       {
            sArr[i] = s.charAt(i);
       }

        for(int i=0; i<t.length();i++)
       {
            tArr[i] = t.charAt(i);
       }

       Arrays.sort(sArr);
       Arrays.sort(tArr);

       for(int i=0; i<sArr.length;i++){
            if(sArr[i]!=tArr[i]){
                return false;
            }
       }

       return true;
    }

    //we can also solve this by using HashMap
}
