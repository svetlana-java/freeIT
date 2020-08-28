package homework5;

/*
Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */
public class Example20 {
    public static void main(String[] args) {
        String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        str = str.trim().replaceAll("[,.;:?!]", " ").replaceAll("( )+", " "); //создаю строку, содержащую только пробелы.
        String[] words = str.split(" "); // создаю массив строк, где каждый элемент массива слово.
        for (String word : words) {
            char letter = word.charAt(word.length() - 1);
            System.out.print(letter);
        }
    }
}