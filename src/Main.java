public class Main {
    public static void main(String[] args) {
        int account = 555;  //начальное состояние счёта
        int amount = 1111;   //сумма пополнения счета
        int bonusFor = 100; //за сколько рублей даётся 1 бонусный рубль
        int bonus = 0;      //бонус по умолчанию равен 0 и перезапишется при выполнении условия

        if (amount > 1000) {            //если пополнение строго больше 1000 рублей
            bonus = amount / bonusFor; //бонус меняется
        }

        account += amount + bonus;
        System.out.println("Ваш бонус составил " + bonus + " рублей, на счету " + account + " рублей.");
    }
}
