class Solution {
    public String countAndSay(int n) {
         if(n==1) return "1"; 
        String prev = countAndSay(n-1); 
        StringBuilder sb = new StringBuilder();
        int numDigit = 1;
        char currentNum = prev.charAt(0); 
        for(int i=1;i<prev.length();i++){ 
            if(prev.charAt(i) == currentNum){
                numDigit++;                
            }else{
                sb.append(numDigit).append(currentNum);
                numDigit = 1;
                currentNum = prev.charAt(i);
            }
        }
        if(numDigit>0){
            sb.append(numDigit).append(currentNum);
        }
        return sb.toString();
    }
}