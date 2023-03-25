Задачи на лабораторные работы

Reflection

(Задачи со звездочками необязательные)

Напишите класс ReflectionDemo со следующими методами.
1. Дан список объектов произвольных типов. Найдите количество элементов списка, которые
являются объектами типа Human или его подтипами.
2. Для объекта получить список имен его открытых методов.

3. Для объекта получить список (в виде списка строк) имен всех его суперклассов до класса
Object включительно.
4. *Напишите интерфейс Executable с методом
void execute();

Напишите метод, который для списка объектов находит его элементы, реализующие этот
интерфейс, и выполняет в таких объектах метод execute(). Метод возвращает количество
найденных элементов.
5. *Для объекта получить список его геттеров и сеттеров (в виде списка строк). Геттером
считаем открытый нестатический метод без параметров, значение которого не void, а имя
начинается с get. Сеттером считаем открытый нестатический метод с одним параметром, с
результатом типа void, а имя метода начинается с set.