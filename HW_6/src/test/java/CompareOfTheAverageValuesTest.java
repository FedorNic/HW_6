import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CompareOfTheAverageValuesTest {
    private CompareOfTheAverageValues compareOfTheAverageValues;
    List<Integer> listTest;
    List<Integer> listTest2;

    /**
     * Тестовый метод вызывается перед каждым тестом. Дает каждый раз чистый экземпляр класса для тестов
     */
    @BeforeEach
    public void setUp() {
        compareOfTheAverageValues = new CompareOfTheAverageValues();
        listTest = new ArrayList<>();
        listTest2 = new ArrayList<>();
    }

    /**
     * Проверяю функцию на арифметические ошибки (ожидание-реальность)
     */
    @Test
    public void calculateAverageFromListTest1() {
        listTest.add(1);
        listTest.add(2);
        assertEquals(1.5, compareOfTheAverageValues.calculateAverageFromList(listTest));
    }
    /**
     * Проверяю функцию на арифметические ошибки (ожидание-реальность)
     */
    @Test
    public void calculateAverageFromListTest2() {
        listTest.add(0);
        listTest.add(0);
        assertEquals(0, compareOfTheAverageValues.calculateAverageFromList(listTest));
    }

    /**
     * Проверяю, что при пустом списке (делитель и делимое будет = 0) результатом будет Nan
     */
    @Test
    public void calculateAverageFromListTest3() {
        assertEquals(Double.NaN, compareOfTheAverageValues.calculateAverageFromList(listTest));
    }

    /**
     * Проверяю функцию на арифметические ошибки (ожидание-реальность)
     */
    @Test
    void compareLists1() {
        listTest.add(4);
        listTest.add(5);
        listTest2.add(4);
        listTest2.add(5);
        assertEquals(0,compareOfTheAverageValues.compareLists(listTest, listTest2));
    }

    /**
     * Проверяю функцию на арифметические ошибки (ожидание-реальность) при пустом списке
     */
    @Test
    void compareLists2() {
        assertEquals(Double.NaN,compareOfTheAverageValues.compareLists(listTest, listTest2));
    }
}