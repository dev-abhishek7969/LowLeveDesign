package LiskovSubstitution.LiskovSubstitutionSolution;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Vehicle> list = new ArrayList<>();
		
		list.add(new Car());
		list.add(new MotorCycle());		
		list.add(new BiCycle());
		
		for (Vehicle vehicle : list) {
			System.out.println(vehicle.getNumberOfWheels());
		}

	}

}
