import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {

    /**1.Получить длину строки**/
    public static final Function<String,Integer> lengthString = (s)->{
        if((s)==null) {
          return null;
        }
        int length=s.length();
        return length;
    };

    /**2.Получить первый символ строки, иначе null**/
    public static final Function<String, Character> firstSymbol = (s) ->  Optional.ofNullable(s)
            .filter(x -> !x.isEmpty()).map(y -> y.charAt(0)).orElse(null);

    /**3.Проверка строки на пробелы**/
    public static final Function<String, Boolean> haveSpace = (s) -> (!s.contains(" "));

    /**4.Поиск на количество слов в строке**/
    public static final Function<String, Integer> searchWord = (s)-> {
        if (s == null || s.isEmpty()) {
            return null;
        }
        List<String> arr = new ArrayList<>();
        String[] arr1 = s.split(",");

        for(String ss : arr1){
            if((!ss.equals("") && !ss.equals(" "))){
                arr.add(ss);
            }
        }
        return arr.size();
    };

    /**5.Получить возраст человека**/
    public static final Function<? super Human, Integer> getAge = Human::getAge;

    /**6.Проверка на однофамильцев**/
    public static final BiFunction<? super Human, ? super Human, Boolean> searchNamesakes = (h1, h2) -> h1.getSurname().equals(h2.getSurname());

    /**7. Получить/вывести ФИО одной строкой через пробел**/
    public static final Function<? super Human, String> getFIO = (h) -> String.format("%s %s %s",h.getSurname(), h.getName(), h.getMidname());

    /**8.Добавить к возрасту человека 1 год**/
    public static final Function<Human, Human> addYear = (h) -> new Human(h.getSurname(),h.getName(), h.getMidname(), h.getAge() + 1, h.getGender());

    /**9.Проверка на макс.возраст троих людей**/
    public static final IEqualsMaxAge equalsAge = (h1, h2, h3, maxAge) -> (h1.getAge() < maxAge && h2.getAge() < maxAge && h3.getAge() < maxAge);

}


