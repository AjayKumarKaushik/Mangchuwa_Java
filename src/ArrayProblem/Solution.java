package ArrayProblem;

class Solution {
    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;

        System.out.println("Original array: ");
        printArray(nums);

        sol.rotate(nums, k);

        System.out.println("Array after rotation by " + k + " steps: ");
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
