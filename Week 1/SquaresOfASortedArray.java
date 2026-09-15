// Problem: Squares of a Sorted Array (LeetCode)
// Solution: Compare absolute values from both ends and fill the result backwards.
class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums){ int[] r=new int[nums.length]; int l=0,h=nums.length-1,k=nums.length-1; while(l<=h){ int a=Math.abs(nums[l]),b=Math.abs(nums[h]); if(a>b){r[k--]=a*a;l++;}else{r[k--]=b*b;h--;} } return r; }
}
