import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QADBT", "root", "sincyebin@1991");	//arguments-url, username, password
		//url format is "jdbc:mysql://"+host+":"+port+"/databasename". 
		Statement statement=conn.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from credentials where scenario=\"ShoppingCard\";");
		while (resultSet.next())
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Rahul Shetty-dubai\\mysql\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys(resultSet.getString("username"));
			driver.findElement(By.id("password")).sendKeys(resultSet.getString("password"));
			
			
			//showing git update
			
			System.out.println("updating the cloned code");
			System.out.println("uploading to github");
			
			//cloned code develop branch update
			
			System.out.println("cloned code - develop branch - update");
			
			//updating by base code
			
			System.out.println("base code is getting updated-DatabaseTesting");
		}
	}
	public void baseCOdeUpdation()
	{
		System.out.println("base code");
	}
	
	public void baseCOdeUpdation1()
	{
		System.out.println("base code final updation");
	}
	//done
}
