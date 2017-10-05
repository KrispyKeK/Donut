package donut.model;

public class donutTools {
	
	private boolean hasGlaze;
	private boolean isSprinkle;
	private String shape;
	private String flavor;
	private int hole;
	
	public donutTools() {
		this.hasGlaze = false;
		this.isSprinkle = false;
		this.shape = "round";
		this.flavor = "plain";
		this.hole = 1;
	}
	public donutTools(String flavor, String shape, int hole) {
		this.flavor = flavor;
		this.shape = shape;
		this.hole = hole;
	}
	public String toString() {
		String desc ="";
		desc += "The donut name is " + flavor + shape + hole;
		return desc;
	}
	public String getShape() {
		return shape;
	}
	public String getFlavor() {
		return flavor;
	}
	
}
