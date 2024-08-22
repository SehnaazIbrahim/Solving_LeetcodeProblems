import java.util.ArrayList;

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        // Storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (nums[left] < nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // Copying the remaining elements of the left half, if any
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        // Copying the remaining elements of the right half, if any
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // Copy the merged elements back to the original array
        for (int i = 0; i < temp.size(); i++) {
            nums[low + i] = temp.get(i);
        }
    }
}
