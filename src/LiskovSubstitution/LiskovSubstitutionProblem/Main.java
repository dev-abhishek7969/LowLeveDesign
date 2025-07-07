package LiskovSubstitution.LiskovSubstitutionProblem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Vehicle> list = new ArrayList<>();
		
		list.add(new Car());
		list.add(new BiCycle()); //gives null pointer exception
		
		for (Vehicle vehicle : list) {
			System.out.println(vehicle.hasEngine());
		}
		
	}

}
