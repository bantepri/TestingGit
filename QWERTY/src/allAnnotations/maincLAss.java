package allAnnotations;

import org.testng.annotations.Test;

public class maincLAss extends baseclass {

@Test
public void TitlePage()
{
	driver.get("https://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);
}
}


