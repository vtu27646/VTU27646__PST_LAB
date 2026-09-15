/* Week 1 Session 2 | LeetCode: Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/
 */
import java.util.*;
public class SortArrayByParity {
 public int[] sortArrayByParity(int[] nums){int l=0,r=nums.length-1;while(l<r){while(l<r&&nums[l]%2==0)l++;while(l<r&&nums[r]%2!=0)r--;if(l<r){int t=nums[l];nums[l]=nums[r];nums[r]=t;}}return nums;}
 public static void main(String[] args){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(Arrays.toString(new SortArrayByParity().sortArrayByParity(a)));}
}
