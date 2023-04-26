class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return new ArrayList<>();
        }
        return Arrays.stream(strs).collect(Collectors.groupingBy(str -> {
            final char[] array = str.toCharArray();
            Arrays.sort(array);
            return new String(array);
        })).values().stream().collect(Collectors.toList());
    }
}