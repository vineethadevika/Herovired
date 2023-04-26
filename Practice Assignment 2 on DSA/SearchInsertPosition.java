class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        else{
            int low = 0;
            int high = nums.length-1;
            int mid;
            while (low<=high){
                mid = low + (high-low)/2;
                if(nums[mid]>target) high=mid-1;
                else if(nums[mid]<target) low=mid+1;
                else return mid;
            }
            return low;
        }
    }
}