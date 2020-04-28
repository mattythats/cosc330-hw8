import java.util.Scanner;
import java.util.ArrayList;

public class CakeDriver{

	public static int choose(String prompt, ArrayList<String> options, Scanner s){
		int choice = 0;
		Scanner input = s;
		System.out.println(prompt);
		while(choice < 1 || choice > options.size()){
			for(int i = 0; i < options.size(); i++){
				System.out.println(i+1 + ". " + options.get(i));
			}
			choice = input.nextInt();
			if(choice < 1 || choice > options.size()){
				System.out.println("Invalid option");
			}
		}
		return choice-1;
	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		ArrayList<String> bakeryNames = new ArrayList<String>();
		bakeryNames.add("Classic Cakes");
		bakeryNames.add("Cakes by David");
		ArrayList<String> cakeTypes = new ArrayList<String>();
		cakeTypes.add("Smith's Island Cake");
		cakeTypes.add("Sheet Cake");
		cakeTypes.add("Cupcakes");
		int bakeryChoice, cakeChoice;
		Bakery bakery;
		Cake cake;
		System.out.println("Hello and welcome to CakePortal!");
		System.out.println("Enter the number corresponding to your selection.");
		bakeryChoice = choose("Choose a bakery.", bakeryNames, input);
		if(bakeryChoice == 0){
			bakery = new ClassicCakes();
		} else {
			bakery = new CakesByDavid();
		}
		System.out.println(bakery.getName());
		cakeChoice = choose("Choose a type of cake to order.", cakeTypes, input);
		cake = bakery.orderCake(cakeTypes.get(cakeChoice));
		System.out.println("Thank you for ordering \"" + cake.getName() + "\" from " + bakery.getName());
	}
}
