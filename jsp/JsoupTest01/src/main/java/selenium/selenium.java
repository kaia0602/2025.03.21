package selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class DogImg {
	
	String imgAddr = "";
	

	public void save() throws IOException {
		String fileName = "";
		fileName = imgAddr + ".jpg";
		
		URL url = new URL("" +imgAddr);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("img/");
		
		byte[] b = new byte[2048];
		
		int len;
		while ( (len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		is.close();
		os.close();
	}

	public DogImg(String imgAddr) {
		super();
		this.imgAddr = imgAddr;
	}
	
	public String getImgAddr() {
		return imgAddr;
	}
	
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
}

public class selenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.kr/search?sca_esv=2c9182675fadbcab&q=%EA%B0%95%EC%95%84%EC%A7%80&udm=2&fbs=ABzOT_CZsxZeNKUEEOfuRMhc2yCI6hbTw9MNVwGCzBkHjFwaK6Wwr2U3Otxxdo7bek3qh0jM1D_pZCsNckRgN6AmwjZfmST0m_jvGek5FeiJmDC0zcKiMp0KimAcWcHBSIgWzKBsEtsn-3YCXXmuOEiA3QqOVmOs0UtF884YwNfHR4Y1goaqReiUNau8OEz0HIN0vDtwbqcfIEOTKcov-hTh4M_vK_XQ5__R-rOjVT7_Gv09eVYR3zw&sa=X&ved=2ahUKEwiRnobC9bONAxXfqVYBHaIzLDoQtKgLegQIJBAB&biw=1278&bih=827&dpr=1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement we  = driver.findElement(By.className("wIjY0d"));
		List<WebElement> list = we.findElements(By.className("eA0Zlc"));
		
		String imgAddr = "";
		
		for (WebElement w : list) {
			imgAddr = w.findElement(By.className("YQ4gaf")).getDomAttribute("src");
			System.out.println(imgAddr);
			
			DogImg di = new DogImg(imgAddr);
			
			try {
				di.save();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		driver.quit();
	}

}
