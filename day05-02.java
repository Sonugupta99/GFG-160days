// Sort 0s, 1s and 2s

// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

// You need to solve this problem without utilizing the built-in sort function.

// Examples:

// Input: arr[] = [0, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2]
// Explanation: 0s 1s and 2s are segregated into ascending order.

// Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
// Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
// Explanation: 0s 1s and 2s are segregated into ascending order.

// Constraints:
// 1 <= arr.size() <= 10^6
// 0 <= arr[i] <= 2

//Solution

class Solution{
public void sort012(int[] arr) {
    int zero=0;
    int one=0;
    int two=0;
    int n=arr.length;
    
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            zero++;
        }else if(arr[i]==1){
            one++;
        }else{
            two++;
        }
    }
    
    
    int j=0;
    while(j<n){
        if(zero>0){
            arr[j++]=0;
            zero--;
        }else if(one>0){
            arr[j++]=1;
            one--;
        }else{
            arr[j++]=2;
            two--;
        }
    }
}
}

