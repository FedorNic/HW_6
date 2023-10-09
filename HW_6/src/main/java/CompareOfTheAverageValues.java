import java.util.List;

public class CompareOfTheAverageValues {

    /**
     * Функция по подсчету среднего арифметического числа в списке целочисленных чисел
     * @param list - список
     * @return - среднее арифметическое
     */
    public double calculateAverageFromList(List<Integer> list) {
        int sum = 0;
        double average;
        for (Integer l : list) {
            sum+=l;
        }
        average = (double) sum/list.size();
        return average;
    }

    /**
     * Функция сравнения среднего арифметического числа двух списков
     * @param first - первый список
     * @param second - второй список
     * @return - результат сравнения относительно нуля (если больше нуля - значит больше среднее из первого списка итд)
     */
        public double compareLists(List<Integer> first, List<Integer> second) {
        double averageA = calculateAverageFromList(first);
        double averageB = calculateAverageFromList(second);
        return averageA-averageB;
    }
}