package donut.controller;
import java.util.*;

import donut.model.donutTools;
import donut.view.donutDisplay;
public class donutController {
	//creates a list, but does not intialize it
	private List<donutTools> dl;
	private donutDisplay popup;
	public donutController() {
		dl = new ArrayList<donutTools>();
		popup = new donutDisplay();
	}

	public void start() {
		donutTools temp = new donutTools();
		dl.add(temp);
		fillList();
		changeTheList();
		showTheList();
		getList();
	}
	public void showTheList() {
		String favorite = "something that rhyms with bleach, oh wait, it's bleach";
		for (int index = 0; index < dl.size(); index++) {
			String currentFlavor = dl.get(index).getFlavor();
			if (currentFlavor.equals(favorite)) {
				for (int woop = 0; woop < 5; woop++) {
					popup.displayText("I see, this is indeed the best flavor ever");
				}
			}
			//for (int letterPos = 0; letterPos < currentFlavor.length(); letterPos++) {
			//	popup.displayText(currentFlavor.substring(letterPos, letterPos+1));
			//	}
			popup.displayText(dl.get(index).toString());
		}
		for (int reverse = dl.size()- 1; reverse >= 0; reverse--) {
			popup.displayText("The list backwards: " + dl.get(reverse).getFlavor());
		}
	}
	private void fillList() {

		donutTools jellyFilled = new donutTools("Jelly filled ","triangle", 0);
		donutTools chocolate = new donutTools("Chocolate","circle", 1);
		donutTools burger = new donutTools("American","Burger", 0);
		donutTools krispy = new donutTools("Vanilia","circular objecct", 1);
		donutTools death = new donutTools("Bleach" , "Does it matter?" , 0);
		dl.add(jellyFilled);
		dl.add(burger);
		dl.add(krispy);
		dl.add(chocolate);
		dl.add(death);
	}
	private void changeTheList() {
		donutTools removed = dl.remove(0);
		popup.displayText(removed.getFlavor() + " was removed from the list");
		popup.displayText("Now it is this big: " + dl.size());
		popup.displayText("The list is still " + dl.size() + " items.");
		removed = dl.set(2, new donutTools());
		popup.displayText("The donut with the flavor " + removed.getFlavor() + " has been removed.");
		popup.displayText("Add a donut");
		String x = popup.getResponse("Flavor: ");
		String y = popup.getResponse("Shape: ");
		String z = popup.getResponse("Holes: ");
		Integer.parseInt(z);
		int zNum = 0;
		try {
			zNum = Integer.parseInt(z);
		}
		catch(Exception e) {
			popup.displayText("Please enter a valid number next time...404 Intelligence not found");
		}
		donutTools newDonut = new donutTools(x,y,zNum);
		dl.add(newDonut);
		popup.displayText("You've added this donut. " + newDonut.toString());
	}
	private void getList() {
		String grab = popup.getResponse("Find a Donut||Enter a number: ");
		int grabNum = 0;
		try {
			grabNum = Integer.parseInt(grab);
			if (grabNum < dl.size()) {
				popup.displayText(dl.get(grabNum).getFlavor() + " Is the donut of you wanted to see");
				popup.displayText(dl.get(grabNum).toString());
			}
			else {
				popup.displayText("404 Cannot Find Donut");
			}
		}
		catch(Exception e) {
			popup.displayText("Can you not not do not that?");
		}
	}
}
