package com.github;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,4,7,5,6,3};
        test(arr);

        int[] arr1144 = {1,1,4,4,1};
        System.out.println(test2(arr1144));
    }

    public static int[] test(int[] arr) {
        int save = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 4) save = i + 1;
        }
        if(save == 0) throw new RuntimeException();

        int[] arr2 = new int[arr.length - save];
        System.arraycopy(arr, save, arr2, 0, arr.length - save);
        return arr2;
    }

    public static boolean test2(int[] arr){
        boolean flag = false;
        boolean flag2 = false;
        for (int j : arr) {
            if (j == 4) flag = true;
            if (j == 1) flag2 = true;
        }
        return flag && flag2;
    }
}
