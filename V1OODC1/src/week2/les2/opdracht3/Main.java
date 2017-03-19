package week2.les2.opdracht3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> cijfers = new ArrayList<Double>();
		System.out.print("Voer je cijfer in: ");
		String cijfer = scanner.nextLine();
		double value = Double.parseDouble(cijfer);
		cijfers.add(value);
		System.out.print("Voer je cijfer in: ");
		for(cijfer = scanner.nextLine(); scanner != null; cijfer = scanner.nextLine()){
			value = Double.parseDouble(cijfer);
			cijfers.add(value);
			if(value == 0.0){
				scanner.close();
				break;
			}
			System.out.print("Voer je cijfer in: ");
		}
		
		for(Object item : cijfers){
			System.out.println(item);
		}
	}
}
