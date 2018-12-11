package com.company;

public class  InPlaceSorts {

    public  void insertionSort(int[] list1)
    {
        for (int i=1;i<list1.length;i++)
        {
            int current = list1[i];
            int x = i-1;

            while (x>=0 && list1[x]>current) // moves all of the numbers before the key right to make space.
            {
                list1[x+1] = list1[x];
                x=x-1;
            }
            list1[x+1] = current;
        }
    }

    public  void selectionSort (double list2[])
    {

        for (int i = 0; i < list2.length-1; i++)
        {
            int min = i;

            for (int x = i+1; x < list2.length; x++)
                if (list2[x] < list2[min])
                    min = x;

            swapDouble(list2,min,i);
        }


    }


    public  void bubbleSort(String[] list3) {
        for (int i = 0; i < list3.length; i++) {
            for (int j = i + 1; j < list3.length; j++) {
                if ((list3[i].compareTo(list3[j])) > 0) {
                    swapString(list3,i,j);
                }
            }
        }
    }
    public int[] randomIntArr(int count)
    {
        int[] arr =new int[count];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10000);
        }
        return arr;
    }




    public double [] IntToDouble (int [] arr)
    {
        double[] doublearr = new double[arr.length];
        for (int x=0;x<arr.length;x++)
        {
            double temp = (arr[x]);
            doublearr[x] = temp;
        }
        return doublearr;
    }

    public String [] IntToString (int [] arr) {
        String[] stringarr = new String[arr.length];
        for (int x = 0; x < arr.length; x++) {
            stringarr[x] = Integer.toString(arr[x]);
        }
        return stringarr;
    }

    public static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapDouble(double[] arr, int i, int j) {
        Double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }

    private static void mergeSortHelper(int[] elements,
                                        int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            elements[k] = temp[k];
        }
    }

    public static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j < right; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1, right);
        return i + 1;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);

            quickSort(arr,left, pivot -1);
            quickSort(arr, pivot + 1, right);

        }
    }

}

