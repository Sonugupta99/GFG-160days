// Pascal Triangle

// Given a positive integer n, return the nth row of pascal's triangle.
// Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

// Examples:

// Input: n = 4
// Output: [1, 3, 3, 1]
// Explanation: 4th row of pascal's triangle is {1, 3, 3, 1}.

// Input: n = 5
// Output: [1, 4, 6, 4, 1]
// Explanation: 5th row of pascal's triangle is {1, 4, 6, 4, 1}.

// Input: n = 1
// Output: [1]
// Explanation: 1st row of pascal's triangle is {1}.

// Constraints:
// 1 ≤ n ≤ 20

//Solution

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        long ans = 1;

        for (int i = 1; i < n; i++) {
            res.add((int) ans);
            ans = ans * (n - i) / i;
        }
        
        res.add(1);
        return res;
    }
}
