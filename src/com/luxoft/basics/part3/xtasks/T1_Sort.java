package com.luxoft.basics.part3.xtasks;

import java.util.Arrays;

public class T1_Sort
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = {3, 0, 2, 1, 6, 8, 4, 7, 5, 9};

        System.out.println(Arrays.toString(numbers));
        System.out.println();

        sortAsc(numbers);

        System.out.println(Arrays.toString(numbers));

        int[] arrToCheck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Is numbers sorted: " + String.valueOf(Arrays.equals(arrToCheck, numbers)).toUpperCase());
    }

    /**
     *
     * Method should sort data array ascending order.
     *
     */
    public static void sortAsc(int[] data) {
        int a = data[0];
        int b = data[1];
        int c = data[2];
        int d = data[3];

        if (a > b)
        {
            swap(data, 0, 1);
            if (b > c)
                swap(data, 1, 2);
        }
        }




    /**
     *
     * Method should exchange values with idx1 and idx2 in data array.
     *
     */
    public static void swap(int[] data, int idx1, int idx2)
    {
        int a = data[idx1];
        int b = data[idx2];
        data[idx1] = b;
        data[idx2] = a;

    }
}
