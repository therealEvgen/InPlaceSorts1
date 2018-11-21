package com.company;

public class InPlaceSorts {
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = left; k <= right; k++) {
            arr[k] = temp[k];
        }
    }

    public static void selectionSort(double[] list1) {
        for (int i = 0; i < list1.length; i++) {
            double curMin = list1[i];

            for (int j = i+1; j < list1.length; j++) {
                if (list1[j] < curMin) {
                    curMin = list1[j];
                    swapD(list1,i,j);
                }
            }
        }

    public static void bubbleSort(String[] list1) {
        int swaps = 1;
        while (swaps!=0) {
            swaps = 0;
            for (int i = 0; i < list1.length-1; i++) {
                if (list1[i].compareTo(list1[i+1]) > 0) {
                    swapArr(list1, i, i+1);
                    swaps++;
                }
            }
        }
    }

    public class InsertionSort(int[] list1) {
            void Insertionsort(int list1[])
        {
            int n = list1.length;
            for (int i=1; i<n; ++i)
            {
                int key = list1[i];
                int j = i-1;
                while (j>=0 && list1[j] > key)
                {
                    list1[j+1] = list1[j];
                    j = j-1;
                }
                list1[j+1] = key;
            }
        }
    }
    public static void swapI(int list1[], int i, int j){
        int temp = list1[i];
        list1[i]=list1[j];
        list1[j]=temp;
    }
    public static void swapD(double list1[], int i, int j){
        double temp = list1[i];
        list1[i]=list1[j];
        list1[j]=temp;
    }
    public static void swapS(String list1[], int i, int j){
        String temp = list1[i];
        list1[i]=list1[j];
        list1[j]=temp;
    }
    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static int[] randInt(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static double[] randDouble(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*10000;
        }
        return arr;
    }

    }


