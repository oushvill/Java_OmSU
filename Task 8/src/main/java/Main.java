import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        Human human1 = new Human("Игорь","Пуненко");
        Human human2 = new Human("Никита","Яворский");
        Human human3 = new Human("Дмитрий","Фисун");
        List<Object> list = new ArrayList<>();

        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(1);
        list.add("Персонажи");
        list.add("");
        list.add(null);

        Person person = new Person("Тюлькина","Екатерина");
        list.add(person);

        System.out.println("Кол-во объектов Human в списке: "+ReflectionDemo.getCountOfHumans(list));
        System.out.println("Список открытых методов объекта из списка: "+ReflectionDemo.getNamesOfPublicMethods(human1));
        System.out.println("Список классов объекта из списка: "+ReflectionDemo.getNamesOfSupperclasses(person));
    }
}