package week5.les2.opdracht1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) throws IOException {		
		File f = new File("invoer.txt");
		
		if (f.exists() && f.isFile()) {
			Scanner sc = new Scanner(f);
			Double total = 0.0;
			ArrayList<Double> list = new ArrayList<Double>();
			
			while (sc.hasNext()) {
				Double i = Double.parseDouble(sc.nextLine());
				list.add(i);
				total += i;
			}
			
			System.out.println(list);
			System.out.println("Has '"+list.size()+"' float numbers");
			System.out.println("Mean is: '"+total/list.size()+"'");
			
			sc.close();
		}
	}
}
