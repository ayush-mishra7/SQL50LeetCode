class Solution {
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
}

    public int maxVowels(String s, int k) {
        int maxVowel=0;
        int start=0;
        int vowel=0;
        for(int end=0; end<s.length();end++){
            if(isVowel(s.charAt(end))){
                vowel++;
            }
            if((end-start+1)==k){
                maxVowel=Math.max(maxVowel,vowel);
                if(isVowel(s.charAt(start))){
                    vowel--;
                }start++;
            }
        }return maxVowel;
    }
    
}