package by.kudko.recursion;

public class SumRec {
    public static int sum(int[] array, int arrayLength) {
        int sum = 0;
        int temp;

        if (arrayLength == 1) {
           return sum = array[0];
        }
        temp = array[arrayLength - 1];

        sum = temp + sum(array, arrayLength - 1);

        return sum;
    }
}
