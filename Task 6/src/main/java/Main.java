import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1 задание
        System.out.println("1 задание:");

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Казахстан", "Россия", "Китай", "Германия");
        System.out.println("Список строк: " + list);
        System.out.print("Строк начинающихся на заданный символ ");
        System.out.println(CollectionsDemo.countStringsStartWith(list, 'К'));


        List<Human> People = new ArrayList<Human>();
        Collections.addAll(People,  new Human("Грачев", "Валерий", "Фёдорович", 64),
                                    new Human("Пономарев", "Анатолий", "Михайлович", 52),
                                    new Human("Бутыркин", "Иван", "Машкович", 64));


        System.out.println("\nСписок людей 2-3 задания: \n________________________________");
        for (Human sim : People) {
            System.out.println(sim);
        }
        System.out.println("________________________________\n");

        //2 задание
        System.out.println("2 задание:");
        Human anyone = new Human("Пономарев", "Сергей", "Алексеевич", 52);
        System.out.println("Однофамильцы для '" + anyone.toString() + "' найден(-о): " + CollectionsDemo.namesakes(People, anyone).size());
        System.out.println("" + CollectionsDemo.namesakes(People, anyone).toString());

        //3 задание

        Human noone = new Human("Пономарев", "Анатолий", "Михайлович", 52);
        System.out.println("\n3 задание:\nСписок без '" + noone.toString());
        System.out.println(CollectionsDemo.copyArrayList(People, noone).toString()+ "\n ");

        //4 задание
        System.out.println("4 задание:");
        List<HashSet<Integer>> hashSets= new ArrayList<>();
        HashSet<Integer> singlesSet = new HashSet<>();
        singlesSet.add(8);
        singlesSet.add(2);
        HashSet<Integer> tensSet = new HashSet<>();
        tensSet.add(6);
        tensSet.add(21);
        hashSets.add(singlesSet);
        hashSets.add(tensSet);

        System.out.println("Список входных множеств: "+hashSets);
        Set<Integer> hashSet= new HashSet<>();
        Collections.addAll(hashSet, 1,2,3,4,5);
        System.out.println("Перескающее множество: "+hashSet);
        System.out.println("Непересекающие множества: "+CollectionsDemo.listHashSets(hashSets,hashSet));

        //5 задание
        List<Human> Students = new ArrayList<>();
        Collections.addAll(Students,    new Student("ID: 1. Кислый", "Эльдар", "Даниярович", 22,"ФМИТ"),
                                        new Student("ID: 2. Лукашевич", "Сергей", "Сергеевич", 19, "ФМИТ"),
                                        new Student("ID: 3. Пуненко", "Игорь", "Алексеевич", 20, "ФМИТ"),
                                        new Student("ID: 4. Пёткин", "Пётр", "Петрович", 17, "ФМИТ"),
                                        new Student("ID: 5. Пупкин","Василий","Федорович",22,"ФМИТ"));

        System.out.println("\n\nСписок студентов для 5-10 задания: \n____________________________________________________________________");
        for (Human sim : Students) {
            System.out.println(sim);
        }
        System.out.println("____________________________________________________________________");
        System.out.println("\n5 задание:\nСтуденты с максимальным возрастом: " + CollectionsDemo.maxAgeList(Students).toString());

        //7 задание
        int a = 1, b = 0, c = 3, d = 0, e = 5;

        Human human1 = new Human("Кислый", "Эльдар", "Даниярович", 22);
        Human human2 = new Human("Лукашевич", "Сергей", "Сергеевич", 19);
        Human human3 = new Human("Пуненко", "Игорь", "Алексеевич", 20);
        Human human4 = new Human("Пёткин", "Пётр", "Петрович", 17);
        Human human5 = new Human("Пупкин","Василий","Федорович",22);

        Map<Integer, Human> maps = new HashMap<>();
        maps.put(1, human1);
        maps.put(2, human2);
        maps.put(3, human3);
        maps.put(4, human4);
        maps.put(5, human5);

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(a);
        hashSet1.add(b);
        hashSet1.add(c);
        hashSet1.add(d);
        hashSet1.add(e);

        Set<Human> humanSet = CollectionsDemo.setIdContained(maps, hashSet1);
        System.out.println("\n7 задание:\nID-студентов совпадающие с числами от 1 до 4: "+humanSet);

        //8 задание
        List<Integer> humanList = CollectionsDemo.ageAtLeastEighteen(maps);

        System.out.println("\n8 задание:\nID совершеннолетних студентов: "+humanList);

        //9 задание
        System.out.println("\n9 задание:\nСопоставление ID с возрастом студентов: "+CollectionsDemo.idAndAge(maps));

        //10 задание
        Set<Human> people = new HashSet<>();
        people.add(human1);
        people.add(human2);
        people.add(human3);
        people.add(human4);
        people.add(human5);
        Map<Integer, List<Human>> humanHashMap1 = CollectionsDemo.sortlist(people);

        System.out.println("\n10 задание:\nСортировка студентов по возрасту: "+humanHashMap1);
    }
}

