// Problem: Remove Element (LeetCode)
// Solution: Copy every value different from val to the front and return the new length.
class RemoveElement {
    public int removeElement(int[] nums,int val){ int k=0; for(int x:nums)if(x!=val)nums[k++]=x; return k; }
}
