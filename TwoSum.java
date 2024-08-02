//Leet code
//1.Two sum
 

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i == j) {
                    continue;
                } else if (nums[i] + nums[j] == target) {
                    return new int[] { j, i };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int t = 9;
        int[] result = twoSum(nums, t);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
