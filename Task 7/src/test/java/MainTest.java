import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    Main main = new Main();

    /**1 задание: Запись и читка массива в 2-чном потоке
     **/
    @Test
    public void firstTest(){
        try(OutputStream out = new FileOutputStream("data.txt");
            InputStream in = new FileInputStream("data.txt")){
            int[] arr = {1, 2, 3, 4};
            int[] arr2 = new int[arr.length];
            main.writeByte(out, arr);
            main.readByte(in, arr2);
            assertArrayEquals(arr, arr2);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    /**2 задание: Запись и читка массива в символьном потоке
     **/
    @Test
    public void secondTest(){
        try(Writer writer = new FileWriter("data.txt");
            Reader reader = new FileReader("data.txt")){
            int [] arr = {4, 3, 2, 1};
            int [] arr2 = new int[arr.length];
            main.writeChars(writer, arr);
            main.readChars(reader, arr2);
            assertArrayEquals(arr,arr2 );
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    /**3 задание: Читка массива цел.чисел с заданной позицией
     **/
    @Test
    public void thirdTest() throws IOException {
        long pos = 1 * Integer.BYTES;
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\nv025\\OneDrive\\Рабочий стол\\Java\\Task 7\\data.txt", "rw");
        raf.writeInt(5);
        raf.writeInt(6);
        raf.writeInt(7);
        int[] exp = {6, 7};
        assertArrayEquals(main.readRandomAccessFile(raf, pos), exp);
        raf.close();
    }

    /**4 задание: Получение списка файлов в папке с заданным расширением
     **/
    @Test
    public void fourthTest() throws IOException{
        File dir = new File("C:\\Users\\nv025\\OneDrive\\Рабочий стол\\Java\\Task 7");
        List<File> fileRes = main.filesCatalog(".txt", dir);

        List<String> res = new ArrayList<>();
        for(File temp : fileRes){
            res.add(temp.getName());
        }

        List<String> actRes = new ArrayList<>();
        actRes.add("data.txt");
        actRes.add("test.txt");

        assertEquals(actRes, res);
    }

    /**6 задание: сериализация и десериализация типа House в заданный поток
     **/
    @Test
    public void sixthTest() throws Exception{
        List<Flat> flats = new ArrayList<>();
        List<Person> personFlat1 = new ArrayList<>();
        List<Person> personFlat2 = new ArrayList<>();
        personFlat1.add(new Person());
        personFlat1.add(new Person("Грачев", "Валерий", "Фёдорович",5,5,2002));

        personFlat2.add(new Person("Павлов", "Валерий", "Васильевич", 03, 8, 1952));
        personFlat2.add(new Person("Павлова", "Наталья", "Ильичная", 13, 2, 1954));


        flats.add(new Flat(15, 32, personFlat1));
        flats.add(new Flat(49, 47, personFlat2));


        House house = new House("71645", "пр-к Лунный 12", new Person
                ("Жимбаев", "Саян", "Рахатович", 17, 7, 1994), flats);

        OutputStream outputStream = new DataOutputStream(new FileOutputStream(new File("data.txt")));
        InputStream inputStream = new DataInputStream(new FileInputStream(new File("data.txt")));
        HouseSerializeAndDeserialize.houseSerialize(house, outputStream);
        assertEquals(house, HouseSerializeAndDeserialize.houseDeserialize(inputStream));
    }

    /**8 задание: сериализация и десериализация типа House в заданный поток с библиотекой Jackson
     **/
    @Test
    public void eighthTest() throws Exception{
        List<Flat> flats = new ArrayList<>();
        List<Person> personFlat1 = new ArrayList<>();
        List<Person> personFlat2 = new ArrayList<>();
        personFlat1.add(new Person("Жалелов", "Адиль", "Оралбекович", 3, 6, 1990));

        personFlat2.add(new Person("Павлов", "Валерий", "Васильевич", 03, 8, 1952));
        personFlat2.add(new Person("Павлова", "Наталья", "Ильичная", 13, 2, 1954));


        flats.add(new Flat(15, 80, personFlat1));
        flats.add(new Flat(49, 47, personFlat2));

        House house = new House("71645", "пр-к Лунный 12", new Person
                ("Жимбаев", "Саян", "Рахатович", 17, 7, 1994), flats);

        assertEquals(house, HouseJackson.HouseFromJson(HouseJackson.HouseToJson(house)));
    }
}