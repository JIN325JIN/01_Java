package jin;

public class Run {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone("samsung","galaxy s20",2020,12000000,"android",128);
		sp.printInfo();
		
		System.out.println("===================================");
		
		BasicPhone bp = new BasicPhone("nokia","3310",2020,100000,true);
		bp.printInfo();
		bp.checkKeyboard();
	}

}
