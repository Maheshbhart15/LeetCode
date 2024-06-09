package Array;

import java.util.HashMap;

public class SubarraysSum {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        Solution solution = new Solution();
        int result = solution.subarraysDivByK(nums, k);
        System.out.println("Number of subarrays with sum divisible by " + k + ": " + result);
    }

    static class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1); // Initialize with a prefix sum of 0 having one count.
            int sum = 0;
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                int mod = sum % k;
                // Convert negative remainder to positive
                if (mod < 0) {
                    mod = (mod + k) % k;
                }
                if (map.containsKey(mod)) {
                    res += map.get(mod);
                }
                map.put(mod, map.getOrDefault(mod, 0) + 1);
            }
            return res;
        }
    }
}
