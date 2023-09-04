import java.util.Scanner;  
public class main 
{  
        public static void main (String [] args )
    {  
        int balance = 200000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("ATM Simulatror");  
            System.out.println("Choose 1 for Deposit");  
            System.out.println("Choose 2 for Withdrawn");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                System.out.print("Enter money to be deposited:");  
                      
                deposit = sc.nextInt();  
                              
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully deposited"); 
                System.out.println("Balance="+balance); 
                System.out.println("");  
                break; 
   
                case 2:  
                      
                System.out.print("Enter money to be withdrawn:");    
                withdraw = sc.nextInt();  
                              
                if(balance >= withdraw)  
                {  
                    balance = balance - withdraw;  
                    System.out.println("Please collect your money");
                    balance = balance - withdraw;  
                    System.out.println("Balance="+ balance);
                }  
        
                else  
                {   
                    System.out.println("Insufficient Balance");  
                }  
                System.out.println("");  
                break;
   
                case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        System.exit(0);  
            }  
        }  
    }

        @Override
        public String toString() {
            return "main []";
        }  
}  