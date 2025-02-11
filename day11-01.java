// Longest Consecutive Subsequence

// Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such 
// that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

// Examples:

// Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
// Output: 6
// Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

// Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
// Output: 4
// Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.

// Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
// Output: 7
// Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14, 15, which has a length of 7.

// Constraints:
// 1 <= arr.size() <= 10^5
// 0 <= arr[i] <= 10^5


//Solution

//Brute force  -- T.C-> O(n^2)    S.C-> O(1)

class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        int longest=1;
        for(int i=0;i<n;i++){
            int x=arr[i];
            int count =1;
            while(ls(arr,x+1)){
                x=x+1;
                count=count+1;
            }
            longest=Math.max(count,longest);
            
        }
        return longest;
    }
    
    static boolean ls(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------
//Better  T.C-> O(nlogn)  S.C-> O(1)

class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int ls=1;
        int count=0;
        int lastSmall=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastSmall){
                count+=1;
                lastSmall=arr[i];
            }else if(arr[i]!=lastSmall){
                lastSmall=arr[i];
                count=1;
            }
            
            ls=Math.max(ls,count);
        }
        return ls;
    }
}

//----------------------------------------------------------------------------------------------------------------------------------------------
//Optimal Solution   T.C-> O(n)   S.C-> O(n);

class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        
        int ls=1;
        for(int x:set){
            if(!set.contains(x-1)){
                int count=1;
                int num=x;
                while(set.contains(num+1)){
                    count+=1;
                    num=num+1;
                }
                ls=Math.max(ls,count);
            }
        }
        return ls;
    }
}
