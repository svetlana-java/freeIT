package homework5;

/*
Создать класс и объекты, описывающие промежуток времени.
 */


public class Examrle24 {
    public static void main(String[] args) {
        TimeInterval time1 = new TimeInterval(4, 5, 6);
        TimeInterval time2 = new TimeInterval(4, 5,5);
        System.out.println("Сравнение объектов time1 и time2 - " + time1.equals(time2));
        time1.print();
        time2.print();

    }
}

class TimeInterval{
    private int sec;
    private int min;
    private int hour;

    public TimeInterval(int sec){
        this.sec = sec;
    }
    public TimeInterval (int sec, int min, int hour){
        this.sec= sec;
        this.min= min;
        this.hour = hour;
    }
    public int allSecond(){
        int allsec = sec + min*60 + hour*3600;
        return allsec;
    }
       public boolean equals (Object obj){
        TimeInterval otherTimeInterval= (TimeInterval)obj;
        return  this.sec== otherTimeInterval.sec && this.min == otherTimeInterval.min && this.hour== otherTimeInterval.hour;
       }
       public void print(){
           System.out.println("Количество секунд - " + sec + "; количество минут - " + min + " ; количество часов - "+ hour + " ; общее количество секунд - " + allSecond());

       }
}