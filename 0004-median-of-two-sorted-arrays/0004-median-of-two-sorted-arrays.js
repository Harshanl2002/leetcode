/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    nums1=nums1.concat(nums2);
    nums1.sort((a, b) => a - b);
    console.log(nums1.toString());
    var med=(nums1.length %2!=0? nums1[Math.floor(nums1.length/2)]: (nums1[Math.floor(nums1.length/2)-1]+nums1[Math.floor(nums1.length/2)])/2);
    console.log(nums1[Math.floor(nums1.length/2)])
    return med;
};