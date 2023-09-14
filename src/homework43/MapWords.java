package homework43;

import java.util.*;

public class MapWords {
    /*
    ** Задача 1 **
    Дана String с произвольным текстом (без знаков препинания слова разделены пробелом).
    Необходимо получить map, где ключем будет выступать первая буква слова, а значением,
    список слов начинающихся на эту букву.
    */

    public static void main(String[] args) {

        String string =
                "Corticosteroid hormones are important intrinsic factors that not only mediate the response " + "to " +
                        "stress but also largely contribute to the main physiological processes The biological " +
                        "actions of " + "these steroids involve the activation of specific receptors namely " +
                        "mineralocorticoid and " + "glucocorticoid receptors These two receptor types govern a " +
                        "flexible and balanced mechanism that " + "leads to the often opposing changes in the cell";

//        System.out.println(findWordByFirstLetterInString(string));
        System.out.println(findWordByFirstLetterInString1(string));
    }

    public static Map<Character, List<String>> findWordByFirstLetterInString(String string) {
        Map<Character, List<String>> result = new HashMap<>();
        if (string == null) return result;
        String[] strings = string.split(" ");
        for (String word : strings) {
            Character letter = word.charAt(0);
            result.putIfAbsent(letter, new ArrayList<>());
            result.get(letter).add(word);
        }
        return result;
    }

    public static Map<Character, List<String>> findWordByFirstLetterInString1(String string) {
        Map<Character, List<String>> result = new HashMap<>();
        if (string == null) return result;
        String[] splitedStrs = string.split(" ");
        List<String> listStr = Arrays.asList(splitedStrs);
        Set<String> strings = new HashSet<>(listStr);
        for (String word : strings) {
            Character letter = word.charAt(0);
            result.putIfAbsent(letter, new ArrayList<>());
            result.get(letter).add(word);
        }
        return result;
    }
}
