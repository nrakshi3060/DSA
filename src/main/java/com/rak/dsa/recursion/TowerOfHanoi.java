package com.rak.dsa.recursion;

public class TowerOfHanoi {
    void printSteps(int numberOfTowers){
        printStepsFunction(numberOfTowers, "S", "D", "A");
    }
    private void printStepsFunction(int n, String source, String destination, String auxiliary){
        if(n <= 0){
            return;
        } else if (n == 1) {
            System.out.println( source +" "+destination);
        } else {
            printStepsFunction(n-1, source, auxiliary, destination);
            System.out.println(source+ " "+ destination);
            printStepsFunction(n-1, auxiliary, destination, source);
        }
    }
}
