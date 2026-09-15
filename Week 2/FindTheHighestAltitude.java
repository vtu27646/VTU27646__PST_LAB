// Problem: Find the Highest Altitude (LeetCode)
// Solution: Accumulate the gain values and keep the highest altitude reached.
class FindTheHighestAltitude {
    public int largestAltitude(int[] gain){ int cur=0,best=0; for(int x:gain){cur+=x;best=Math.max(best,cur);} return best; }
}
