// Problem: Running Sum of 1D Array (LeetCode)
// Solution: Accumulate each element into the previous running total.
class RunningSumOf1DArray {
    public int[] runningSum(int[] nums){ for(int i=1;i<nums.length;i++) nums[i]+=nums[i-1]; return nums; }
}
