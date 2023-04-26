class Solution {
    public static boolean isMatch(String s, String p) {
         if (s == null || p == null) {
      return false;
    }
    int sIndex = 0;
    int pIndex = 0;
    int starIndex = -1;
    int match = 0;
    while (sIndex < s.length()) {
      if (pIndex < p.length() && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?')) {
        sIndex++;
        pIndex++;
      }
      else if (pIndex < p.length() && p.charAt(pIndex) == '*') {
        starIndex = pIndex;
        match = sIndex;
        pIndex++;
      }
      else if (starIndex == -1) {
        return false;
      }
      else {
        pIndex = starIndex + 1;
        sIndex = match + 1;
        match++;
      }
    }
    while (pIndex < p.length() && p.charAt(pIndex) == '*') {
      pIndex++;
    }

    return pIndex == p.length();
  }

  public static void main(String[] args) {
    System.out.println(isMatch("aa", "a"));
    }
}