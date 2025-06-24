class Solution {

    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i=3; i<=s.length(); i++) {
            char one = s.charAt(i-3);
            char two = s.charAt(i-2);
            char three = s.charAt(i-1);
            if (one != two && one != three && two != three) count++;
        }

        return count;
    }
}