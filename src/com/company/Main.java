package com.company;

import static com.company.BinarySearch.binarySearch;

public class Main {

    public static void main(String[] params) {
	int[] array =  {65, 23, 56, 41, 58, 99, 120, 54, 75, 87};
       // System.out.println(searchLiner(array,120));
        System.out.println( binarySearch(new int[] {1,2,3,4,5,6,7,8,9,10}, 8));

    }

    public static int searchLiner (int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind){
                System.out.println("Индекс элемента поиска: " + elementToFind);
                return i;
            }

        }
        System.out.println("не найден" + elementToFind);
        return -1;
    }
}
