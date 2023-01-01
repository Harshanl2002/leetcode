class Solution {
    public int[] buildArray(int[] n) {
        int arr[]=new int[n.length],ind=0;
        for(int i:n)
        {
            arr[ind++]=n[i];
        }
        return arr;
    }
}