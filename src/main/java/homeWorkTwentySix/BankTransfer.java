package homeWorkTwentySix;
//Задача 4.Смоделируйте простой банковский перевод:
//У вас есть 5 банковских счетов с балансом (например, от 1000 до 5000).
//Несколько потоков делают случайные переводы между счетами.
//Убедитесь, что общий баланс во всей системе не изменяется.
//Подсказка:
//Используйте synchronized для изменения баланса счета.
//Добавьте проверки на минимальный баланс (< 0).
public class BankTransfer {
    private int balance;
    public BankTransfer(int balance){
        this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankTransfer bankTransfer1= new BankTransfer(1000);
    }
}
