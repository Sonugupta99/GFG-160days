// Factorials of large numbers


// Given an integer n, find its factorial. Return a list of integers denoting the digits that make up the factorial of n.

// Examples:

// Input: n = 5
// Output: [1, 2, 0]
// Explanation: 5! = 1*2*3*4*5 = 120

// Input: n = 10
// Output: [3, 6, 2, 8, 8, 0, 0]
// Explanation: 10! = 1*2*3*4*5*6*7*8*9*10 = 3628800

// Input: n = 1
// Output: [1]
// Explanation: 1! = 1 

// Constraints:
// 1 ≤ n ≤ 10^3


// Solution

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        java.math.BigInteger  fact = java.math.BigInteger.ONE; // Initialize fact as 1

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(java.math.BigInteger.valueOf(i)); // Compute factorial
        }

        // Convert BigInteger to String and extract digits
        String str = fact.toString();
        for (int i = 0; i < str.length(); i++) {
            ans.add(str.charAt(i) - '0'); // Convert char to int
        }

        return ans;
    }
}

