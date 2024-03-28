package BaseClass;

import com_BrowserPropertiesReadCode.ReadBrowserName;

public class Config {
	

	public String getappurl() {
		String env=System.getProperty("env");
		if(env==null) {
			env="qa";
		}else if(env.isEmpty()) {
			env="qa";
		}
		
		ReadBrowserName bn=new ReadBrowserName();
		String url=bn.getproperty("src/main/resources/application.properties", env+".url");
		return url;

	}

}
