package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtils {
public static String getGlobalValue(String key) throws IOException {
	
	FileInputStream fis=new FileInputStream(IpathConstant.propertyFilePath);
	Properties p=new Properties();
	p.load(fis);
	return p.getProperty(key);
}
}
