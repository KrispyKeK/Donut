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
		for (int i = 0; i < dl.size(); i++) {
			popup.displayText(dl.get(i).toString());
		}
		showTheList();
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
			for (int letterPos = 0; letterPos < currentFlavor.length(); letterPos++) {
				popup.displayText(currentFlavor.substring(letterPos, letterPos+1));
				}
			popup.displayText(dl.get(index).toString());
		}
	}
	private void fillList() {
		donutTools jellyFilled = new donutTools("Jelly filled ","triangle", 0);
		donutTools chocolate = new donutTools("chocolate","circle", 1);
		donutTools burger = new donutTools("American","Burger", 0);
		donutTools krispy = new donutTools("Vanilia","circular objecct", 1);
		donutTools death = new donutTools("Bleach" , "Does it matter?" , 0);
		dl.add(jellyFilled);
		dl.add(burger);
		dl.add(krispy);
		dl.add(chocolate);
	}
}
