//Code of Banking Management:

import java.util.Scanner ;

class Account{
    int accNumber ;
    String name ;
    double balanceInCurrent ;
    double balanceInSavings ;
    String branch ;
    Account(int accNumber , String name , double balanceInCurrent , double balanceInSavings , String branch ){
        this.accNumber = accNumber ;
        this.name = name ;
        this.balanceInCurrent = balanceInCurrent ;
        this.balanceInSavings = balanceInSavings ;
        this.branch = branch ;
    }

    public void accountDetailsCurrent(){
        System.out.println("::---IN CURRENT----::");    
        System.out.println("Account holder name ::" + this.name);
        System.out.println("Account number ::" + this.accNumber);
        System.out.println("Availiable Balance in Savings ::" + this.balanceInCurrent);
        System.out.println("BRANCH ::" + this.name);
    }
    public void accountDetailsSavings(){
        System.out.println("::-----IN SAVINGS-----::");    
        System.out.println("Account holder name ::" + this.name);
        System.out.println("Account number ::" + this.accNumber);
        System.out.println("Availiable Balance in Savings ::" + this.balanceInSavings);
        System.out.println("BRANCH ::" + this.name);
    }

    public void totalMoneyDipositedInBank(){
        double totalBalance ;
        totalBalance = this.balanceInSavings + this.balanceInCurrent ;
        System.out.println("Total Money Avialiable in the BANK :: " + totalBalance);
    }

    public void depositCurrent(double addBalance){ // Allows the user to deposit 
        // the balance in his/her account .
        this.balanceInCurrent = this.balanceInCurrent + addBalance ;
    }
    public void depositSavings(double addBalance){ // Allows the user to deposit 
        // the balance in his/her account .
        this.balanceInSavings = this.balanceInSavings + addBalance ;
    }

    public void withdrawalCurrent(double subBalance){
        if(this.balanceInCurrent < 1000  ){
            System.out.println("You can't Withdraw Money from Current account as balnce in current is less than 1000");      
        }
        else if((subBalance > this.balanceInCurrent)){
            System.out.println("You have entered more withdrawl ammount than balance you have !");
        }
        else
            this.balanceInCurrent = this.balanceInCurrent - subBalance ;
    }
    public void withdrawalSavings(double subBalance){
        if(this.balanceInSavings < 5000 ){
            System.out.println("You can't Withdraw Money from Savings account as balnce in current is less than 5000");
            System.out.println("You have entered more withdrawl ammount than balance you have !");
        }else if ((subBalance > this.balanceInSavings)){
            System.out.println("You have entered more withdrawl ammount than balance you have !");
        }
        else
            this.balanceInSavings = this.balanceInSavings - subBalance ;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int choice ;
        while(true){
            System.out.println("---------------- WELCOME TO BANK ------------");
            System.out.println("---------------- LETS OPEN A NEW ACCOUNT ------------");
            System.out.println("Enter your name ::") ;
            String n = sc.next();
            System.out.println("Account Number {For Administrator}") ;
            int acn = sc.nextInt();
            System.out.println("BRANCH ") ;
            String branch = sc.next();
            System.out.println("Deposition in Current {For Administrator}") ;
            double dic = sc.nextDouble();
            System.out.println("Deposition in Savings {For Administrator}") ;
            double dis = sc.nextDouble();
            Account a = new Account(acn,n,dic,dis,branch);
            System.out.println("1 For Current") ;
            System.out.println("2 For Savings");
            System.out.println("3 For Balnce in Bank");
            System.out.println("Enter your Choice :: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                System.out.println(" --- You are under Current account --- ");
                System.out.println("1 for details on current acc");
                System.out.println("2 for deposit");
                System.out.println("3 for withdrawl");
                int ch1 ;
                System.out.println("Enter your choice ::");
                ch1 = sc.nextInt();
                switch(ch1){
                    case 1 : 
                        a.accountDetailsCurrent();
                        break;
                    case 2 :
                        System.out.println("Enter amount to Deposit");
                        double amnt = sc.nextDouble();
                        a.depositCurrent(amnt);
                        break;
                    case 3 :
                        System.out.println("Enter amount to WithDraw");
                        double am = sc.nextDouble();
                        a.withdrawalCurrent(am);
                        break;
                    default:
                    System.out.println("Wrong Choice !!");
                sc.close();
                }
                break;
                case 2:
                System.out.println(" --- You are under Savings account --- ");
                System.out.println("1 for details on Savings acc");
                System.out.println("2 for deposit");
                System.out.println("3 for withdrawl");
                int ch2 ;
                System.out.println("Enter your choice ::");
                ch2 = sc.nextInt();
                switch(ch2){
                    case 1 : 
                        a.accountDetailsSavings();
                        break;
                    case 2 :
                        System.out.println("Enter amount to Deposit");
                        double amnt = sc.nextDouble();
                        a.depositSavings(amnt);
                        break;
                    case 3 :
                        System.out.println("Enter amount to WithDraw");
                        double am = sc.nextDouble();
                        a.withdrawalCurrent(am);
                        break;
                    default:
                    System.out.println("Wrong Choice !!");
                    break;
                }
                break;
                case 3:
                    a.totalMoneyDipositedInBank();
                    break;
                default:
                System.out.println("Wrong Decision !!");
                break;}
            sc.close();
            break;}}}



