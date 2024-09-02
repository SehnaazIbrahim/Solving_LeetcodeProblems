class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the current element with the element at the last non-zero position
                int temp = nums[i];
                nums[i] = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = temp;

                // Move the index for the last non-zero element forward
                lastNonZeroFoundAt++;
            }
        }
    }
}
