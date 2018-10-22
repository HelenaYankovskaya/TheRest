
public class Main {
    public static void main(String[] args) {
        int s = 777690;
        int sec, m, min;
        int h, d1, den, ned;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;

        d1 = h % 24;                   //  задание 2 страница 17
        den = (h - d1) / 24;
        ned = den / 7;
        System.out.println(h + " час; " + min + " минутa; " + sec + " секунд; ");
        System.out.println(den + " дней; " + ned + "неделя ");


        int rub = (int) (Math.random() * 10 + 1);   // задание 5 страница 22
        System.out.println(rub + " - случайное число");
        if (rub == 1) {
            System.out.println(rub + " рубль");
        } else if (rub > 1 && rub < 5) {
            System.out.println(rub + " рубля");
        } else {
            System.out.println(rub + " рублей");
        }

        int day, mounth, year;     // задание 6 страница 23
        int day1, mounth1, year1;
        day = 19;
        mounth = 10;
        year = 2018;

        System.out.println(day + "." + mounth + "." + year + " = сегодня");
        if (day == 30 && (mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11)) {
            day1 = 1;
            mounth1 = mounth + 1;
            System.out.println(day1 + "." + mounth1 + "." + year + " = завтра");
        } else if (day == 28 && mounth == 2) {
            mounth1 = mounth + 1;
            day1 = 1;
            System.out.println(day1 + "." + mounth1 + "." + year + " = завтра");
        } else if (day == 31 && (mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 8 || mounth == 10)) {
            day1 = 1;
            mounth1 = mounth + 1;
            System.out.println(day1 + "." + mounth1 + "." + year + " = завтра");
        } else if (day == 31 && mounth == 12) {
            year1 = year + 1;
            day1 = 1;
            mounth1 = 1;
            System.out.println("Happy New Year!!!! = " + day1 + "." + mounth1 + "." + year1);
        } else if (day > 31 || mounth > 12) {
            System.out.println("!!! Error !!!");
        } else {
            day1 = day + 1;
            System.out.println(day1 + "." + mounth + "." + year + "= завтра");
        }

        int a, b, c, d;                       // задание 7 страница 23
        a = 6;
        b = 15;
        c = 6;
        d = 8;
        int e = 10;
        int f = 10;

        if (a <= e && b <= f || b <= e && a <= f) {
            System.out.println("Первый дом, размером " + a + "х" + b + " помещается на участке, размером " + e + "х" + f);
        } else
            System.out.println("!!!!Первый дом, размером " + a + "х" + b + " не помещается на участке, размером " + e + "х" + f);

        if (c <= e && d <= f || d <= e && c <= f) {
            System.out.println("Второй дом, размером " + c + "х" + d + " помещается на участке, размером " + e + "х" + f);
        } else
            System.out.println("!!!!Второй дом, размером " + c + "х" + d + " не помещается на участке, размером " + e + "х" + f);

        int p = (int) (Math.random() * 10); //задание 11 страница 28
        System.out.println(p);
        int i2 = 2;
        while (p % i2 != 0) {
            i2++;
        }
        if (i2 == p || p == 1) {
            System.out.println("Число " + p + " простое");
        } else {
            System.out.println("Число " + p + " не является простым");
        }

              }

    }






