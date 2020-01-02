package com.rak.dsa.recursion;

public class StairCase {
    int numOfWaysToClimb(int numberOfStairs){

        if( numberOfStairs <= 0){
            return 1;
        } else if(numberOfStairs == 1){
            return 1;
        } else if(numberOfStairs == 2){
            return 2;
        } else if(numberOfStairs == 3){
            return 4;
        }

        return numOfWaysToClimb(numberOfStairs - 1) + numOfWaysToClimb(numberOfStairs - 2) + numOfWaysToClimb(numberOfStairs - 3);
    }
}
