package Java_Problem.Class;

public class Problem_7 {
    public static void main(String[] args) {

        Account a = new Account("김도연의 계좌", 1000);
        Account b = new Account("홍길동의 계좌", 15000);

        boolean aaa = true;
        while (aaa) {
             aaa = a.transfer(b, 3000);
        }

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}

class Account {
    String account_name;
    int money;

    public Account(String account_name, int money) {
        this.account_name = account_name;
        this.money = money;
    }

    public String toString() {
        return String.format("Account { Account_name: %s, Money: %d }", account_name, money);
    }

    public boolean transfer(Account target, int amount) {
        if(amount < 3000) {
            return false;
        }

        money -= 3000;
        target.money += 3000;

        return true;
    }
}
