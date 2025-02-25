package jin;

public class SmartPhone extends Phone{

	private String operatingSystem;
	private int stoarageCapacity;
	
	
	public SmartPhone() {}


	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int stoarageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.stoarageCapacity = stoarageCapacity;
	}

	@Override
	public void printInfo() {
	super.printInfo();
	System.out.println("OPERATING SYSTEM : "+operatingSystem);
	System.out.println("STORAGE CAPACITY : "+stoarageCapacity+"GB");
	
}
	
	
	
	
	
}
