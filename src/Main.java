import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int ticket_price = 100;
        int bonus_rub = 20;
        int bonus_mile = ticket_price / bonus_rub;
        System.out.println(bonus_mile);
    }
}