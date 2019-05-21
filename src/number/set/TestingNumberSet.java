package number.set;

import java.util.ArrayList;
import java.util.List;

public class TestingNumberSet {
    public static void testAll() {
        checkReturningAsList();
        checkAddingNumbers();
        checkRemovingNumbers();
        checkIfSetContainsNumber();
        checkSize();
        checkDividingAllElements();
        checkGettingSumOfElements();
        checkGettingRandomValue();
        System.out.println("Wszystkie testy przebiegły pomyślnie");

    }

    public static void checkReturningAsList() {
        NumberSet numberSet = new NumberSet(10);
        List<Integer> list = new ArrayList<>();

        //when
        try {
            numberSet.add(1);
            numberSet.add(2);
            numberSet.add(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> numberSetList = numberSet.asList();

        //then
        assert (list.equals(numberSetList)) : "listy powinny być równe";
    }

    public static void checkAddingNumbers() {
        //given
        NumberSet numberSet = new NumberSet(10);
        List<Integer> list = new ArrayList<>();

        try {
            numberSet.add(100);
            numberSet.add(200);
            numberSet.add(300);
            numberSet.add(-300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(-300);

        List<Integer> numberSetList = numberSet.asList();

        //then
        assert (list.equals(numberSetList)) : "listy powinny być równe";
    }

    public static void checkRemovingNumbers() {
        //given
        NumberSet numberSet = new NumberSet(10);
        List<Integer> list = new ArrayList<>();

        //when
        try {
            numberSet.add(2);
            numberSet.add(1);
            numberSet.add(2);
            numberSet.add(3);
            numberSet.add(-3);
            numberSet.add(2);
            numberSet.remove(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add(-3);
        list.add(1);
        list.add(3);

        List<Integer> numberSetList = numberSet.asList();

        //then
        assert (list.equals(numberSetList)) : "listy powinny być równe";
    }

    public static void checkIfSetContainsNumber() {
        //given
        NumberSet numberSet = new NumberSet(10);

        //when
        try {
            numberSet.add(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean contains2 = numberSet.contains(2);
        boolean contains1 = numberSet.contains(1);

        //then
        assert (contains2);
        assert (!contains1);
    }

    public static void checkSize() {
        //given
        NumberSet numberSet = new NumberSet(10);

        //when
        try {
            numberSet.add(1);
            numberSet.add(2);
            numberSet.add(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int size = numberSet.getSize();

        //then
        assert (3 == size) : "rozmiary powinny być równe";
    }

    public static void checkDividingAllElements() {
        //given
        NumberSet numberSet = new NumberSet(10);
        List<Integer> list = new ArrayList<>();

        //when
        try {
            numberSet.add(2);
            numberSet.add(1);
            numberSet.add(2);
            numberSet.add(3);
            numberSet.add(-3);
            numberSet.add(2);
            numberSet.divideAllElementsBy(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(-1);
        list.add(1);

        List<Integer> numberSetList = numberSet.asList();

        //then
        assert (list.equals(numberSetList)) : "listy powinny być równe";
    }

    public static void checkGettingSumOfElements() {
        //given
        NumberSet numberSet = new NumberSet(10);

        //when
        try {
            numberSet.add(1);
            numberSet.add(2);
            numberSet.add(3);
            numberSet.add(-2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int sum = numberSet.getSumOfElements();
        //then
        assert (4 == sum) : "suma elementów jest nieprawidłowa";
    }

    public static void checkGettingRandomValue() {
        //given
        NumberSet numberSet = new NumberSet(10);

        //when
        try {
            numberSet.add(0);
            numberSet.add(1);
            numberSet.add(2);
            numberSet.add(3);
            numberSet.add(4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int random0 = 0;
        int random19 = 0;
        int random39 = 0;
        int random40 = 0;
        int random59 = 0;
        int random79 = 0;
        int random99 = 0;
        try {
            random0 = numberSet.getRandomValue(0);
            random39 = numberSet.getRandomValue(0.39);
            random40 = numberSet.getRandomValue(0.40);
            random59 = numberSet.getRandomValue(0.59);
            random79 = numberSet.getRandomValue(0.79);
            random99 = numberSet.getRandomValue(0.99);
            random19 = numberSet.getRandomValue(0.19);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //then
        assert (0 == random0);
        assert (0 == random19);
        assert (1 == random39);
        assert (2 == random40);
        assert (2 == random59);
        assert (3 == random79);
        assert (4 == random99);
    }

}
