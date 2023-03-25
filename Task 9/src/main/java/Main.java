import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String s = "ABC123 &";
        String sn = null;

        Human h1=new Human ("Пуненко","Игорь","Сергеевич",18,Gender.MAN);
        Human h2=new Human ("Леушкина","Анна","",21,Gender.WOMAN);
        Student st1=new Student("Шамраев","Дмитрий","Алексеевич",19,Gender.MAN,"НГПУ","ФП","Психолог");
        Student st2=new Student("Ромлев","Коля","Сергеевич",20,Gender.MAN,"НГПУ","ФП","Психолог");
        int maxAge=25;

        Function<String, Integer> lambda1 = LambdaDemo.lengthString;
        Function<String, Character> lambda2 = LambdaDemo.firstSymbol;
        Function<String, Boolean> lambda3 = LambdaDemo.haveSpace;
        Function<String, Integer> lambda4 = LambdaDemo.searchWord;
        Function<? super Human, Integer> lambda5 = LambdaDemo.getAge;
        BiFunction<? super Human,? super Human, Boolean> lambda6 = LambdaDemo.searchNamesakes;
        Function<? super Human, String> lambda7=LambdaDemo.getFIO;
        Function<Human, Human> lambda8=LambdaDemo.addYear;

        System.out.println("Рабочая строка '"+s+"'");
        System.out.println("Человек №1: "+h1);
        System.out.println("Человек №2: "+h2);
        System.out.println("Студент №1: "+st1);
        System.out.println("Студент №2: "+st2+"\n");

        System.out.println("1. Длина строка: "+LambdaRunner.run(lambda1, s));
        System.out.println("2. Первый символ строки: "+LambdaRunner.run(lambda2, s));
        System.out.println("3. Проверка на пробелы: "+LambdaRunner.run(lambda3, s));
        System.out.println("4. Кол-во слов в строке: "+LambdaRunner.run(lambda4, s));
        System.out.println("5. Возраст человека: "+LambdaRunner.run(lambda5, h1));
        System.out.println("6. Проверка на однофамильность двух человек: "+LambdaRunner.biFunctionRun(lambda6, h1, h2));
        System.out.println("6. Проверка на однофамильность двух студент: "+LambdaRunner.biFunctionRun(lambda6, st1, st2));
        System.out.println("7. Вывести ФИО одной строкой через пробел: "+LambdaRunner.run(lambda7, h1));
        System.out.println("8. Человек становится на год старше: "+LambdaRunner.run(lambda8, h1));
        System.out.println("8. Студент становится на год старше: "+LambdaRunner.run(lambda8, st1));
        System.out.println("9. Проверка двух людей и студента, что все трое младше "+maxAge+": "+(LambdaRunner.checkAgeRun(LambdaDemo.equalsAge, h1, st1, h2, maxAge)));





    }
}
