class Solution {
    public int[] getConcatenation(int[] n) {
        int arr[]=new int[n.length*2],j=0;
        for(int i:n)
        {
            arr[j]=i;
            arr[j+n.length]=i;
            j++;
        }
        return arr;
    }
}