public class Main {
    public static void main(String[] args) {
        //Пробую по видео
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        int salary = 50000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + salary;
            System.out.println("Итоговая ЗП " + total);
        }
        //Задача 1
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("i = " + i);
        }
        //Задача 2
        for (int j = 10; j > 0; j = j - 1) {
            System.out.println("j = " + j);
        }
        //Задача 3.0
        for (int k = 1; k <= 17; k = k + 1) {
            if (k % 2 == 0) {
                System.out.println("Четные = " + k);
            }
        }
        //Задача 3.1
        for (int k = 0; k <= 17; k = k + 2) {
            System.out.println("Четные1 = " + k);
        }
        //Задача 4
        for (int l = 10; l > -11; l = l - 1) {
            System.out.println("От 10 до -10 = " + l);
        }
        //Задача 5
        for (int m = 1904; m <= 2096; m = m + 4) {
            System.out.println("Високосный год " + m);
        }
        //Задача 6
        for (int n = 7; n <= 98; n = n + 7) {
            System.out.println("Кратно 7 = " + n);
        }
        //Задача 7
        for (int o = 1; o <= 512; o = o * 2) {
            System.out.println("Последовательность чисел = " + o);
        }
        //Задача 8
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i <= 12; i = i + 1) {
            total1 = total1 + salary1;
            System.out.println("Месяц - " + i + ". Накопления =  " + total1 + " руб.");
        }
        //Задача 9
        int salary2 = 29000;
        int total2 = 0;
        for (int i = 0; i <= 12; i = i + 1) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            System.out.println("Месяц - " + i + ". Накопления c 12% год. = " + total2 + " руб.");
        }
        //Задача 10
        int a = 2;
        int b = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            b = b + a;
            System.out.println("2 * " + i + " = " + b);
        }
    }
}











