import java.util.Scanner;
public class Main{
    private static int totalBalance = 100000;
    private static final int PinLength = 4;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("..........WELCOME TO SBI ATM..........");
        System.out.println("....Please insert your debit card....");
        System.out.println("\n");
        System.out.println("Please enter a random number");
        
        sc.nextLine();
        
        System.out.println("Please enter your 4 -digit PIN ");
        int pin = getValidPin(sc);
        while (true){
            int choice = displayMenuAndGetChoice(sc);
            switch(choice){
                case 1:
                    withdrawCash(sc,pin);
                    break;
                case 2:
                    checkBalance();
                    break;
                case 3:
                    depositMoney(sc,pin);
                    break;
                case 4:
                    exitATM();
                    return;
                default:
                System.out.println("Invaliid option Please select a valid option ");
            }
        }
    }
    private static int getValidPin(Scanner sc){
        while (true){
            String input = sc.nextLine();
            if(input.length() == PinLength && input.matches("\\d+")){
                return Integer.parseInt(input);
            } else {
                System.out.println("Invalid PIN Please enter a 4 digit PIN");
            }
        }
    }
    private static int displayMenuAndGetChoice(Scanner  sc){
        System.out.println("Select Transaction");
        System.out.println("press-1 cash Withdraw");
        System.out.println("press-2 check balance");
        System.out.println("press-3 deposit");
        System.out.println("press-4 Exit");
        System.out.println("Enter Your Choice");
        return sc.nextInt();
    }
    private static void withdrawCash(Scanner sc, int pin){
        System.out.println("Enter the amount to withdraw");
        int amount = sc.nextInt();
        
        if(amount <= 0){
            System.out.println("Invalid amount Please enter a postive  value ");
        }
        else if(amount > totalBalance){
            System.out.println("Insufficient blacnce");
        }else {
            totalBalance -= amount;
            System.out.println("\n");
            System.out.println("Please wait while your Transaction is being processed");
            System.out.println("Please collect your cash");
            System.out.println("Your transcation has been sucessful");
            System.out.println("\n");
        }
    }
    private static void checkBalance(){
        System.out.println("Your availble blance is " + totalBalance);
    }
    
    private static void depositMoney(Scanner sc, int pin){
        System.out.println("Enter the amount to deposit");
        int amount = sc.nextInt();
        
        if(amount <= 0){
            System.out.println("Invalid amount Please enter a positive value ");
        }else {
            totalBalance += amount;
            System.out.println("please wait while your transaction is beieng processed  ");
            System.out.println("Your amount of " + amount + "has been suessfully deposited");
        }
    }
    private static void exitATM(){
        System.out.println("\n");
        System.out.println("Please remove your debit card");
        System.out.println("thankyou for using SBI ATM");
    }
}
