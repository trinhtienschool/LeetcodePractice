package com.trinhtien2212;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int mid = left + (right - left) / 2;
        while(left <= right){
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 7));
    }
}
