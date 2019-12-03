package by.kudko.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = i + 1;
        }

        System.out.println(
                "result: " + BinarySearch.search(array, 4));
    }
}
