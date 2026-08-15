import java.util.Scanner;

 static Scanner scanner = new Scanner(System.in);
 static double balance = 0;

 void main() {

boolean stillRunning = true;

    while (stillRunning) {
       System.out.println("Write your number from (1-4)");
       System.out.println("1. Show Balance \n2. Deposit \n3. Withdraw \n4. Exit ");
       int number = scanner.nextInt();

       switch (number) {
          case 1 -> showBalance(balance);
          case 2 -> balance += deposit();
          case 3 -> balance -= withdraw();
          default ->  bye();
       }
    }

    }

    public void showBalance ( double balance){
       System.out.println("Your balance account : " + balance);
    }

    public double deposit () {
       System.out.print("How much money you wanna deposit ");
       double deposit = scanner.nextDouble();
       return deposit;
    }

    public double withdraw(){
       System.out.print("How much money you wanna withdraw ");
       double withdraw = scanner.nextDouble();
       if (withdraw > balance){
          System.out.println("Your withdraw is larger than your current balance");
          return 0;
       } else if(withdraw < 0){
          System.out.println("The number can not be negative");
          return 0;
       } else {
          return withdraw;
       }
    }

    public void bye(){
        System.out.println("Thank you for choose our bank");
        System.out.println("Have a good day");
        System.exit(0);
    }

