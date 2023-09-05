package seleniumpg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckImage extends Readexcelnew {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Date Date = new Date();
		FileWriter fstream = new FileWriter("D:\\Florida Press Report\\Report_1.txt",true);
		BufferedWriter out = new BufferedWriter(fstream);
		out.write(" "+"\n");
		out.write("---Data for: "+Date+" ---"+"\n");
		out.write(" "+"\n");
		
		String[] data_link = {CellData(0, 1, 3), CellData(0, 2, 3), CellData(0, 3, 3), CellData(0, 4, 3)};
		//String[] data_link = {"https://www.google.com/","https://www.google.com/","https://www.google.com/","https://www.google.com/"};
		
		for(int i=0; i<data_link.length; i++) {
			
			try {
				driver.get(data_link[i]);
				Thread.sleep(1000);
				WebElement x = driver.findElement(By.xpath("/html/body/h1"));
				Thread.sleep(1000);
				x.isDisplayed();
				Thread.sleep(1000);
				out.write(" "+(i+1)+") Image broken for: "+data_link[i]+"\n");

				}
			catch (Exception e) {
				out.write(" "+(i+1)+") Image found for: "+data_link[i]+"\n");
			}
		}
		out.close();
		driver.quit();
	}
}
