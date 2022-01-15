package Lesson4;

public record Task() {
    /*
    В качестве опционального задания, предлагаю выполнить следующее упражнение с массивами.

Разработать приложение, которое запрашивает у пользователя некоторые натуральные числа
(пусть сигналом окончания работы программы является строка exit/quit или любая другая).
Каждое из этих чисел должно соответствовать числу из ряда Фибоначчи так, что значение соответствующего элемента
берется из буфера/кэша/массива, если такой элемент представлен или рассчитывается по алгоритму ряда Фибоначчи
 и размещается в этом кэше. Т.е. имеет место следующая ситуация:

1. Пользователь запрашивает 20й элемент ряда Фибоначчи.

2. Программа вычисляет соответствующие элементы последовательности вплоть до 20го элемента,
 размещает их в массиве и возвращает 20й элемент.

3. Пользователь запрашивает 12й элемент - значение берется из кэша.

4. Пользователь запрашивает 25й элемент - вычисляются элементы ряда с 21го по 25й и дополняют кэш.
Пользователю выводится нужное значение.

5. И т.д. соблюдая логику: если элемент есть в кэше, то берем его оттуда, если нет - то вычисляем элемент
 и все предшествующие значения и размещаем в кэше (рекомендуется не переписывать кэш,
  а отталкиваться от последнего известного значения).
     */
}
