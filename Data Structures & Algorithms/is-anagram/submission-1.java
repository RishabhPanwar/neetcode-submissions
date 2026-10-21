class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        String newS = new String(charArrayS);
        String newT = new String(charArrayT);
        
        if(newS.equals(newT)){
            return true;
        }
        return false;
    }
}
