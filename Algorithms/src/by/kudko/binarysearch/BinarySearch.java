package by.kudko.binarysearch;

public class BinarySearch {

    /**
     * return index of element in array, or -1 if array doesn't contain an item
     *
     * @param array
     * @param item
     * @return
     */
    public static int search(int[] array, int item) {
        int index = -1;
        int low = 0; //first element number
        int high = array.length - 1; //last element number
        int mid;
        int guess;

        while (low <= high) {

            mid = (high + low) / 2;
            guess = array[mid];

            if (guess == item) {
                index = mid;
                return index;
            }
            if (item < guess) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return index;
    }
}
