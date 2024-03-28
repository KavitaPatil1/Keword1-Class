package BaseClass;



import org.testng.annotations.BeforeMethod;

import com.keyword1.Keyword1;





public class Base {
	
	
	@BeforeMethod
	public  void setup() throws Exception {
     Keyword1.openBrowser("chrome");
     Config cof=new Config();
     Keyword1.openUrl(cof.getappurl());
     Keyword1.maximizeWindow();
	}

}
