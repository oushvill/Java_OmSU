import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    public void firstTest() {
        Human human1 = new Human("Игорь", "Пуненко");
        Human human2 = new Human("Никита", "Яворский");

        List<Object> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(1);
        list.add("");
        list.add(null);

        List<Object> listExpected = new ArrayList<>();
        listExpected.add(human1);
        listExpected.add(human1);

        assertEquals(ReflectionDemo.getCountOfHumans(list),ReflectionDemo.getCountOfHumans(listExpected));
        assertEquals(ReflectionDemo.getCountOfHumans(list),2);
    }

    @Test
    public void secondTest(){
        Human human = new Human("Игорь", "Пуненко");
        assertEquals(ReflectionDemo.getNamesOfPublicMethods(human).toString(),"[toString, getName, getSurname, wait, wait, wait, equals, hashCode, getClass, notify, notifyAll]");
    }

    @Test
    public void thirdTest () {
        Person person = new Person("Тюлькина","Екатерина");
        assertEquals(ReflectionDemo.getNamesOfSupperclasses(person).toString(),"[Human, java.lang.Object]");
    }
}