import java.util.Scanner;



public class Menu {
	
	Relations relations = new Relations();

	Scanner input = new Scanner(System.in);

	public int mainMenu()

	{
		System.out.println("1. List all Staff");
		System.out.println("2. List staff by category");
		System.out.println("3. List all Admin staff performing a certain task");
		System.out.println("4. Search for staff member by name ");
		System.out.println("5. List all animals");
		System.out.println("6. List animals by type");
		System.out.println("7. Search animal by name");
		System.out.println("8. List animals assigned to member of medical staff");
		System.out.println("9. List waiting list for medical staff member");
		System.out.println("10. Pass to the next pet");

		int choice = input.nextInt();
		return choice;
	}
	
	public void display (int choice) {
		switch(choice) {
		case 1 : relations.listAllStaff(allStaff);
		
		case 2 : relations.listStaffByCategory();
		
		case 3 : relations.staffWorkingOnTask();
		
		case 4 : relations.searchStaffByName(name, allStaff);
		
		case 5 : relations.listAllAnimals(allAnimals);
		
		case 6 : relations.listAnimalByType();
		
		case 7 : relations.searchAnimalType(name, allAnimals);
		
		case 8 : relations.animalsAssignedToStaff();
		
		case 9 : relations.waitingListOfAnimalsPerStaff();
		
		case 10 : relations.passToNextPet();
			
			
		
		}
		
	}
}
