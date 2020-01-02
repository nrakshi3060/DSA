package com.rak.dsa.arrays;

public class AddOne {
    int[] addOne(int[] digits) {
        int output = 1;
        int carry = 0;
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            output = output + digits[n - 1 - i];
            carry = output / 10;

            if (carry == 0) {
                digits[n - 1 - i] = output;
                break;
            } else {
                digits[n - 1 - i] = output % 10;
                output = carry;
            }
        }

        if (carry > 0) {
            int[] result = new int[digits.length + 1];

            result[0] = carry;

            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }

        return digits;
    }
}
