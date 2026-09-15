// Problem: Richest Customer Wealth (LeetCode)
// Solution: Compute every customer's row sum and keep the maximum.
class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts){ int best=0; for(int[] a:accounts){ int s=0; for(int x:a)s+=x; best=Math.max(best,s); } return best; }
}
