package homework5;

/*
Напишите три цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
другой с помощью StringBuilder и метода append, а также StringBuffer. Сравните скорость их выполнения.
 */
public class Example21 {
    public static void main(String[] args) {
        //Цикл сложения строк с помощью оператора сложения и String
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Время сложения строк с помощью оператора сложения " + (end - start));
//Цикл сложения строк с помощью StringBuilder
        StringBuilder sb = new StringBuilder("");
        long startSb = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long endSb = System.currentTimeMillis();
        System.out.println("Время сложения строк с помощью StringBuilder " + (endSb - startSb));
//Цикл сложения строк с помощью StringBuffer
        StringBuffer sb1 = new StringBuffer("");
        long startSb1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long endSb1 = System.currentTimeMillis();
        System.out.println("Время сложения строк с помощью StringBuffer " + (endSb1 - startSb1));
    }
}
