import java.util.Scanner;

public class my_Banking_App {

    static double total = 1000.00;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        int pick;
      
        do {
            System.out.println(" ");
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.println(" ");

            System.out.print("Enter your choice (1-4): ");
            pick = input.nextInt();

            switch(pick){
                case 1 -> showBalance();
                case 2 -> Deposit();
                case 3 -> Withdraw();
                case 4 -> exit_app();
                default -> System.err.println("Invalid choice!");
            }
        
      } while (pick != 4);

      input.close();
    }

    static void showBalance(){
        System.out.printf("Balance: $%.2f\n",total);
    }
    static void Deposit(){
        double deposit;
        System.out.print("Enter the amount youd like to deposit: ");
        deposit = input.nextDouble();

        if (deposit > 0) {
            total += deposit;
            System.out.printf("$%.2f has been deposited!\nNew balance: $%.2f\n",deposit,total);
        }else{
            
        }
        
    }
    static void Withdraw(){
        
        double withdrawal;
        System.out.print("Enter the amount youd like to withdraw: ");
        withdrawal = input.nextDouble();

        if ((total-withdrawal) >=0) {
            total -= withdrawal;
            System.out.printf("$%.2f has been withdrawled!\nNew balance: $%.2f\n",withdrawal,total);
        }else{
            System.err.println("Insificaint funds! Withdrawl canceled, balance remains unchanged");
        }
        

       

    }
    static void exit_app(){
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");
    }

}
