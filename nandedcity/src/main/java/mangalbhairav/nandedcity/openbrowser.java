package mangalbhairav.nandedcity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException, InvalidFormatException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SUD\\Desktop\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com");

		FileInputStream file=new FileInputStream("C:\\Users\\SUD\\Desktop\\dhanuuuu.xlsx");
		String str = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(str);
}
}