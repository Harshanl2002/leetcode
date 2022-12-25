class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int  n1l=n1.length,n2l=n2.length,l=n1l+n2l,i=0;
        int arr[]=new int[l];
        for(int j:n1)
        {
            arr[i]=j;
            i++;
        }
        for(int j:n2)
        {
            arr[i++]=j;
        }
        Arrays.sort(arr);
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
        double n=0,m1=0,m2=0;
        if(l%2!=0)
        {
            n=(double)arr[l/2];
        }
        else
        {
            m1=(double)arr[(l/2)-1];
            m2=(double)arr[(l/2)];
            n=(m1+m2)/2;
        }
        return n;     
    }
}