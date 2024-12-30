class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                // 右子樹皆大於目標
                right = mid - 1;
            }else if(nums[mid]<target){
                // 目標皆大於左子樹
                left = mid + 1;
            }
        }
        return -1;
    }
}