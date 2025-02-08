// Count Inversions

// Given an array of integers arr[]. Find the Inversion Count in the array.
// Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

// Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted.
// If the array is already sorted then the inversion count is 0.
// If an array is sorted in the reverse order then the inversion count is the maximum. 

// Examples:

// Input: arr[] = [2, 4, 1, 3, 5]
// Output: 3
// Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

// Input: arr[] = [2, 3, 4, 5, 6]
// Output: 0
// Explanation: As the sequence is already sorted so there is no inversion count.

// Input: arr[] = [10, 10, 10]
// Output: 0
// Explanation: As all the elements of array are same, so there is no inversion count.

// Constraints:
// 1 ≤ arr.size() ≤ 10^5
// 1 ≤ arr[i] ≤ 10^4


//Solution

class Solution {
    // Function to count inversions in the array.
    // static int count=0;
    static int inversionCount(int arr[]) {
        return mergeSort(arr,0,arr.length-1);
    }
    
    static int merge(int arr[],int si,int mid,int ei){
        int count=0;
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                count+=mid-i+1;
                j++;
            }
            k++;
        }
        
        //if element left in left part of array
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        
        //if element left in right part of array
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        
        //copy temp to original
        for(k=0,i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return count;
        
    }
    
    static int mergeSort(int arr[],int si,int ei){
        int count=0;
        if(si>=ei) return count;
        
        int mid=si+(ei-si)/2;
        
        count+=mergeSort(arr,si,mid);
        count+=mergeSort(arr,mid+1,ei);
        count+=merge(arr,si,mid,ei);
        return count;
        
    }
}
