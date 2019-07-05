package aaaa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class one1 {
	
	WebDriver nnn=null;
	
	@Given("Enter the link in browser")
	public void link() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\java\\deiver\\chromedriver.exe");
		nnn = new ChromeDriver();
		nnn.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Thread.sleep(3000);
	}
	@And("Click sign in page")
	public void sign()
	{
		System.out.println("click that link");
		nnn.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	@When("Enter into the login page Click new user")
	public void new_user()
	{
		System.out.println("click new user");
		nnn.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[3]/div/a[1]")).click();
	}
	@Then("Enter the Username")
	public void userName()
	{
		nnn.findElement(By.xpath("//*[@id='userName']")).sendKeys("mathi123");
		
	}
	 @And("Enter the First name")
	 public void fname()
	 {
		 nnn.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mathi");
	 }
    @And("Enter the Last name")
    public void lname()
    {
    	nnn.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("vanan");
    }
    @And("Enter the Password")
    public void pass()
    {
    	nnn.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mathi12343");
    }
    @And("Enter the Conform Password")
    public void cpass()
    {
    	nnn.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("mathi12343");
    }
    @And("Enter the Gender")
    public void gender()
    {
    	nnn.findElement(By.xpath("//*[@id=\'gender\']")).click();
    }
    @And("Enter the E-Mail")
    public void mail()
    {
    	nnn.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("mathi345@gmail.com");
    }
    @And("Enter the Mobile Number")
    public void number()
    {
    	nnn.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("3349785227");
    }
    @And("Enter the DOB")
    public void dob()
    {
    	nnn.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("05/05/1998");
    }
    @And("Enter the Address")
    public void address()
    {
    	nnn.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("2/153,naggay kum,paghj,rtyui-633350");
    }
    @And("Click the Security Question")
    public void question()
    {
    	nnn.findElement(By.xpath("//*[@id='securityQuestion']")).click();
    }
    @And("Enter the Answer")
    public void answer()
    {
    	nnn.findElement(By.xpath("//*[@id='answer']")).sendKeys("hi");
    }
    @Then("Click Register")
    public void register()
    {
    	nnn.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
    }
    @Then("Close the tag")
    public void tag()
    {
    	nnn.close();
    }
}
