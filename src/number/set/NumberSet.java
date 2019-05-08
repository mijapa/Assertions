package number.set;

import java.util.ArrayList;
import java.util.List;

public class NumberSet {
    public static int MAX_SIZE = 100;
    private int[] nSet = new int[MAX_SIZE];
    private int size = 0;

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
}
