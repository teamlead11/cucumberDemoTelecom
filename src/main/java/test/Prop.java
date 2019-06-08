package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader file = new FileReader("UserDetails.properties");
		Properties prop = new Properties();
		prop.load(file);
		System.out.println(prop.get("UserName"));
		System.out.println(prop.get("Password"));
	}

}
