class Solution {
    public boolean isIsomorphic(String s, String t) {
        char StoT[]=new char[256];
        char TtoS[]=new char[256];
        char s1[]=s.toCharArray(),t1[]=t.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
            if(StoT[s1[i]]==0 && TtoS[t1[i]]==0)
            {
                StoT[s1[i]]=t1[i];
                TtoS[t1[i]]=s1[i];
            }
            else if(StoT[s1[i]]!=t1[i])
            {
                return false;
            }
        }
        return true;
        
    }
}