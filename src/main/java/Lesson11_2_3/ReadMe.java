package Lesson11_2_3;

public class ReadMe {
    /*
    https://skillbox.ru/media/base/isklyucheniya_v_java_chast_1/
    - посмотреть иерархию класса == ctrl + h
    - блок try/catch -> в нем находиться блок кода, который может бросить исключение

    private static void hereWillBeTrouble(int a, int b) {
    int oops;
    try {
        System.out.println("Всё, что было до...");
        oops = a / b;
        System.out.println(oops);
        System.out.println("Всё, что будет после...");
    } catch (ArithmeticException e) {
        System.out.println("Говорили же не делить на ноль!");
        oops = 0;
    }
    System.out.println("Метод отработал");
    }

    Разберём этот код.

Если блок try кинет исключение ArithmeticException, то управление перехватит блок catch,
который выведет строку «Говорили же не делить на ноль!», а значение oops станет равным 0.
После этого программа продолжит работать как ни в чём не бывало: выполнится код после блока try-catch,
который сообщит: «Метод отработал».
Проверьте сами: запустите код выше. Вызовите метод hereWillBeTrouble с любыми значениями аргументов кроме нулевого b.
Если в блоке try не возникнет исключений, то его код выполнится целиком, а в блок catch мы даже не попадём.

     - Стектрейс (Stack trace) — это упорядоченный список методов, сквозь которые исключение пронырнуло.

     Далее приведём список java исключений, которые вам потребуются в работе чаще других:

ArithmeticException - ошибки вычислений.
NullPointerException - ссылка на пустое место.
NegativeArraySizeException - массив отрицательной размерности.
ArrayStoreException - присвоение элементу массива неправильного типа.
NumberFormatException - невозможно преобразовать строку в число.
IllegalArgumentException - неправильный аргумент при вызове метода.
UnsupportedOperationException - указанной операции не существует.
TypeNotPresentException - указанного типа не существует.
Все указанные типы java исключений содержатся в классе RuntimeException, а значит, их не надо указывать в блоке throws.

     - из-за возбуждения исключения происходит преждевременный выход из блока try,
     но по пути «наружу» выполняется раздел finally

     - В Java есть два типа исключений, checked и unchecked.
Checked исключения, это те, которые должны обрабатываться блоком catch или описываться в сигнатуре метода.
Unchecked могут не обрабатываться и не быть описанными.
Unchecked исключения в Java - наследованные от RuntimeException, checked - от Exception (не включая unchecked).
Пример unchecked исключения - NullPointerException, checked исключения - IOException.

     */
}
