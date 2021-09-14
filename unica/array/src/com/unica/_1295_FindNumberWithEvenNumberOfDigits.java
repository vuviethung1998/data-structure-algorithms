package com.unica;

public class _1295_FindNumberWithEvenNumberOfDigits {
    public static int sol_1(int[] nums) {
        // 1,12,63,9687,632
        // duyet mang -> check len, neu so digit chan thi cho vao mang
        // chuyen tu so sang str dung Integer.toString
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            String num = Integer.toString(nums[i]);
            if (num.length() % 2 ==0 ) res ++;
        }
        return res;
    }

    public static int sol_2(int[] nums) {// chuyen tu so sang str dung String.valueOf
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int num_digit = String.valueOf(nums[i]).length();
            if (num_digit % 2 ==0 ) res ++;
        }
        return res;
    }

    public  static int sol_3(int[] nums) { // su dung log de tim so phan tu
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int length_i = (int)Math.log10(nums[i]) + 1;
            if (length_i % 2 == 0) res += 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] input = {1,12,63,9687,632};
        System.out.println(sol_3(input));
    }
}
