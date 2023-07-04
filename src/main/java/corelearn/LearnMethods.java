package corelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnMethods {

	public static void main(String[] args) {

		String email = userEmail();
		int phone = userphone();
		List<String> homePeople = empName();
		Map<Integer, String> realData = mapData();
		System.out.println(email + " " + phone + "" + homePeople + "" + mapData());

	}

	// If I will remove static as keyword from method then in main method error will
	// display

	public static String userEmail() {
		return "Nitin@gmail.com";
	}

	public static int userphone() {
		return 855703793;
	}

	public static List<String> empName() {

		List<String> empData = new ArrayList<>();
		Second sc = new Second();
		empData.addAll(sc.advance());

		return empData;
	}

	public static Map<Integer, String> mapData() {

		Map<Integer, String> mappData = new HashMap<>();
		Second sc = new Second();
		mappData.putAll(sc.learnMap());

		return mappData;
	}
}
