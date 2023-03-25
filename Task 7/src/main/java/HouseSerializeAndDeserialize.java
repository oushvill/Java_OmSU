import java.io.*;

public class HouseSerializeAndDeserialize {
    public static void houseSerialize(House house, OutputStream fileOutPut) {
        try (ObjectOutput out = new ObjectOutputStream(fileOutPut)) {
            out.writeObject(house);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static House houseDeserialize(InputStream fileInPut) {
        try (ObjectInputStream in = new ObjectInputStream(fileInPut)) {
            return (House) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}