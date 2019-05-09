package number.set;

import java.util.ArrayList;
import java.util.List;

public class NumberSet {
    public static int MAX_SIZE;
    private int[] nSet;
    private int size = 0;

    public NumberSet(int maxSize) {
        MAX_SIZE = maxSize;
        nSet = new int[maxSize];
    }

    public void add(int i) throws Exception {
        if (size == MAX_SIZE)
            throw new Exception();
        else {
            nSet[size++] = i;
        }
    }

    public List<Integer> asList() {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            intList.add(nSet[i]);
        }
        return intList;
    }

    public void remove(int i) throws Exception {
        if (size == 0)
            throw new Exception();
        else {
            for (int j = 0; j < size; j++) {
                if (nSet[j] == i) {
                    //move last element into place of removed element
                    //check this place one more time
                    nSet[j--] = nSet[--size];
                }
            }
        }
    }
}
