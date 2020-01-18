package com.rak.dsa;

import java.util.Arrays;

public class MinPlatformRequired {
    int minPlatformsNeeded(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int output = 0;
        int platform = 1;
        int i = 1;
        int j = 0;

        while(i< arrival.length && j < departure.length){
            if(arrival[i] < departure[j]){
                i += 1;
                platform += 1;

                if(platform > output){
                    output = platform;
                }
            } else {
                j += 1;
                platform -= 1;
            }
        }
        return output;
    }
}
