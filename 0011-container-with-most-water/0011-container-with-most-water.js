/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(h) {
    var water=0,left=0,right=h.length-1;
    while(left<right)
    {
        water=Math.max(water,Math.min(h[left],h[right])*(right-left));
        console.log(water)
        if(h[left]>h[right])
        {
            right--;
        }
        else
        {
            left++;
        }
    }
    return water;
};