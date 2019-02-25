

public class Manin {
    public static void main(String[] args) {
         ATM atm1 = new ATM();
        Account acc = new Account("bambam","111111",7500 ); // we have only one acoount here if you want build an array of accounts 
        atm1.runn(acc);
        System.out.println("OPERATIONS ARA ENDED!\n"
                    + "GOOD BYE!");
    }
    
}
