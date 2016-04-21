package launch;

import model.InteractiveDateEnter;
import model.exceptions.BadDateException;
import model.exceptions.BadDateFormatException;

public class Main {

	public static void main(String[] args) {
		InteractiveDateEnter my = new InteractiveDateEnter();
		
		try {
			my.scanDate();
		} catch (BadDateFormatException e) {
			System.err.println("Mauvais format de date: MM§YYYY£dd");
		} catch (BadDateException f) {
			System.err.println("LA date n'existe pas dans le calendrier");
			// TODO: handle exception
		}
	}

}
