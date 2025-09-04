import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Movie {
	String name = "";
	String sub_text = "";
	String imgAddr = "";
	
	public void save() throws IOException {
		String fileName = "";
		fileName = name.replace("*", "")
				.replace(":", "") + ".jpg";
		fileName = name + ".jpg";
		URL url = new URL(imgAddr);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("img/" + fileName);
		
		byte[] b = new byte[2048];
		
		int len;
		while ( (len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		is.close();
		os.close();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub_text() {
		return sub_text;
	}

	public void setSub_text(String sub_text) {
		this.sub_text = sub_text;
	}

	public String getImgAddr() {
		return imgAddr;
	}

	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}

	public Movie(String name, String sub_text, String imgAddr) {
		super();
		this.name = name;
		this.sub_text = sub_text;
		this.imgAddr = imgAddr;
	} 
	
	
}

public class selenium3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B0%95%EC%8A%A4%EC%98%A4%ED%94%BC%EC%8A%A4&ackey=okavg2y7");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement panel =  driver.findElement(By.cssSelector("._panel"));
		List<WebElement> listLi = panel.findElements(By.cssSelector("li"));
		
		
		String name = "";
		String sub_text = "";
		String imgAddr = ""; 
		
		List<Movie> list = new ArrayList<Movie>();
				
		for (WebElement li : listLi) {
			name = li.findElement(By.cssSelector(".name")).getText();
			sub_text = li.findElement(By.cssSelector(".sub_text")).getText();
			imgAddr = li.findElement(By.cssSelector("img")).getDomAttribute("src");
			Movie mv = new Movie(name, sub_text, imgAddr);
			try {
				mv.save();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			list.add(mv);
			System.out.println(name + "\n" + sub_text + "\n" + imgAddr );
		}
		
		
		driver.quit();
	}

}
