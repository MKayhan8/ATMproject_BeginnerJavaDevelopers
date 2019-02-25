

public class Account {

   private String acc_No;
   private String pass;
   private int balance;

    public Account()
    {
        this("No info","NO info",0);
        
    }
    public Account(String acc_No, String pass, int balance) {
        this.acc_No = acc_No;
        this.pass = pass;
        this.balance = balance;
    }

    public String getAcc_No() {
        return acc_No;
    }
    public void deposit (int balance)
    {
        this.balance += balance;
    }
    public void  withdraw (int balance)
    {
        if ( this.balance < balance )
        {
            System.out.println("YOU DONT HAVE ENOUGH MONEY!");
        }
        else 
            this.balance -= balance;
    }

    public String getPass() {
        return pass;
    }

    public int getBalance() {
        return balance;
    }

    public void setAcc_No(String acc_No) {
        this.acc_No = acc_No;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
}
