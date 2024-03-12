package ch11.List;

import java.util.ArrayList;
import java.util.Arrays;

public class C04Arrays {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4}; //arr = [0, 1, 2, 3, 4]
        int[] arr2 = Arrays.copyOf(arr, arr.length); //arr2 = [0, 1, 2, 3, 4]
        int[] arr3 = Arrays.copyOf(arr, 3); //arr3 = [0, 1, 2]
        int[] arr4 = Arrays.copyOfRange(arr, 0,4); //arr4 = [0, 1, 2, 3]
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));


        int[] arr5 = new int[5];
        Arrays.fill(arr5, 8);
        System.out.println(Arrays.toString(arr5)); //[8, 8, 8, 8, 8]

        int[] arr6 = {3,6,7,9,8};
        int idx = Arrays.binarySearch(arr6,8); //-4(x)

        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));
        int idx2 = Arrays.binarySearch(arr6,8); //3

    }
}
