package com.kenuy;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 58;
        numbers[1] = 15;
        numbers[2] = 97;
        numbers[3] = 69;
        numbers[4] = 459;
        numbers[5] = 6;
        numbers[6] = 21;
        numbers[7] = 258;
        numbers[8] = 690;
        numbers[9] = 420;

        System.out.println("Before SelectionSort:");
        printArrayElements(numbers);

        SelectionSort(numbers);

        System.out.println("\n\nAfter SelectionSort in Descending Order: ");
        printArrayElements(numbers);
    }

    private static void BubbleSort(int[] arr)
    {
        for (int LastSortedIndex = arr.length - 1; LastSortedIndex > 0; LastSortedIndex--)
        {
            for (int i = 0; i < LastSortedIndex; i++)
            {
                if (arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void SelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length-1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j+"  ");
        }

    }
}
