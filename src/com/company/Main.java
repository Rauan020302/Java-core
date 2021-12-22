package com.company;

public class Main {

    public static void main(String[] args) {
	    //BubbleSort = Пузырьком
        BubbleSort bubbleSort = new BubbleSort();
        //SelectionSort = Выбором
        SelectionSort selectionSort = new SelectionSort();
        //InsertSort = Вставка
        InsertSort insertSort = new InsertSort();
        int[] arr = {5,2,1,0,4,23,4,5,6,7,2};

        bubbleSort.sort(arr);
        System.out.println();
        selectionSort.sort(arr);
        System.out.println();
        insertSort.sort(arr);

    }
}
