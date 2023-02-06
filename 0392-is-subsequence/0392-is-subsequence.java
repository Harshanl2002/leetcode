class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t))
        {
            return true;
        }
        if(s.equals(""))
        {
            return true;
        }
        char ch1[]=s.toCharArray();
        char ch[]=t.toCharArray();
        int i=0,j=0;
        for(i=0,j=0;i<ch.length;i++)
        {
            if(ch[i]==ch1[j])
            {
                j++;
                if(j==ch1.length)
                {
                    break;
                }
                
            }
        }
        if(j==ch1.length)
        {
            return true;
        }
        return false;
    }
}