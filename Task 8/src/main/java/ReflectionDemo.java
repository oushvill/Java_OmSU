import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {
    public static int getCountOfHumans(List<Object> listOfSomething){
        int count = 0;
        for(int i = 0; i < listOfSomething.size(); i++){
            if(listOfSomething.get(i) instanceof Human){
                count++;
            }
        }
        return count;
    }

    public static List<String> getNamesOfPublicMethods(Object obj) {
        List<String> listOfMethods = new ArrayList<>();

        Class<?> classData = obj.getClass();
        Method[] methods = classData.getMethods();
        for(Method method : methods){
            listOfMethods.add(method.getName());
        }
        return listOfMethods;
    }

    public static List<String> getNamesOfSupperclasses(Object obj){
        List<String> result = new ArrayList<>();
        Class<?> classData = obj.getClass().getSuperclass();
        while (classData != null){
            result.add(classData.getName());
            classData = classData.getSuperclass();
        }
        return result;
    }
}