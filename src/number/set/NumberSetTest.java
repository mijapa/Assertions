package number.set;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSetTest {

    @Test
    void shouldCheckReturningAsList() {
        //given
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
        assertEquals(list, numberSetList);

    }

    @Test
    void shouldCheckAddingNumbers() {
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
        assertEquals(list, numberSetList);
    }

    @Test
    void shouldCheckRemovingNumbers() {
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
        assertEquals(list, numberSetList);
    }

    @Test
    void shouldCheckIfSetContainsNumber() {
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
        assertTrue(contains2);
        assertFalse(contains1);
    }

    @Test
    void shouldCheckSize() {
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
        assertEquals(3, size);
    }

    @Test
    void shouldCheckDividingAllElements() {
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
        assertEquals(list, numberSetList);
    }

    @Test
    void shouldCheckGettingSumOfElements() {
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
        assertEquals(4, sum);
    }

    @Test
    void shouldCheckGettingRandomValue() {
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
        assertEquals(0, random0);
        assertEquals(0, random19);
        assertEquals(1, random39);
        assertEquals(2, random40);
        assertEquals(2, random59);
        assertEquals(3, random79);
        assertEquals(4, random99);
    }

    @Test
    void shouldCheckOverflowWhenAddingNumbers() {
        //given
        NumberSet numberSet = new NumberSet(1);
        //when
        try {
            numberSet.add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //then
        assertThrows(Exception.class, () -> numberSet.add(2));
    }

    @Test
    void shouldCheckIfEmptyWhenRemovingNumbers() {
        //given
        NumberSet numberSet = new NumberSet(1);
        //when
        try {
            numberSet.add(1);
            numberSet.remove(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //then
        assertThrows(Exception.class, () -> numberSet.remove(2));
    }

    @Test
    void shouldCheckDividingByZero() {
        //given
        NumberSet numberSet = new NumberSet(1);
        //when
        try {
            numberSet.add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //then
        assertThrows(Exception.class, () -> numberSet.divideAllElementsBy(0));
    }

}