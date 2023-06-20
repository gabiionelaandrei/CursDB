package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileLeguma {

	public void writePropertiesFile() throws IOException {

		try (OutputStream outPutStream = new FileOutputStream("leguma.properties")) {
			Properties propFile = new Properties();
			propFile.setProperty("morvov", "58");
			propFile.setProperty("ceapa", "30");
			propFile.setProperty("rosie", "22");
			propFile.setProperty("castravete", "45");
			propFile.setProperty("cartof", "37");
			propFile.store(outPutStream, "Am salvat fisierul cu properties");
			// outPutStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public String readPropertiesFile(String key) {

		try (FileInputStream inputStream = new FileInputStream("leguma.properties")) {
			Properties prop = new Properties();
			prop.load(inputStream);
			String value = prop.getProperty(key);
			
			if(value != null) {
				return "Leguma aleasa de tine are "+ value + " calorii.";
			}
			else {
				return "Nu vindem aceasta leguma. Te rog alege o alta leguma.";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "Nu exista fisierul leguma.";
		}
		
		}

	}

