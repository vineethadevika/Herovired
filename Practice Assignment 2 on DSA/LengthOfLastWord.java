class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.split(" ");
        int t=str.length;
        return str[t-1].length();
    }
}