import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Tests {
    String s1 = "ABC123 &";
    String s2 = "abc123 &";
    String s3 = "ABC, 123, &";
    String s5 = "AAA";
    String snull = null;

    Human h1=new Human ("Пуненко","Игорь","Сергеевич",18,Gender.MAN);
    Human h2=new Human ("Леушкина","Анна","",21,Gender.WOMAN);
    Human h3= new Human("Ромлев","Коля","Сергеевич", 20, Gender.MAN);
    Student st1=new Student("Шамраев","Дмитрий","Алексеевич",19,Gender.MAN,"НГПУ","ФП","Психолог");
    Student st2=new Student("Пуненко","Алексей","Алексеевич",25,Gender.MAN,"ОмГПУ","ФМИТ","Магистр");


    /**1.Получить длину строки**/
    @Test
    public void firstTest(){
        Function<String, Integer> lambda = LambdaDemo.lengthString;
        assertEquals(Optional.of(8), Optional.ofNullable(LambdaRunner.run(lambda, s1))); //добавить на нулл
        assertNull(LambdaRunner.run(lambda,snull));
    }


    /**2.Получить первый символ строки, иначе null**/
    @Test
    public void secondTest(){
        Function<String, Character> lambda = LambdaDemo.firstSymbol;
        assertEquals(Optional.of('A'),Optional.ofNullable(LambdaRunner.run(lambda,s1)));
        assertNull(LambdaRunner.run(lambda, null));
        assertNull(LambdaRunner.run(lambda, ""));
    }

    /**3.Проверка строки на пробелы**/
    @Test
    public void thirdTest(){
        Function<String, Boolean> lambda = LambdaDemo.haveSpace;
        assertEquals(false, LambdaRunner.run(lambda,s2)); //добавить на тру
        assertEquals(true, LambdaRunner.run(lambda,s5));
    }

    /**4.Поиск на количество слов в строке**/
    @Test
    public void fourthTest(){
        Function<String, Integer> lambda = LambdaDemo.searchWord;
        assertEquals(Optional.of(3), Optional.ofNullable(LambdaRunner.run(lambda,s3)));
        assertEquals(Optional.of(1), Optional.ofNullable(LambdaRunner.run(lambda,"aaa")));
        assertNull(LambdaRunner.run(lambda,snull));
    }

    /**5.Получить возраст человека**/
    @Test
    public void fifthTest(){
        Function<? super Human, Integer> lambda = LambdaDemo.getAge;
        assertEquals(Optional.of(18), Optional.ofNullable(LambdaRunner.run(lambda, h1)));
        assertEquals(Optional.of(19), Optional.ofNullable(LambdaRunner.run(lambda, st1)));
    }

    /**6.Проверка на однофамильцев**/
    @Test
    public void sixthTest(){
        BiFunction<? super Human, ? super Human, Boolean> lambda = LambdaDemo.searchNamesakes;
        assertEquals(false,LambdaRunner.biFunctionRun(lambda, h1, st1));
        assertEquals(true,LambdaRunner.biFunctionRun(lambda, h1, st2));//добавить на тру
    }

    /**7. Получить/вывести ФИО одной строкой через пробел**/
    @Test
    public void seventhTest(){
        Function<? super Human, String> lambda = LambdaDemo.getFIO;
        assertEquals("Пуненко Игорь Сергеевич", LambdaRunner.run(lambda, h1));
        assertEquals("Шамраев Дмитрий Алексеевич", LambdaRunner.run(lambda, st1));
    }

    /**8.Добавить к возрасту человека 1 год**/
    @Test
    public void eightTest(){
        Function<Human,Human> lambda = LambdaDemo.addYear;
        assertEquals(19, LambdaRunner.run(lambda, h1).getAge());
        assertEquals(20, LambdaRunner.run(lambda, st1).getAge());
    }

    /**9.Проверка на макс.возраст троих людей**/
     @Test
    public void ninthTest(){
        int maxAge1 = 22;
        int maxAge2 = 18;

        assertTrue(LambdaDemo.equalsAge.checkHumansAndMaxAge(h1, h2, h3, maxAge1));
        assertFalse(LambdaDemo.equalsAge.checkHumansAndMaxAge(h1, h2, h3, maxAge2));
        assertFalse(LambdaRunner.checkAgeRun(LambdaDemo.equalsAge, h1, h2, h3, 20)); //с помощью класса LambdaRunner
    }
}
