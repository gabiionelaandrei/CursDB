package curs11;

import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {

	public void writePropertiesFile() throws IOException {

		try (OutputStream outPutStream = new FileOutputStream("test.properties")) {
			Properties propFile = new Properties();
			propFile.setProperty("user", "testuser");
			propFile.setProperty("pass", "pass1234");
			propFile.setProperty("email", "testuser@test.com");
			propFile.store(outPutStream, "am salvat fisier properties");
			// outPutStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void readPropertiesFile(String key) {

		try (FileInputStream inputStream = new FileInputStream("test.properties")) {
			Properties prop = new Properties();
			prop.load(inputStream);

			String value = prop.getProperty(key);
			System.out.println(value);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updatePropertiesFile(String key, String value) {

		Properties prop = new Properties();

		// citesc fisierul
		try (FileInputStream inputStream = new FileInputStream("test.properties")) {

			prop.load(inputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (OutputStream output = new FileOutputStream("test.properties")) {

			prop.setProperty(key, value);
			prop.store(output, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteFromPreopertiesFile(String key) {
		
		Properties prop = new Properties();
		// citesc fisierul
		try (FileInputStream inputStream = new FileInputStream("test.properties")) {
			prop.load(inputStream);//incarca fisierul in obiectul de tip properties
		} catch (IOException e) {
			e.printStackTrace();
		}
		//salvez noile modificari
		try (OutputStream output = new FileOutputStream("test.properties")) {
			prop.remove(key);// sterge cheia si implicit valoarea asociata
			prop.store(output, null);//salaveaza modificarile pe output stream
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}