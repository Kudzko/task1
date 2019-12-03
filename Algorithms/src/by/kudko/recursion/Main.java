package by.kudko.recursion;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("Sum of array elements: " + SumRec.sum(array, array.length));

        Integer[] array2 = new Integer[5];

        for (int i = 0; i < array.length; i++) {
            array2[i] = i + 1;
        }

        List<Integer> list = Arrays.asList(array2);
        System.out.println("Elements number: " + CountElemRec.countElements(list));

        int [] array3 = {2,5,4,1,3};
        System.out.println("Max element: " + MaxElement.maxElement(array3));
    }
}
