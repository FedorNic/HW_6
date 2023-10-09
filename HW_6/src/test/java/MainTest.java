import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    Main main;

    /**
     * Тестовый метод вызывается перед каждым тестом. Дает каждый раз чистый экземпляр класса для тестов
     */
    @BeforeEach
    public void setUp() {
        main = new Main();
    }
    /**
     * Проверяю функцию на наличие добавленных элементов
     */
    @Test
    void addRandomNumbersToListTest() {
        assertEquals(10, Main.addRandomNumbersToList().size());
    }
}