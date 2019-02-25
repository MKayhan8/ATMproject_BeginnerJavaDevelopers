
import java.util.Scanner;


public class Login {
    
    public  boolean login (Account acc)
    {
        Scanner scanner = new Scanner(System.in);
       String acc_name, pw;
       
        System.out.print("Account name:");
        acc_name = scanner.nextLine();
        System.out.println("Password: ");
        pw = scanner.nextLine();
        if(acc.getAcc_No().equals(acc_name) && acc.getPass().equals(pw))
        {
            return true;
        }
        else 
            return false;
    }
    
}
