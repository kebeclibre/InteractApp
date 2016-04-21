package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.exceptions.BadDateException;
import model.exceptions.BadDateFormatException;

public class InteractiveDateEnter {

	private Date typedDate;
	private List<Date> dates = new ArrayList<Date>();
	
	public InteractiveDateEnter() {
	
	}
	
	
	public void setDate(Date typedDate) {		
		this.typedDate= typedDate;
	}
	
	public void scanDate() throws BadDateFormatException, BadDateException {
		Scanner scan = new Scanner(System.in);
		//scan.useDelimiter("//");
		Date essai = null;
		String control = "";
		while (!control.equals("fin")) {
			try{        
				essai = CheckDateFormat.buildDate(scan.next());
			} catch (BadDateFormatException e) {
				throw new BadDateFormatException(essai.toString(),e);
			} catch (BadDateException f) {
				throw f;
			}
			dates.add(essai);
		}
		scan.close();
	}
	

}
