package homework5;

/*
Имеется строка с текстом. Посчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими пробелами,
в начале и в конце текста могут быть пробелы, но могут отсутствовать.
 */
public class Example19 {
    public static void main(String[] args) {
        String str = "    Имеется строка с    текстом. Посчитать   количество слов в тексте.";
        int n = 0; // количество слов
        str = str.trim().replaceAll("[.,;:?!]", " ").replaceAll("( )+", " ");
        System.out.println(str);
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ' ') {
                n++;
            }
        }
        System.out.println("Количество слов в тексте" + n);
    }
}
