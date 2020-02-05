package seamless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jobapplication {
	static String browser; 
	static WebDriver driver;

	public static void main(String[] args) {
		choosebrowser();
		browsersettings();
		test();
		
		
	}
	public static void choosebrowser(){
		browser = "Chrome";		 
	}
	public static void browsersettings(){
		if(browser.contains("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Downloads\\SeamlessAssessment\\libraries\\drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		if(browser.contains("Firefox")){
			System.setProperty("webdriver.firefox.driver","C:\\Users\\Public\\Downloads\\SeamlessAssessment\\libraries\\drivers\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}
	}
	public static void test(){
		driver.get("https://www.seamlesshr.com/careers");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("main.home-main:nth-child(4) section.p-section:nth-child(7) div.p-section-body:nth-child(2) section.container div.row.justify-content-center div.col-10.col-md-8.col-lg-7 div.card.job-card.mb-3:nth-child(1) div.card-body div.job-card-meta.pt-2:nth-child(4) div.card.border-0.bg-light div.card-body.p-2 div.d-flex.small.align-items-center.text-secondary.flex-wrap div.ml-auto > a.btn.btn-sm.btn-primary")).click();
		// The Apply for a job link isn't providing an inspectable Selector. The site was navigated to after clicking on the Apply for Job button 
		
		driver.get("https://seamlesshr.seamlesshiring.com/?redirect_to=https%3A%2F%2Fseamlesshr.seamlesshiring.com%2Fjob%2Fapply%2F572%2Fsoftware-testers-assesment");
		driver.findElement(By.cssSelector("div.container-fluid.shr-auth div.row section.col.shr-auth-form:nth-child(1) div.shr-auth-form-inner form:nth-child(7) div.form-group.shr-form-group:nth-child(1) div.shr-input-group > input.shr-input")).sendKeys("arimiyahmubarak@gmail.com");
		driver.findElement(By.cssSelector("div.container-fluid.shr-auth div.row section.col.shr-auth-form:nth-child(1) div.shr-auth-form-inner form:nth-child(7) div.form-group.shr-form-group:nth-child(2) div.shr-input-group > input.shr-input")).sendKeys("arimiyahmubarak@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/form[1]/button[1]")).click();
		
		// Automation script will be ending at this point due to user not being able to inspect the sections of the application form.
	}
	
	}

