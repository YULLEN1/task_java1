//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int initialSum = 100;
        int addedSum = 1100;
        int finalSum;
        int bonus;
        if (addedSum > 1000) {
            bonus = addedSum / 100;
            finalSum = initialSum + addedSum + bonus;
            System.out.println("Итоговый счет = " + finalSum);
            System.out.println("Бонус = " + bonus);
        } else {
            finalSum = initialSum + addedSum;
            bonus = 0;
            System.out.println("Итоговый счет = " + finalSum);
            System.out.println("Бонус = " + bonus);
        }
    }
}