import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionsTest {

    @Test
    public void countStringsStartWithTest() {
        // 1.Метод возвращает количество строк входного списка, у которых первый символ совпадает с заданным.

        char b = 'К';
        List<String> str = new ArrayList<>();
        Collections.addAll(str, "Казахстан", "Россия", "Китай", "Германия");
        assertEquals(CollectionsDemo.countStringsStartWith(str, b), 2);
    }
    @Test
    public void countStringsStartWithTestNull() {
        char b = 'К';
        List<String> str1 = new ArrayList<>();
        Collections.addAll(str1, "Казахстан", "Россия", "Китай", "Германия");
        str1.add(null);
        assertEquals(CollectionsDemo.countStringsStartWith(str1, b), 2);
    }
    @Test
    public void countStringsStartWithTestEmpty() {
        char b = 'К';
        List<String> str = new ArrayList<>();
        Collections.addAll(str, "Казахстан", "Россия", "", "Германия");
        assertEquals(CollectionsDemo.countStringsStartWith(str, b), 1);
    }


    @Test
    public void namesakesListTest() {
        // 2.Поиск однофамильцев

        List<Human> humanList1 = new ArrayList<>();

        Human human1 = new Human("Иванов", "Иван", "Иванович", 30);
        Human human2 = new Human("Иванов", "Иванко", "Иванкович", 40);
        Human human3 = new Human("Иванов", "Еван", "Еванкович", 50);

        humanList1.add(human1);
        humanList1.add(human2);
        humanList1.add(human3);

        List<Human> expected = new ArrayList<>();
        expected.add(human1);
        expected.add(human2);
        expected.add(human3);

        List<Human> humanList2 = CollectionsDemo.namesakes(humanList1, human2);
        assertEquals(expected, humanList2);
    }
    @Test
    public void namesakesListTestEmpty() {
        // 2.Поиск однофамильцев, тест на пустоту

        List<Human> humanList1 = new ArrayList<>();

        Human human1 = new Human("Грачев", "Валерий", "Фёдорович", 64);
        Human human2 = new Human("Лукашевич", "Сергей", "Сергеевич", 19);
        Human human3 = new Human("Пономарев", "Сергей", "Алексеевич", 52);


        humanList1.add(human1);
        humanList1.add(human2);

        List<Human> humanList2 = CollectionsDemo.namesakes(humanList1, human3);
        assertTrue(humanList2.isEmpty());
    }

    @Test
    public void namesakesListGoodTest() {
        // 2.Поиск однофамильцев

        List<Human> humanList1 = new ArrayList<>();

        Human human1 = new Human("Иванов", "Иван", "Иванович", 30);
        Human human2 = new Human("Иванов", "Иванко", "Иванкович", 40);
        Human human3 = new Human("Иванов", "Еван", "Еванкович", 50);

        humanList1.add(human1);
        humanList1.add(human2);
        humanList1.add(human3);

        List<Human> humanList2 = CollectionsDemo.namesakes(humanList1, human2);
        assertEquals(humanList2.size(), 3);
    }

    @Test
    public void copyArrayListTest() {
        // 3.Копирование без 1 человека

        ArrayList<Human> humanList1 = new ArrayList<>();

        Human human1 = new Human("Иванов", "Иван", "Иванович", 30);
        Human human2 = new Human("Иванов", "Иванко", "Иванкович", 40);
        Human human3 = new Human("Иванов", "Еван", "Еванкович", 50);

        humanList1.add(human1);
        humanList1.add(human2);
        humanList1.add(human3);

        List<Human> humanList2 = CollectionsDemo.copyArrayList(humanList1, human1);
        assertEquals(humanList2.size(), 2);
        assertEquals(humanList2.get(0).getName(), "Иванко");


        assertNotSame(humanList1, humanList2);
    }

    @Test
    public void hashSetsListTest() {
        // 4.Вывод непересекающихся множеств

        List<HashSet<Integer>> l = new ArrayList<>();

        HashSet<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        HashSet<Integer> b = new HashSet<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(10);

        HashSet<Integer> c = new HashSet<>();
        c.add(10);
        c.add(20);
        c.add(30);


        ArrayList<Set<Integer>> expected = new ArrayList<>();
        expected.add(a);
        l.add(a);
        l.add(b);

        assertEquals(CollectionsDemo.listHashSets(l, c), expected);
    }

    @Test
    public void maxAgeListTest() {
        // 5.Вывод студентов с max-возрастом


        List<Human> students = new ArrayList<>();
        Collections.addAll(students,new Student("Кислый", "Эльдар", "Даниярович", 22,"ФМИТ"),
                                    new Student("Лукашевич", "Сергей", "Сергеевич", 19, "ФМИТ"),
                                    new Student("Пуненко", "Игорь", "Алексеевич", 20, "ФМИТ"));

        students = CollectionsDemo.maxAgeList(students);
        assertEquals(students.get(0).getAge(), 22); //max возраст
        assertEquals(students.size(), 1); //количество студентов c max возрастом
    }

    @Test
    public void setIdContained() {
        // 7. Выводит студентов с ID-студентов совпадающие с множестов чисел

        int a = 1, b = 2, c = 3;

        Human human1 = new Human("Петров", "Антон", "Сергеевич", 19);
        Human human2 = new Human("Петров", "Федор", "Сергеевич", 19);
        Human human3 = new Human("Иванов", "Александр", "Викторович", 20);

        HashMap<Integer, Human> humanHashMap = new HashMap<>();

        humanHashMap.put(0, human1);
        humanHashMap.put(2, human2);
        humanHashMap.put(4, human3);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(a);
        hashSet.add(b);
        hashSet.add(c);

        HashMap<Integer, Human> expected = new HashMap<>();
        expected.put(2, human2);
        HashSet<Integer> expecSet = new HashSet<>();
        expecSet.add(b);

        Set<Human> humanSet  = CollectionsDemo.setIdContained(humanHashMap, hashSet);
        Set<Human> expectedSet = new HashSet<>();
        expectedSet.add(human2);

        //Set<Human> expectedSet = CollectionsDemo.setIdContained(expected, expecSet);

        assertEquals(humanSet, expectedSet);
    }

    @Test
    public void ageEighteenListTest() {
        // 8.Выводит студентов старще 18

        HashMap<Integer, Human> humanHashMap = new HashMap<>();

        HashMap<Integer, Human> expectedHashMap = new HashMap<>();

        Human human1 = new Human("Кислый", "Эльдар", "Даниярович", 17);
        Human human2 = new Human("Лукашевич", "Сергей", "Сергеевич", 17);
        Human human3 = new Human("Пуненко", "Игорь", "Алексеевич", 18);

        humanHashMap.put(1, human1);
        humanHashMap.put(2, human2);
        humanHashMap.put(3, human3);

        expectedHashMap.put(3, human3);

        List<Integer> humanList = CollectionsDemo.ageAtLeastEighteen(humanHashMap);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(3);

        assertEquals(humanList, expectedList);
    }

    @Test
    public void idAndAgeMapTest() {
        // 9. Сопоставление ID с возрастом студентов

        Map<Integer, Human> humanMap = new HashMap<>();
        //Map<Integer, Human> expectedMap = new HashMap<>();

        Human human1 = new Human("Кислый", "Эльдар", "Даниярович", 22);
        Human human2 = new Human("Лукашевич", "Сергей", "Сергеевич", 19);

        humanMap.put(1, human1);
        humanMap.put(2, human2);



        Map<Integer, Integer> humanHashMap = CollectionsDemo.idAndAge(humanMap);
        Map<Integer, Integer> expectedHashMap = new HashMap<>();
        expectedHashMap.put(1,22);
        expectedHashMap.put(2,19);



        assertEquals(humanHashMap, expectedHashMap);
    }

    @Test
    public void ageAndPersonMapTest() {
        //10.Сортировка студентов по возрасту

        Set<Human> people = new HashSet<>();

        Set<Human> peopleExpected = new HashSet<>();


        Human human1 = new Human("Кислый", "Эльдар", "Даниярович", 22);
        Human human2 = new Human("Лукашевич", "Сергей", "Сергеевич", 19);
        Human human3 = new Human("Пуненко", "Игорь", "Алексеевич", 20);


        people.add(human1);
        people.add(human2);
        people.add(human3);

        peopleExpected.add(human1);
        peopleExpected.add(human2);
        peopleExpected.add(human3);


        Map<Integer, List<Human>> humanHashMap = CollectionsDemo.sortlist(people);
        Map<Integer, List<Human>> expectedHashMap1 = new HashMap<>() ;
        expectedHashMap1.put(19, List.of(human2));
        expectedHashMap1.put(20, List.of(human3));
        expectedHashMap1.put(22, List.of(human1));



        assertEquals(expectedHashMap1, humanHashMap);
    }
}