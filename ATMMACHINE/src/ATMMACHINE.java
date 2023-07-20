import java.util.Scanner;
public class ATMMACHINE {
	static int[] userid= {0,1,2,3,4,5,6,7,8,9};
	static double[] balance;
	public static double check_balance(int id) {
		System.out.println("The balance is "+ balance[id] +"\n");
		return balance[id];
	}
	public static double withdraw(int id) {
		System.out.print("Enter an amount to withdraw: ");
		Scanner scanner=new Scanner(System.in);
		int withdraw=scanner.nextInt();
		if (withdraw>balance[id]) {
			System.out.println("Your balance is "+ balance[id]);
			System.out.println("Withdraw amount is too large.");
			System.out.println("You are redirected to deposit menu");
			System.out.print("Enter an amount to deposit: ");
			int deposit=scanner.nextInt();
			balance[id]=balance[id]+deposit;
			return balance[id];
		}
		else {
			balance[id]=balance[id]-withdraw;
		}
		return balance[id];
	}
	public static double deposit(int id) {
		System.out.print("Enter an amount to deposit: ");
		Scanner scanner=new Scanner(System.in);
		int deposit=scanner.nextInt();
		balance[id]=balance[id]+deposit;
		return balance[id];
	}
	public static void exit(int id) {
		Scanner scanner=new Scanner(System.in);
		String choices="Main menu\n"
			      +"1: check balance\n"
			      +"2: withdraw\n"
			      +"3: deposit\n"
			      +"4: exit";
		while(true) {
		System.out.print("Enter an id:");
		int userid=scanner.nextInt();
		if (userid>9) {
			System.out.println("Unvalid id!");
		}
		while(true) {
			System.out.println(choices);
			System.out.print("Enter a choice:");
			int choice=scanner.nextInt();
			if (choice==1) {
				check_balance(userid);
			}
			else if(choice==2) {
				withdraw(userid);
			}
			else if(choice==3) {
				deposit(userid);
			}
			else if(choice==4) {
				break;
			}
			else {
				System.out.println("Unvalid choice!");
			}
		}
    }
	}
	public static void main(String[] args) {
		int[] id= {0,1,2,3,4,5,6,7,8,9};
		balance= new double[10];
		balance[0]=100;
		balance[1]=100;
		balance[2]=100;
		balance[3]=100;
		balance[4]=100;
		balance[5]=100;
		balance[6]=100;
		balance[7]=100;
		balance[8]=100;
		balance[9]=100;
		
		
		Scanner scanner=new Scanner(System.in);
		String choices="Main menu\n"
				      +"1: check balance\n"
				      +"2: withdraw\n"
				      +"3: deposit\n"
				      +"4: exit";
		System.out.print("Enter an id:");
		int userid=scanner.nextInt();
		if (userid>9) {
			System.out.println("Unvalid id!");
		}
		while (true) {
		System.out.println(choices);
		System.out.print("Enter a choice:");
		int choice=scanner.nextInt();
		if (choice==1) {
			check_balance(userid);
		}
		else if (choice==2) {
			withdraw(userid);
		}
		else if(choice==3) {
			deposit(userid);
		}
		else if (choice==4) {
			exit(userid);
		}
		else {
			System.out.println("Unvalid choice!");
		}
	}

}
}
