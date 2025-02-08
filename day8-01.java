// Two sum -Pairs with 0 Sum/(Find all pairs on integer array whose sum is equal to given number)

// Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.

// Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.

// Examples:

// Input: arr = [-1, 0, 1, 2, -1, -4]
// Output: [[-1, 1]]
// Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
// arr[2] + arr[4] = 1 + (-1) = 0.
// The distinct pair are [-1,1].

// Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
// Output: [[-6, 6],[-1, 1]]
// Explanation: The distinct pairs are [-1, 1] and [-6, 6].

// Expected Time Complexity: O(n log n)
// Expected Auxiliary Space: O(n).

// Constraints:
// 3 <= arr.size <= 10^5
// -10^5 <= arr[i] <= 10^5


//Solution 
class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        
        int n=arr.length;
        
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        int i=0;
        int j=n-1;
        
        while(i<j){
            
            if(arr[i]+arr[j]==0){
                ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    ans.add(temp);
            
            while( i<n-1 && arr[i]==arr[i+1]){
                i++;
            }
            
            while(j>=1 && arr[j]==arr[j-1]){
                j--;
            }
            
            i++;
            
            }else if(arr[i]+arr[j]>0){
                j--;
            }else{
                i++;
            }
        }
        return ans;
        
    }
}

