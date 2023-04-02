class Solution {
    public int[] twoSum(int[] nums, int target) {
        int outerIndex = 0; 
        for(int n : nums){
            int sum = 0;
        for(int i = outerIndex+1; i< nums.length; i++){
            sum = nums[outerIndex] + nums[i];
            if(sum == target){
                return new int[] {outerIndex,i};
            }

            
        }

        outerIndex++;
        }
        return null;
    }
}
