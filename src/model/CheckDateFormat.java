package model;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import model.exceptions.BadDateException;
import model.exceptions.BadDateFormatException;

public class CheckDateFormat {

	public CheckDateFormat() {
		// TODO Auto-generated constructor stub
	}
	
	public static void regexParse(String st) throws BadDateFormatException {
		String toTest="[01][0-9]�[12][089][0-9]{2}�[0-3][0-9]";
		Pattern patDate = Pattern.compile(toTest);
		if (!patDate.matcher(st).matches()) {
			throw new BadDateFormatException();
		}
	}

	public static Date buildDate(String st) throws BadDateFormatException, BadDateException	{
		try {
			regexParse(st);
		} catch (BadDateFormatException e) {
			throw e;
		}
		
		String format = "MM�YYYY�dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setLenient(false);
		
		Date result = null;
		try {
			result = sdf.parse(st);
		} catch (ParseException e) {
			throw new BadDateException("Bad Date", e);
		}
		return result;
	
	}
	
}
