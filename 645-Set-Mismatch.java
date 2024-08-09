class Solution {
    public int[] findErrorNums(int[] nums) {
     int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i]-1;
            if (nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }
        }

        for (int MissedIndex = 0; MissedIndex < nums.length; MissedIndex++) {
            if (nums[MissedIndex] != MissedIndex +1) {
                return new int[] {nums[MissedIndex],MissedIndex +1};
            }
        }
        return new int[] {-1,-1};
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}