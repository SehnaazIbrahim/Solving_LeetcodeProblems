class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i]-1;
            if (nums[i]>0 && nums[i] < nums.length && nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }
        }

        for (int MissedIndex = 0; MissedIndex < nums.length; MissedIndex++) {
            if (nums[MissedIndex] != MissedIndex+1) {
                return MissedIndex+1;
            }
        }
        return nums.length+1;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}