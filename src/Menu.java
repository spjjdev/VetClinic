import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import animals.Animal;
import staff.Staff;

public class Menu {

	Relations relations = new Relations();
	Scanner input = new Scanner(System.in);

	String[] menuItems = { "List all Staff", "List staff by category", "List all Admin staff performing a certain task",
			"Search for staff member by name", "List all animals", "List animals by type", "Search animal by name",
			"List animals assigned to member of medical staff", "List waiting list for medical staff member",
			"Pass to the next pet" };

	public Menu() {
		readingUser();
		
	}

	public void displayOptions() {
		System.out.println("Select from the following");
		for (int i = 0; i < menuItems.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + menuItems[i]);
		}
	}

	public void readingUser() {

		displayOptions();
		int choice = input.nextInt();

		if (choice == 1) {
			List<Staff> staffList = relations.listAllStaff();
			System.out.println(staffList);
		}
		if (choice == 2) {
			System.out.println("Choose a Staff type");
			System.out.println("1.Vets" + "\n" + "2.Trainee Vets" + "\n" + "3.Nurses" + "\n" + "4.IT Staff" + "\n"
					+ "5.Receptionists");
			int userchoice = input.nextInt();
			List<Staff> toReturn = relations.listStaffByCategory(userchoice);
			System.out.println(toReturn);
		}
//		if (choice == 3) {
//			System.out.println("Choose a task");
//			System.out.println("1.Filing" + "\n" + "2.Making Phone Calls" + "\n" + "3.Updating Patient Database" + "\n"
//					+ "4.Patient Follow-up" + "\n" + "5.Scheduling Appointments");
//			int taskChoice = input.nextInt();
//			List<Staff> tasking = relations.staffWorkingOnTask(taskChoice);
//			System.out.println(tasking);
//		}
		if (choice == 4) {
			System.out.println("Enter name of Staff member");
			String staffName = input.next();
//			ArrayList <Staff> staff = relations.listAllStaff();
//			Staff staffMember = relations.searchStaffByName(staffName);
//			System.out.println(staffMember);
			
		}
		if (choice == 5) {
			List<Animal> animalList = relations.listAllAnimals();
			System.out.println(animalList);
		}
		if (choice == 6) {
			System.out.println("Choose an Animal type");
			System.out.println("1.Dogs" + "\n" + "2.Cats" + "\n" + "3.Rabbits" + "\n" + "4.Birds" + "\n"
					+ "5.Hamsters");
			int userchoice = input.nextInt();
			System.out.println(userchoice);
			List<Animal> toReturn = relations.listAnimalByType(userchoice);
			System.out.println(toReturn);
		}
		if (choice == 7) {
			ArrayList<Animal> array = relations.listAllAnimals();
			System.out.println(array);
			System.out.println("Enter name of Animal");
			String animalName = input.next();
			Animal animal = relations.searchAnimalByName(animalName,array);
			
			System.out.println(animal);
			
		}
//		if (choice == 8) {
//			relations.animalsAssignedToStaff();
//		}
		if (choice == 9) {
			relations.waitingListOfAnimalsPerStaff();
		}
		if (choice == 10) {
			relations.passToNextPet();
		}
       
	}

//	public int mainMenu()
//
//	{
//		System.out.println("1. List all Staff");
//		System.out.println("2. List staff by category");
//		System.out.println("3. List all Admin staff performing a certain task");
//		System.out.println("4. Search for staff member by name ");
//		System.out.println("5. List all animals");
//		System.out.println("6. List animals by type");
//		System.out.println("7. Search animal by name");
//		System.out.println("8. List animals assigned to member of medical staff");
//		System.out.println("9. List waiting list for medical staff member");
//		System.out.println("10. Pass to the next pet");
//
//		int choice = input.nextInt();
//		return choice;
//	}
//// not calling display method
//	public void display(int choice) {
//		switch (choice) {
//		case 1:
//			List<Staff> staffList = relations.listAllStaff();
//			System.out.println(staffList);
//
//		case 2:
//			System.out.println("Choose a Staff type");
//			System.out.println("1.Vets"+"\n"+"2.Trainee Vets"+"\n"+"3.Nurses"
//			                   +"\n"+"4.IT Staff"+"\n"+"5.Receptionists");
//			int userchoice = input.nextInt();
//			List<Staff> toReturn = relations.listStaffByCategory(userchoice);
//
//		case 3:
//			relations.staffWorkingOnTask();
//
//		case 4:
//			relations.searchStaffByName();
//
//		case 5:
//			relations.listAllAnimals(allAnimals);
//
//		case 6:
//			relations.listAnimalByType();
//
//		case 7:
//			relations.searchAnimalType(name, allAnimals);
//
//		case 8:
//			relations.animalsAssignedToStaff();
//
//		case 9:
//			relations.waitingListOfAnimalsPerStaff();
//
//		case 10:
//			relations.passToNextPet();
//
//		}
//
//	}
}
