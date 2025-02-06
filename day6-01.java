// Rotate Array by One

// Given an array arr, rotate the array by one position in clockwise direction.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [5, 1, 2, 3, 4]
// Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.

// Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
// Output: [3, 9, 8, 7, 6, 4, 2, 1]
// Explanation: After rotating clock-wise 3 comes in first position.

// Constraints:
// 1<=arr.size()<=10^5
// 0<=arr[i]<=10^5


// Solution

class Solution {
    public void rotate(int[] arr) {
        int n=arr.length;
        rev(arr,0,n-1);
        rev(arr,1,n-1);
        
    }
    
    static void rev(int arr[],int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}

