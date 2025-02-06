// Kadane's Algorithm(Find Largest sum contiguous Subarray)

// Given an integer array arr[]. You need to find the maximum sum of a subarray.

// Examples:

// Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output: 11
// Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

// Input: arr[] = [-2, -4]
// Output: -2
// Explanation: The subarray {-2} has the largest sum -2.

// Input: arr[] = [5, 4, 1, 7, 8]
// Output: 25
// Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.

// Constraints:
// 1 ≤ arr.size() ≤ 10^5
// -10^9 ≤ arr[i] ≤ 10^4


// Solution

class Solution {
    int maxSubarraySum(int[] arr) {
        int n=arr.length;
        int maxSum=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}


