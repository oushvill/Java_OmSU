
1. Напишите программу, которая выводит на консоль строку “Hello, World!”.
2. Напишите программу, которая вводит три вещественных числа и выводит их
произведение, среднее арифметическое, а также сами эти числа в порядке
возрастания.
3. Модифицируйте программу из предыдущей задачи так, чтобы она работала с
целыми числами. Правильно ли работает ваша программа, если на вход подать
числа 1, 2, 5?
4. Напишите программу, которая вводит три вещественных числа, понимая их как
коэффициенты квадратного уравнения. Программа производит анализ этого
уравнения на предмет количества корней и находит корни.
5. Протабулируйте функцию sin(x) в заданных пределах и с заданным шагом.
6. Напишите программу для решения системы двух линейных уравнений с двумя
неизвестными в вещественных числах.
7. Напишите программу вычисления функции exp(x) разложением в ряд Тейлора с
заданной точностью. Программа должна суммировать члены ряда до тех пор, пока
модуль очередного члена ряда не станет меньше точности.

Работа с массивами

Напишите класс с набором методов для работы с массивом целых чисел.
8. Вывод массива на консоль.
9. Ввод элементов массива с клавиатуры.
10. Сумма всех элементов массива.
11. Количество четных чисел в массиве.
12. Количество элементов массива, принадлежащих отрезку [a; b].
13. Проверка: все ли элементы массива положительные.
14. Переставьте в массиве элементы в обратном порядке.

Простые классы

15. Разработайте класс Point3D (точка в трехмерном пространстве). Точка хранится в
виде набора декартовых координат. Методы:
1) конструктор по координатам,
2) конструктор без параметров (создает точку – начало координат),
3) геттеры и сеттеры,
4) вывод точки на консоль.
Создайте несколько объектов этого класса. Сравните две точки на равенство. Для
какого-то из объектов проверьте, равна ли эта точка сама себе.

16. Разработайте класс Vector3D (вектор в трехмерном пространстве). Вектор хранится
в виде набора своих координат. Методы:
1) конструктор без параметров (создает нулевой вектор),
2) конструктор по координатам,
3) конструктор по двум точкам (Point3D),
4) длина вектора,
5) проверка равенства с заданным вектором.

17. Разработайте класс Vector3DProcessor с методами:
1) сумма и разность двух векторов,
2) скалярное произведение двух векторов,
3) векторное произведение двух векторов,
4) проверка коллинеарности двух векторов.

18. Разработайте класс Vector3DArray (массив трехмерных векторов). Методы:
1) конструктор по размеру (создает массив из нулевых векторов),
2) длина массива,
3) замена i-го элемента массива на заданный вектор,
4) наибольшая длина вектора в массиве,
5) поиск заданного вектора в массиве (результат – индекс первого вхождения или
–1, если не найден),
6) сумма всех векторов в массиве,
7) метод, который получает на вход массив вещественных чисел (коэффициентов)
и вычисляет линейную комбинацию векторов с заданными коэффициентами.
При несовпадении длин массивов векторов и коэффициентов, результатом
считать нулевой вектор (если кто-то знает, как работать с исключениями, то
выбросить исключение),
8) метод, который получает на вход точку P (типа Point3D) и вычисляет массив
точек, каждая из которых – результат сдвига точки P, на соответствующий
вектор.
