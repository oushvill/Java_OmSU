import java.awt.*;
import java.util.*;
import java.util.List;

public class CollectionsDemo {

    //1 задание
    public static int countStringsStartWith(List<String> list, char a) {
        int count = 0;
        System.out.print("'" + a + "' :");

        for (String s : list) {

            if (s != null && !s.equals("") && s.charAt(0) == a) {
                count++;
            }
        }
        return count;
    }

    //2 задание

    public static List<Human> namesakes(List<Human> people, Human anyone) {
        ArrayList<Human> result = new ArrayList<>(people.size());
        String namesakes = anyone.getSurname();

        for (Human h : people) {
            if (h.getSurname().equals(namesakes)) {
                result.add(h);
            }
        }
        return result;
    }

    //3 задание
    public static List<Human> copyArrayList(List<Human> People, Human noone) {
        ArrayList<Human> rePeople = new ArrayList<>(People);

        rePeople.remove(noone);
        return rePeople;
    }

    //4 задание
    public static List<HashSet<Integer>> listHashSets(List<HashSet<Integer>> hashSets, Set<Integer> hashSet) {
        List<HashSet<Integer>> list = new ArrayList<>(hashSets);
        List<HashSet<Integer>> resik = new ArrayList<>();

        for (HashSet<Integer> set : list) {
            HashSet<Integer> copyset = new HashSet<Integer>(set);
            set.removeAll(hashSet);

            if (copyset.equals(set)) {
                boolean isIntersect = false;
                for (int item : set) {
                    if (hashSet.contains(item)) {
                        isIntersect = true;
                        break;
                    }
                }

                if (!isIntersect) {
                    resik.add(set);
                }
            }
        }
        return resik;
    }

    //5 задание
    public static List<Human> maxAgeList(List<Human> humans) {
        int maxAge = 0;

        ArrayList<Human> result = new ArrayList<>();


        for (Human human : humans) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
            }

        }
        for (Human human : humans) {
            if (human.getAge() == maxAge) {
                result.add(human);
            }
        }
        return result;
    }

    //7 задание
    public static Set<Human> setIdContained(Map<Integer, Human> maps, Set<Integer> ids) {
        HashSet<Human> result = new HashSet<>();

        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();

            if (ids.contains(key)) {
                result.add(human);
            }
        }
        return result;
    }

    //8 задание
    public static List<Integer> ageAtLeastEighteen(Map<Integer, Human> maps) {
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();

            if (human.getAge() >= 18) {
                result.add(key);
            }
        }
        return result;
    }

    //9 задание
    public static Map<Integer, Integer> idAndAge(Map<Integer, Human> maps) {

        Map<Integer, Integer> result = new HashMap<>(maps.size());

        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            result.put(entry.getKey(), entry.getValue().getAge());
        }
        return result;
    }

    //10 задание
    public static Map<Integer, List<Human>> compareAgeAndPerson(Set<Human> humans) {
        Map<Integer, List<Human>> result = new HashMap<>();

        for (Human hum : humans) {
            List<Human> ages = new ArrayList<>();

            for (Human person : humans) {
                if (hum.getAge() == person.getAge()) {
                    ages.add(person);
                }
            }

            result.put(hum.getAge(), ages);
        }

        return result;
    }

    //10 задание
    public static Map<Integer, List<Human>> sortlist(Set<Human> humans) {
        Map<Integer, List<Human>> result = new HashMap<>();
        for (Human human : humans) {
            result.putIfAbsent(human.getAge(), new LinkedList<>());
            result.get(human.getAge()).add(human);
        }
        return result;
    }
}
