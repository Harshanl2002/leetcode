class Solution {
    public int finalValueAfterOperations(String[] o) {
        int a=0;
        for(String s:o)
        {
            if(s.startsWith("++")||s.endsWith("++"))
            {
                a++;
            }
            if(s.startsWith("--")||s.endsWith("--"))
            {
                a--;
            }
        }
        return a;
    }
}