package Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertiesfile {
	public static void main(String[] args) {
		
		getProperties();
	}
	
	public static void getProperties(){
		
		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream("C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\src\\test\\java\\Config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
		
		}catch (Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		
		
	}	

}
