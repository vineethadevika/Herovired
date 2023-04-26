class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int strLen = s.length();
        int wrdLen = words[0].length();
        int totWrdsLen = words.length * wrdLen;
        if (strLen < totWrdsLen)
            return result;

        Map<String, Integer> totWrdFreq = new HashMap<>();
        for (String word : words)
            totWrdFreq.put(word, totWrdFreq.getOrDefault(word, 0) + 1);
         

        int left = 0;
        int right = totWrdsLen - 1;

        while (right < strLen) {
            Map<String, Integer> wrdFreq = new HashMap<>();
            int currLeft = left;
            int currRight = currLeft + wrdLen - 1;
            while (currRight <= right) {
                String temp = s.substring(currLeft, currRight+1);
                wrdFreq.put(temp, wrdFreq.getOrDefault(temp, 0) + 1);
                currLeft+=wrdLen;
                currRight+=wrdLen;
                
            }
            if(totWrdFreq.equals(wrdFreq)) result.add(left);
            left++;
            right++;
        }

        return result;
    }
}