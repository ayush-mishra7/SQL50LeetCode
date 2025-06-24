import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();

        while (end<s.length()) {
            char ch=s.charAt(end);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxLen=Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
}
