// Problem: Sort Array By Parity (LeetCode)
// Solution: Partition the array with two pointers so even values precede odd values.
class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums){ int l=0,r=nums.length-1; while(l<r){ if(nums[l]%2==0){l++;} else { int t=nums[l];nums[l]=nums[r];nums[r]=t;r--; } } return nums; }
}
