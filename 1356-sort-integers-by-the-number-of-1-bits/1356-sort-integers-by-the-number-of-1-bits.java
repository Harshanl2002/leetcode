class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]+=Integer.bitCount(arr[i])*10001;
           
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(arr[i]%10001+" ");
            arr[i]=arr[i]%10001;
        }
        return arr;
    }
}