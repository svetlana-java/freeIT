public class Lesson_01 {

    public static void main(String[] args) {
        int number = 234;

        if (number < 0) {
            System.out.println("Число отрицательное.");
        } else if (number > 0){
            System.out.println("Число положительное.");
        }  else {
            System.out.println("Вы ввели ноль.");
        }

        if (number > 0 && number <= 9 || number < 0 && number >= -9) {
            System.out.println("Число однозначное.");
        } else if (number >= 10 && number <= 99 || number <= -10 && number >= -99) {
            System.out.println("Число двухзначное.");
        } else if (number >= 100 && number <= 999 || number <= -100 && number >= -999){
            System.out.println("Число трехзначное.");
        } else if (number >= 1000 || number <= -1000){
            System.out.println("Число, у которого больше 3-х цыфр.");
        }
    }
}
