// More than n/k Occurrences

// Given an array arr and an element k. The task is to find the count of elements in the array that appear more than n/k times and n is length of arr.

// Examples :

// Input: arr = [3, 1, 2, 2, 1, 2, 3, 3], k = 4
// Output: 2
// Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times.

// Input: arr = [2, 3, 3, 2], k = 3
// Output: 2
// Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times. So the count of elements are 2.

// Input: arr = [1, 4, 7, 7], k = 2
// Output: 0
// Explanation: In the given array, no element appears more than n/k times.

// Constraints:
// 1 <= arr.size() <= 10^6
// 0 <= arr[i] <= 10^8
// 1 <= k <= arr.size()


//Solution

class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int count=0;
        
        for(int x:map.keySet()){
            if(map.get(x)>n/k){
                count++;
            }
        }
        return count;
    }
}
