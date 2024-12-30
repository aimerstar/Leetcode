// Time Limit Exceeded
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(right!=left+1){
            int mid = (left + right)/2;
            if(nums[mid]>target){
                right = mid;
            }else if(nums[mid]<target){
                left = mid;
            }else{
                return mid;
            }
        }
        return -1;
    }
}