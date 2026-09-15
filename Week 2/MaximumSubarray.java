// Problem: Maximum Subarray (LeetCode)
// Solution: Kadane's algorithm tracks the best subarray ending at each position.
class MaximumSubarray {
    public int maxSubArray(int[] nums){ int cur=nums[0],best=nums[0]; for(int i=1;i<nums.length;i++){cur=Math.max(nums[i],cur+nums[i]);best=Math.max(best,cur);} return best; }
}
