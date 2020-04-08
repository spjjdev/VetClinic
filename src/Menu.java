import java.util.Scanner;

public class Menu {

	Scanner kB = new Scanner(System.in);

	public int mainMenu()

	{
		System.out.println("1. List all Staff");
		System.out.println("2. List staff by category");
		System.out.println("3. List all Admin staff performing a certain task");
		System.out.println("4. Search for staff member by name ");
		System.out.println("5. List all animals");
		System.out.println("6. List animals by type");
		System.out.println("7. List animals assigned to member of medical staff");
		System.out.println("8. List waiting list for medical staff member");
		System.out.println("9. Pass to the next pet");

		int choice = kB.nextInt();
		return choice;
	}
}
