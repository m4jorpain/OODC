package week5.practicum4;

import java.io.*;
import java.util.*;

public class KlasManager {

	public void klasOpslaan(Klas deKlas) throws IOException, ClassNotFoundException {
		/* Voeg hier code toe om parameter 'deKlas' in bestand klas.obj */
		FileOutputStream fos = new FileOutputStream("klas.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(deKlas);
		oos.close();
	}

	public Klas klasInladen() throws ClassNotFoundException, IOException {
		/* Voeg hier code toe om het Klas-object weer in te lezen uit bestand klas.obj */
		FileInputStream fis = new FileInputStream("klas.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		ArrayList<Klas> lijst = (ArrayList<Klas>) obj;
		ois.close();
		
		for (Klas k : lijst) {
			System.out.println(k);
		}
		/* Laat variabele 'deKlas' naar het ingelezen Klas object wijzen! */
		return null;
	}
}
