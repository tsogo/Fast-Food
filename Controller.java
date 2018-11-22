import java.util.Scanner;

public class Controller {
	Food food = new Food("Khuushuur", 800.0, "Naadmiin khuushuur");
	Food food1 = new Food("Buuz", 600.0, "Khachir-tai");
	Food food2 = new Food("Hotdog", 3500.0, "Kola-tai");
	Menu menu = new Menu();
	Customer cust1 = new Customer("Baigal", 99210933, "BZD-6 khoroo");
	Order order = new Order();
	Order order2 = new Order();
	
	
	public Controller() {

		menu.addFood(food);
		menu.addFood(food1);
		menu.addFood(food2);
		order.addMenu(menu);
		order.addCustomer(cust1);
		menu.showMenu();
		
		
		System.out.print("Too hemjeeg oruulna uu: ");
		Scanner sc = new Scanner(System.in);
		order.setQuantity(sc.nextInt());
		System.out.print("Zahialgiin dugaariig oruulna uu: ");
		Scanner sc1 = new Scanner(System.in);
		order.setTotalPrice(sc1.nextInt());
		System.out.print("Tanii zahialgiin niit vne: " + order.getTotalPrice());
		
	}

	public static void main(String[] args) {
		new Controller();
	}
	
}
