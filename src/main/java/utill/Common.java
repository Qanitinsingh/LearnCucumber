package utill;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;


public class Common {

	public static String dateToStringConverter(Date date) {
		if(date!=null){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String re = dateFormat.format(date);
		return re;
		}else{
			return "-";
		}

	}
	
	public static String doubleToStringConverter(double d) {
		if(d==0.0)
			return "0.00";
	      DecimalFormat f = new DecimalFormat("##.00");
	      return f.format(d);
	  
	 }

	public static String getFolderName(String s) {
		int i = s.length();
		String s1 = s.substring(1, i);
		return s1;

	}

	public static String getCurrentDateTime() {

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		return dateFormat.format(date);

	}

	public static String getCurrentDate() {

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		return dateFormat.format(date);

	}

	public static String getCurrentDateTime(String format) {

		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		return dateFormat.format(date);

	}

	public static String getTextFromArrayListByIndex(ArrayList<String> a, int index) {
		String s = a.get(index);
		return s;

	}

	public static boolean compareRegexWebSiteURL(String s) {
		boolean flag = false;
		String pattern = "(.*)(\\d+)(.*)";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(s);
		if (m.find()) {
			flag = true;
		}
		return flag;

	}

	public static boolean compareRegexEmail(String s) {
		boolean flag = false;
		String pattern = "(.*)(\\d+)(.*)";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(s);
		if (m.find()) {
			flag = true;
		}
		return flag;

	}

	public static ArrayList<String> sortArrayASC(ArrayList<String> a) {
		Collections.sort(a, String.CASE_INSENSITIVE_ORDER);
		return a;

	}

	public static ArrayList<String> reverseArray(ArrayList<String> a) {
		Collections.reverse(a);
		return a;

	}

	public static ArrayList<String> sortArrayDESC(ArrayList<String> a) {
		Collections.reverse(a);
		return a;

	}

	public static ArrayList<Integer> sortIntArrayASC(ArrayList<Integer> a) {
		Collections.sort(a);
		return a;

	}

	public static ArrayList<Integer> sortIntArrayDESC(ArrayList<Integer> a) {
		Collections.reverse(a);
		return a;

	}

	public static int getTotalNoOfPages(int totalItems, int perPageItems) {
		int count = 0;

		if (totalItems > 0) {
			count = totalItems / perPageItems;
			if (totalItems % perPageItems != 0) {
				count += 1;
			}
		}
		return count;

	}

	public static int convertStringIntoInt(String Items) {
		int i = Integer.parseInt(Items);
		return i;

	}

	public static String generateRandamNo(int max) {
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(max);
		if (i == 0)
			i++;
		String s = Integer.toString(i);
		return s;

	}

	public static String generateRandamNumAndGetMultipleOfDesireInt(int max, int desireInt) {
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(max);
		if (i < desireInt)
			i = desireInt;
		else {
			i = i / desireInt;
			i *= desireInt;
		}
		String s = Integer.toString(i);
		return s;

	}

	public static String[] stringSepratedByTilde(String str) {
		String[] s = str.split("~", -1);
		return s;

	}

	public static String[] stringSepratedByPercentage(String str) {
		String[] s = str.split("%", -1);
		return s;

	}

	public static String stringSepratedByCommaAndGetFirstChild(String s) {

		String[] tokens = s.split(",", -1);
		return tokens[0];

	}

	public static String stringSepratedByColonAndGetSecondChild(String s) {
		String str = "";
		if (!s.isEmpty()) {
			String[] tokens = s.split(":", -1);
			if (tokens.length >= 2)
				str = tokens[1];
		}
		return str;

	}

	public static String stringSepratedByBackSlashAndGetFirstChild(String s) {

		String[] tokens = s.split("/", -1);
		return tokens[0];

	}

	public static String[] stringSepratedByBackSlashAndGetArrayList(String s) {

		String[] tokens = s.split("/", -1);
		return tokens;

	}

	public static String stringSepratedByBackSlashAndGetSecondChild(String s) {

		String[] tokens = s.split("/", -1);
		return tokens[1];

	}

	public static String generateAllocationIP(String s) {

		String[] tokens = s.split("\\.", -1);
		int s3 = convertStringIntoInt(tokens[3]);
		s3++;
		String ip = tokens[0] + "." + tokens[1] + "." + tokens[2] + "." + s3;

		return ip;

	}

	public static String stringSepratedByDotAndGetSecondChild(String s) {

		String[] tokens = s.split("\\.", -1);
		return tokens[1];

	}

	public static String stringSepratedByDotAndGetFirstChild(String s) {

		String[] tokens = s.split("\\.", -1);
		return tokens[0];

	}

	public static String convertUnixTimeStampIntoSimpleDateFormat(String s, String timeZone) {
		Date date = new Date(Long.parseLong(s));
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		return sdf.format(date);

	}

	public static String convertUnixTimeStampIntoSimpleDateTimeFormat(String s, String timeZone) {
		Date date = new Date(Long.parseLong(s) * 1000);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEEEEEEEEEEE, dd MMMMM yyyy, hh:mm aaa");
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		return sdf.format(date);

	}

	public static Date convertUnixTimeStampIntoDate(String s) {
		Date date = new Date(Long.parseLong(s) * 1000);

		return date;

	}

	public static String[] stringSepratedByComma(String s) {
		String[] arr = s.split(",");
		return arr;
	}

	public static int generateRandomNumber(int max) {
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(max);
		if (i == 0)
			i++;
		return i;
	}

	public static String convertDoubleIntoStringUpToTwoDecimalPlace(double d) {
		DecimalFormat df = new DecimalFormat("#.00");
		String s = df.format(d);
		String f = stringSepratedByDotAndGetFirstChild(s);
		if (f.isEmpty())
			s = "0" + s;
		return s;

	}
}
