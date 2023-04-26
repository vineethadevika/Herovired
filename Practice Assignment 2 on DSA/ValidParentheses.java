class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> st=new Stack<>();
        String in="({[";
        String out=")}]";
        for(int i=0;i<s.length();i++)
        {
            if(in.contains(s.charAt(i)+""))
                st.push(s.charAt(i));
            else
            {
                if(!st.empty() && (char)st.peek()==in.charAt(out.indexOf(s.charAt(i))))
                    st.pop();
                else
                    return false;
            }
            
        }
        if(st.empty())
           return true;
        else
            return false;
        
   
    }