// Kth Smallest

// Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to 
// find the kth smallest element in the given array.

// Follow up: Don't solve it using the inbuilt sort function.

// Examples :

// Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
// Output:  7
// Explanation: 3rd smallest element in the given array is 7.

// Input: arr[] = [2, 3, 1, 20, 15], k = 4 
// Output: 15
// Explanation: 4th smallest element in the given array is 15.

// Expected Time Complexity: O(n+(max_element) )
// Expected Auxiliary Space: O(max_element)

// Constraints:
// 1 <= arr.size <= 10^6
// 1<= arr[i] <= 10^6
// 1 <= k <= n


//Solutin

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int n=arr.length;
        int max=0;
        for(int x:arr){
            max=Math.max(max,x);
        }
        
        int fr[]=new int[max+1];
        for(int x:arr){
            fr[x]++;
        }
        
        int count=0;
        for(int i=0;i<fr.length;i++){
            count+=fr[i];
            
            if(count>=k){
                return i;
            }
        }
        
        return -1;
    }
}

