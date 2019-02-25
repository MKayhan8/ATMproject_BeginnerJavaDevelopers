
import java.util.Scanner;


/**
 *
 * @author MUSTAFA KAYHAN ARICAN
 */
public class ATM {
    public static void runn(Account ac)
    {
        Login entry = new Login();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to our Bank..");
        System.out.println("***************************");
        System.out.println("Client login");
        System.out.println("***************************");
        int acces = 3;
        while (true)
        {
            if(entry.login(ac))
            {
                System.out.println("Access Succesful..");
                break;
            }
            else
            {
                System.out.println("Accces unsuccesful!!!");
                acces -=1;
                System.out.println("Reaming acces right:"+acces);
                
            }
            if(acces ==0)
            {
                System.out.println("End of Rıght of Acces.....");
                return ;
            }
        }
        System.out.println("**********************");
        String opers = "1. See Balance\n"+
                        "2. Deposit\n"+
                        "3. Wıthdraw\n"+
                        "4. Press 'q' for QUIT..";
        System.out.println(opers);
        System.out.println("**************************");
        
        while (true)
        {
            System.out.println("Choose operation:");
            String oper = scanner.nextLine();
            
            if(oper.equals("q")){
                break;
            }
            else if (oper.equals("1"))
            {
                System.out.println("Account Balance:"+ac.getBalance());
            }
            else if (oper.equals("2"))
            {
                System.out.println("Money which you want to deposite:");
                int money =scanner.nextInt();
                scanner.nextLine();
                ac.deposit(money);
                 System.out.println("New balance:"+ac.getBalance());
                
            }
            else if (oper.equals("3"))
            {
                System.out.println("Money which you want to take:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                ac.withdraw(tutar);
                System.out.println("New balance:"+ac.getBalance());
            }
            else {
                System.out.println("INVALID INPUT!");
            }
        }
    }
      
      
}
