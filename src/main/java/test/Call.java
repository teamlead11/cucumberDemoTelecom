package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Call {

	public static void main(String[] args) {
		HashMap<String, Object> mymap = new HashMap<String, Object>();

		mymap.put("Name", "karthi");
		mymap.put("ID", 1);
		System.out.println(mymap.get("Name"));
		System.out.println(mymap.containsKey("IDx"));
		
	}

}
