package by.kudko.recursion;

import java.util.List;

public class CountElemRec {
    /**
     * returns number of elements or -1 if there is no elements
     *
     * @param array
     * @return
     */
    public static int countElements(List array) {
        int elementsNumber = -1;
        if (array.size() == 0) {
            return 0;
        }
        List sublist = array.subList(0, array.size() - 1);
        return 1 + countElements(array.subList(0, array.size() - 1));
    }
}
