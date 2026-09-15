// Problem: Build Array from Permutation (LeetCode)
// Solution: For every i, the required value is nums[nums[i]].
class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums){ int[] ans=new int[nums.length]; for(int i=0;i<nums.length;i++)ans[i]=nums[nums[i]]; return ans; }
}
