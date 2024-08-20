import java.util.HashMap;
class Solution 
{
    public static void main(String args[]) 
    {
        int target = 9;
        int[] nums = {2, 7,1,8, 11, 15};
        Solution solution = new Solution(); // Create an instance of the Solution class
        int[] result = solution.twosum(nums, target); // Call the twosum method  // Print the result
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
    public int[] twosum(int[] nums, int target)
     {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i];
            if (map.containsKey(complement)) 
            {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
