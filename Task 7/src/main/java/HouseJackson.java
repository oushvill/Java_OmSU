import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class HouseJackson {
    public static String HouseToJson(House house) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(house);
    }

    public static House HouseFromJson(String stringJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(stringJson, House.class);
    }
}