package com.rak.dsa.binarysearch;

public class Sqrt {
    int findSqrt(int number){
        int start = 0;
        int end = number;
        int mid;
        int ans = 0;

        while(start<= end){
            mid = (start+end)/2;
            if(mid * mid == number){
                return mid;
            } else if(mid * mid < number){
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
