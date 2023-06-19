package homework;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	public Map<String, Integer> note;

	public Catalog() {
		note = new HashMap<String, Integer>();
		note.put("Gabi", 10);
		note.put("Ionut", 9);
		note.put("Amalia", 6);
		note.put("David", 7);
		note.put("Mihai", 4);
	}

	public void adaugaElev(String nume, int nota) {
		if (note.containsKey(nume)) {
			int notaDecomparat = note.get(nume);
			if (nota <= notaDecomparat) {
				System.out.println("Nu ai nevoie de alta nota");
			} else {

				note.replace(nume, nota);
			}

		} else {
			System.out.println("Nu aveai nota, ti-am trecut acum!");
			note.put(nume,nota);
		}
	}
	
	public String afisareCatalog() {
		return note.toString();
	}
}
