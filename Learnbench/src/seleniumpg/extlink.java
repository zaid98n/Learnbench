package seleniumpg;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class extlink extends Readexcelnew {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Date Date = new Date();
		
		Writer.write("---Data for: "+Date+" ---"+"\n");
		Writer.write(" "+"\n");
		
		String a1 = CellData(0, 1, 3);
		String a2 = CellData(0, 2, 3);
		String a3 = CellData(0, 3, 3);
		String a4 = CellData(0, 4, 3);
		String a5 = CellData(0, 5, 3);
		String a6 = CellData(0, 6, 3);
		String a7 = CellData(0, 7, 3);
		String a8 = CellData(0, 8, 3);
		String a9 = CellData(0, 9, 3);
		String a10 = CellData(0, 10, 3);
		String a11 = CellData(0, 11, 3);
		String a12 = CellData(0, 12, 3);
		String a13 = CellData(0, 13, 3);
		String a14 = CellData(0, 14, 3);
		String a15 = CellData(0, 15, 3);
		String a16 = CellData(0, 16, 3);
		String a17 = CellData(0, 17, 3);
		String a18 = CellData(0, 18, 3);
		String a19 = CellData(0, 19, 3);
		String a20 = CellData(0, 20, 3);
		String a21 = CellData(0, 21, 3);
		String a22 = CellData(0, 21, 3);
		String a23 = CellData(0, 23, 3);

		
		String link[] = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23};
		
		for(int i=0; i<link.length; i++) {
			
			try{
				if(link[i] != null) {
					//String x = link[i].substring(9);
					//String y = x.split("'>")[0];
					
					//System.out.println(y);
					
					try {
						driver.get(link[i]);
						Thread.sleep(1000);
						WebElement err = driver.findElement(By.xpath("/html/body/h1"));
						Thread.sleep(1000);
						err.isDisplayed();
						Thread.sleep(1000);
						Writer.write(" "+(i+1)+") Image broken for: "+link[i]+"\n");
					}
					catch (Exception e) {
						Writer.write(" "+(i+1)+") Image found for: "+link[i]+"\n");
					}
				}
			}
			catch (Exception e) {
				Writer.write(" "+(i+1)+") Link not opened for: "+link[i]+"\n");
			}

		}
		
	}
}