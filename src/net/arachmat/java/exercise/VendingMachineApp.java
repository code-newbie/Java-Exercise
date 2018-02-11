/**
 * Bootstrap of Vendine Machine Instance
 */
package net.arachmat.java.exercise;

/**
 * @author arachmat
 *
 */
public class VendingMachineApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VendingMachine machine1 = new VendingMachine();
		
		for (String drinkName : machine1.getAvailableCatalogue()) {
			System.out.println(drinkName + " - " + machine1.getDrinkPrice(drinkName));
		}
		
		order(args, machine1);
	}

	/**
	 * 
	 * @param args
	 */
	private static void order(String[] args, VendingMachine activeMachine) {
		String orderDrinkName = null;
		Integer cashMoney = 0;
		
		if (null != args && args.length > 0) {
			for (int i=0; i<args.length; i++) {
				if (i==0) {
					orderDrinkName = args[i];
				} else {
					cashMoney = new Integer(args[i]);
				}
	            System.out.println(args[i]);
	        }
			System.out.println("Money change >> " + activeMachine.calculateMoneyChange(orderDrinkName, cashMoney));
		} else {
			System.out.println("No order yet !!");
		}
	}

}
