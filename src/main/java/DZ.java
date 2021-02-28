
public class DZ {
    //1. Создать переменные всех пройденных типов данных, и инициализировать их значения.
    public static void main(String[] args) {
        System.out.println ("Я буду изучать JAVA");
        byte countByte = 127;
        short countShort = 10241;
        int countInt = 333333333;
        long countLong = 4434444445555577745L;
        float priceFloat = 123.123F;
        double priceDouble = 134567845678945678567867867878.5D;
        boolean isFinded = true;
        char charType = 1;

        System.out.println (
                " countByte: " + countByte
                        + "\n countShort: " + countShort
                        + "\n countInt: " + countInt
                        + "\n countLong: " + countLong
                        + "\n priceDouble: " + priceDouble
                        + "\n priceFloat: " + priceFloat
                        + "\n isFinded: " + isFinded
                        + "\n charType: " + charType
        );
        //\n-перевод строки

// Вызовы функций

        System.out.println (
                getResult (10.5f, 20.6f, 30.6f, 40.45f)
        );
        System.out.println (
                checkSumm (10, 5)
        );


        printPositive (-5);
        printPositive (5);
        System.out.println (
                checkPositive (10)
        );
        System.out.println (
                checkPositive (-30)
        );
        printName("Omar");
        printName("Rishat");
        yearLeap(4);
        yearLeap(16);
        yearLeap(100);
        yearLeap(200);
        yearLeap(300);
        yearLeap(400);
        yearLeap(800);

        yearLeap2 (4);
        yearLeap2 (16);
        yearLeap2 (100);
        yearLeap2 (200);
        yearLeap2 (300);
        yearLeap2 (400);
        yearLeap2 (800);



    }

    // метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    static float getResult(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /**
     * метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
     * в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */

    static boolean checkSumm(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    /**
     * метод, которому в качестве параметра передается целое число, метод
     * должен напечатать в консоль, положительное ли число передали или
     * отрицательное. Замечание: ноль считаем положительным числом.
     * */

    static void printPositive( int a){
        if (a >= 0)
            System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");

    }
    /**
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * Открываем фигурные скобки для блока If и else
     */
    static boolean checkPositive(int a){
        if (a >= 0){
            return true;
        }
        else {
            return false;
        }

    }
    /**
     * Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     * Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    static void printName (String name){
        System.out.println ("Привет, " + name + "!");

    }
    /**
     * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     * % - Деление
     */
    static void yearLeap(int year){

        if (year % 400 == 0 && year % 100 == 0){
            System.out.println (year + " - високосный");
        }
        else if (year % 4 == 0 && year % 100 > 0 ){
            System.out.println (year + " - високосный");
        }
        else {
            System.out.println (year + " - не високосный");
        }

    }
    static void yearLeap2(int year){

        if ((year % 400 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 > 0 )){
            System.out.println (year + " - високосный");
        }
        else {
            System.out.println (year + " - не високосный");
        }

    }


}


