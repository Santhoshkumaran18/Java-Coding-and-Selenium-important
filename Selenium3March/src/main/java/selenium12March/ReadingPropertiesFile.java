package selenium12March;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		File file = new File("C:\\Users\\S Santhosh Kumaran\\config.properties");
		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);
		System.out.println(prop.getProperty("email"));
		Set<String> keys=prop.stringPropertyNames();
		for(String k:keys) {
			System.out.println(k);
		}
		Set<Object> ke=prop.keySet();
		System.out.println(ke);
		Collection<Object> value=prop.values();
		System.out.println(value);

	}
}
