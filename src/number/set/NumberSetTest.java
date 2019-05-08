package number.set;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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


}