// Common in 3 Sorted Arrays

// You are given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// If there are no such elements return an empty array. In this case, the output will be -1.

// Note: can you handle the duplicates without using any additional Data Structure?

// Examples :

// Input: arr1 = [1, 5, 10, 20, 40, 80] , arr2 = [6, 7, 20, 80, 100] , arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
// Output: [20, 80]
// Explanation: 20 and 80 are the only common elements in arr, brr and crr.

// Input: arr1 = [1, 2, 3, 4, 5] , arr2 = [6, 7] , arr3 = [8,9,10]
// Output: [-1]
// Explanation: There are no common elements in arr, brr and crr.

// Input: arr1 = [1, 1, 1, 2, 2, 2], B = [1, 1, 2, 2, 2], arr3 = [1, 1, 1, 1, 2, 2, 2, 2]
// Output: [1, 2]
// Explanation: We do not need to consider duplicates

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

// Here n = Total sizes of arr1, arr2, and arr3

// Constraints:
// 1 <= arr1.size(), arr2.size(), arr3.size() <= 10^5
// -10^5 <= arr1i ,arr2i , 1arr3i <= 10^5


//Solution

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
                 
            List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            
            if (arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))) {
                ans.add(arr1.get(i));

                // Move all pointers forward
                i++;
                j++;
                k++;

                // Skip duplicates for arr1
                while (i < arr1.size() && arr1.get(i).equals(arr1.get(i - 1))) {
                    i++;
                }
                // Skip duplicates for arr2
                while (j < arr2.size() && arr2.get(j).equals(arr2.get(j - 1))) {
                    j++;
                }
                // Skip duplicates for arr3
                while (k < arr3.size() && arr3.get(k).equals(arr3.get(k - 1))) {
                    k++;
                }
            } 
            else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } 
            else if (arr2.get(j) < arr3.get(k)) {
                j++;
            } 
            else {
                k++;
            }
        }
        return ans;
            
    }
}



