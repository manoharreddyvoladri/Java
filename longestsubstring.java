/*
Given a string s, find the length of the longest substring without repeating characters.
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
//DSA problems using java




class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int left =0,right=0;
        int len=0;
        int stringLength = s.length();
        while(right<stringLength)
        { 
           char lc = s.charAt(right);
           if(map.containsKey(lc))
              left = Math.max(map.get(lc)+1,left);
            map.put(lc,right);
            len=Math.max(len,(right-left+1));
            right++;
        }
        return len;
    }
}
