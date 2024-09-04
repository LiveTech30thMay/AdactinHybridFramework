package keywords;

public class ApplicationKeywords extends ValidationKeywords{
	
	public void clearAndType(String locatorKey,String text) 
	{
		getElement(locatorKey).clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getElement(locatorKey).sendKeys(text);
	}

}
