package com.unica;

public class _88_Merge_Sorted_Array {
    /*
    *  Description: Cho 2 mang nums1 & nums2 sap xep theo thu tu non-decreasing
    *  Cho m, n tuong ung voi so phan tu cua nums1 & nums2
    *  Merge 2 mang thanh 1 vao nums1, voi so luong phan tu cua nums1 = m+n
    * Example 1:
    * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    * Output: [1,2,2,3,5,6]
    * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    * */

    public static void sol_1(int[] n1, int n, int num) {
        int found_pos_index = 0;
        for (int i = 0; i < n; i++) {
            if (n1[i]  > num) { // tim thay vi tri i
                found_pos_index = 1;
                for (int j = n-1; j >=i; j--) n1[j+1] = n1[j]; // dich sang phai 1 index
                n1[i] = num; // chen vao phan tu thu i
                break;
            }
        }
        if(found_pos_index == 0) {
            // neu khong tim thay thi chen vao vi tri cuoi cung
            n1[n] = num; // chen vao phan tu dau tien
        }
    }

    public static void  merge(int[] n1, int n, int[] n2, int m) {
        /*
        * Duyet n2
        * voi moi phan tu i thuoc n2, duyet n1, den khi tim dc vi tri k, sao cho n2[k] >=i
        * neu khong tim thay k=> chen vao n1[m]
        * neu tim thay o vi tri k, dich mang n1 tu k-1 -> n-1 sang phai roi chen vao o vi tri k-1
        * */
        for (int num: n2) {
            sol_1(n1,n, num);
            n++; // chen 1 phan tu thi tang kich thuoc mang n1
        }
        return;
    }

    public static void main(String[] args) {

        int [] n1= {3,3 ,4,6,9, 0, 0, 0};
        int [] n2= {2,6,7};
        int n = 5;
        int m = 3;
        merge(n1,n,n2,m);
        System.out.println("DONE");

    }
}
