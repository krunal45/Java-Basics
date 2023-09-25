package interfaces;

public class Browser implements WebDriverInterface {

    @Override
    public void ChromeDriversample() {
	// TODO Auto-generated method stub
	System.out.println("ChromeDriver initialised");
    }

    @Override
    public void FirefoxDriversample() {
	// TODO Auto-generated method stub
	System.out.println("FirefoxDriver initialised");
    }
    
    public static void main(String args[]) {
	WebDriverInterface driver=new Browser();
	driver.ChromeDriversample();
	driver.FirefoxDriversample();
    }

}
