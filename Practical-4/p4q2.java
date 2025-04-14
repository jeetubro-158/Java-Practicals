class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

class account {
    private int acc_no;
    private String name;
    private double balance;

    public account(){}
    public account(int a, String n, double b) throws BankException {
        acc_no=a;
        name=n;
        //if balance is < 5000 then exception is thrown
        if(b < 5000) {
            BankException e=new BankException("Balance is insufficent");
            throw e;
        } else {
            balance = b;
        }
    }

    public void disp() {
        System.out.println("Account Number : " + acc_no);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }
}

public class p4q2 {
    public static void main(String[] args) throws BankException {
        
        try {
            account a=new account(143, "Jeetu", 8000);
            a.disp();
        } catch (BankException e) {
            System.out.println(e);
        }
    }
}
