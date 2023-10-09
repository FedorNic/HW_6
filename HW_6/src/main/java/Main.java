import java.util.ArrayList;
import java.util.List;

public class Main {

//    static List<Integer> list1;
//    static List<Integer> list2;
//    static CompareOfTheAverageValues result;

    /**
     * Функция по заполнению списка случайными числами
     * @return - возвращает список
     */
    public static List<Integer> addRandomNumbersToList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10) + 1);
        }
        return list;
    }

//    public static void main(String[] args) {
//        list1 = addRandomNumbersToList();
//        System.out.println(list1);
//
//        list2 = addRandomNumbersToList();
//        System.out.println(list2);
//
//        result = new CompareOfTheAverageValues();
//        double number = result.compareLists(list1, list2);
//        if (number > 0) {
//            System.out.println("Первый список имеет большее среднее значение");
//        } else if (number < 0) {
//            System.out.println("Второй список имеет большее среднее значение");
//        } else {
//            System.out.println("Средние значения равны");
//        }
//    }
}