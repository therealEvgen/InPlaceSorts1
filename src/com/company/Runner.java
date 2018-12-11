package com.company;

public class Runner {

    public static void main(String[] args) {

        InPlaceSorts y = new InPlaceSorts();

        int[] intarr = y.randomIntArr(10);
        double[] Doublearr = y.IntToDouble(intarr);
        String[]  Stringarr = y.IntToString(intarr);


        long time = System.nanoTime();
        y.insertionSort(intarr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken - Insertion Sort: "+ time);

        long time2 = System.nanoTime();
        y.selectionSort(Doublearr);
        time2 = System.nanoTime() - time2;
        System.out.println("Time Taken - Selection Sort: "+ time2);


        long time3 = System.nanoTime();
        y.bubbleSort(Stringarr);
        time3 = System.nanoTime() - time3;
        System.out.println("Time Taken - Bubble Sort: "+ time3);

        int[] ekor = {10, 23, 3 ,4 ,6};
        InPlaceSorts.quickSort(ekor, 0, ekor.length-1);
        System.out.println(ekor[0]);
        System.out.println(ekor[1]);
        System.out.println(ekor[2]);
        System.out.println(ekor[3]);
        System.out.println(ekor[4]);

    }
}