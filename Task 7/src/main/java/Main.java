import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**1 задание: Запись и читка массива в 2-чном потоке
    **/
    public void writeByte(OutputStream out, int[] arr) {
        try (DataOutputStream outputStream = new DataOutputStream(out)) {
            for (int temp : arr) {
                outputStream.writeInt(temp);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
//            System.out.println(ex.getMessage());
        }
    }
    public void readByte(InputStream in, int[] arr) {
        try (DataInputStream dataInputStream = new DataInputStream(in)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = dataInputStream.readInt();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**2 задание: Запись и читка массива в символьном потоке
     **/
    public void writeChars(Writer out, int[] arr) {
        try (BufferedWriter writer = new BufferedWriter(out)) {
            for (int temp : arr) {
                writer.write(String.valueOf(temp));
                writer.write(' ');
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void readChars(Reader in, int[] res) {
        try (BufferedReader reader = new BufferedReader(in)) {
            String[] numbers = reader.readLine().split(" ");
            for (int i = 0; i < res.length; i++) {
                res[i] = Integer.parseInt(numbers[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**3 задание: Читка массива цел.чисел с заданной позицией
     **/
    public int[] readRandomAccessFile(RandomAccessFile raf, long position) throws IOException {
        int[] res = new int[(int) (raf.length() - position) / Integer.BYTES];
        raf.seek(position);
        for (int i = 0; i < res.length; i++) {
            res[i] = raf.readInt();
        }
        return res;
    }

    /**4 задание: Получение списка файлов в папке с заданным расширением
     **/
    public List<File> filesCatalog(String expansion, File directory) throws IOException {
        List<File> res = new ArrayList<>();
        File[] listFiles = directory.listFiles(File::isFile);

        if (listFiles == null) {
             throw new IOException("Empty catalog");
        }

        for (File temp : listFiles) {
            if (temp.getName().endsWith(expansion)) {
                res.add(temp);
            }
        }
        return res;
    }
}