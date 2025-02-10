//Array Duplicates

// Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array.

// Examples:

// Input: arr[] = [2, 3, 1, 2, 3]
// Output: [2, 3] 
// Explanation: 2 and 3 occur more than once in the given array.

// Input: arr[] = [0, 3, 1, 2] 
// Output: [] 
// Explanation: There is no repeating element in the array, so the output is empty.

// Input: arr[] = [2]
// Output: [] 
// Explanation: There is single element in the array. Therefore output is empty.

// Constraints:
// 1 <= arr.size() <= 10^6
// 0 <= arr[i] <= 10^6


//Solution

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int x:map.keySet()){
            if(map.get(x)>1){
                ans.add(x);
            }
        }
        return ans;
    }
}
