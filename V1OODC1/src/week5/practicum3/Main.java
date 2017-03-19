package week5.practicum3;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) throws IOException {		
		File f = new File("prices_usd.txt");
		
		FileWriter fw = new FileWriter("prices_euro.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		double euroWaarde = 0.918720;
		System.out.println("Voer Euro-waarde van 1 USD in: ");
		boolean done = false;
		while (!done) {
			try {
				euroWaarde = Double.parseDouble(br.readLine());
				done = true;
			} catch (NumberFormatException e) {
				System.out.println("Geen geldig getal.\nVoer Euro-waarde van USD in: ");
			}
		}
		
		String product = "test";
		double prijsUSD = 0.0;
		double prijsEURO = 0.0;
		if (f.exists() && f.isFile()) {
			Scanner sc = new Scanner(f);
			while (sc.hasNext()) {
				String s = sc.nextLine();
				String[] values = s.split(" : ");
				product = values[0];
				prijsUSD = Double.parseDouble(values[1]);
				prijsEURO = prijsUSD * euroWaarde;
				prijsEURO = Math.round(prijsEURO * 100.0) / 100.0;
				pw.println(product +" : "+ prijsEURO);
				System.out.println("Product: "+product);
				System.out.println("Prijs in USD: "+prijsUSD);
				System.out.println("Prijs in EURO: "+prijsEURO);
			}
			sc.close();
			pw.close();
			br.close();
		}
	}
}
