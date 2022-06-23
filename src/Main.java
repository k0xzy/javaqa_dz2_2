import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int schet = 100; //На счету
        int add = 1100; // Пополнение счета
        int sum = schet + add;
        int bonus = add / 100;
        if (sum < 1000) {
            System.out.println(sum);
        } else {
            System.out.println(bonus + sum);
        }
    }
}