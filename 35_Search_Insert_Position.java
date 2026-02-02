#using Array
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return n;
    }
}

#using Binary Search

  class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
