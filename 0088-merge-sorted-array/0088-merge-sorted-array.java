class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
       for(int i=m,j=0;i<a.length&&j<b.length;i++,j++)
       {
          a[i]=b[j];
       }
        Arrays.sort(a);
    }
}