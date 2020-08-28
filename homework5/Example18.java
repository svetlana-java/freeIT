package homework5;

/*
Найти в строке не только запятые, но и другие знаки препинания. Посчитать общее их количество.
 */
public class Example18 {
    public static void main(String[] args) {
        String str = "Найти в строке не только запятые, но и другие знаки препинания. Посчитать общее их количество.";
        int n =0; // количество знаков препинания.
        char symbol;
        for(int i = 0; i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == '.'|| symbol == ',' || symbol == ';'|| symbol == ':' || symbol == '!'|| symbol == '?'){
                n++;
            }
        }
        System.out.println( "Общее количество знаков препинания " + n);
    }
}

