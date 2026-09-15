// Problem: Remove Duplicates from Sorted Array (LeetCode)
// Solution: Keep one copy of each value using a write pointer.
class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){ if(nums.length==0)return 0; int k=1; for(int i=1;i<nums.length;i++)if(nums[i]!=nums[i-1])nums[k++]=nums[i]; return k; }
}
