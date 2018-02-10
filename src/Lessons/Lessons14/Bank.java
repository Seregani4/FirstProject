package Lessons.Lessons14;

public class Bank {
    String title;

    public Bank(String title) {
        this.title = title;
    }

    class Account{
        private int number;
        private double balance;
        public Account(int number, double balance) {
            this.number = number;
            this.balance = balance;
        }

        public void setMoney(double balance){
            if(balance>0)
                this.balance+=balance;
        }
        public void getMoney(double balance) {
            if(balance<this.balance)
                this.balance-=balance;
        }
        public void show(){
            System.out.printf("Bank - %s, number account -%d, balance account -%g%n", title,number,balance);
        }
    }
}
