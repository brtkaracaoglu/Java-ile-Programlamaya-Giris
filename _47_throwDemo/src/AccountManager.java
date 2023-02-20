public class AccountManager {
    private double balance; // hesaptaki para miktarı

    public void deposit(double amount) {  // hesaba para yatırma
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException { // hesaptan para çekme
        if (balance >= amount) {
            balance = getBalance() - amount;
        } else {
            throw new BalanceInsufficentException("Bakiye yetersiz."); // hata fırlatma
        }
    }

    public double getBalance() { // hesaptaki parayı okuya bilme
        return balance;
    }
}
