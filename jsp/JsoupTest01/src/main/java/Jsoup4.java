import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Jsoup4 {
	

	public static void main(String[] args) {
		String url = "https://ko.wikipedia.org/wiki/%EC%9E%90%EC%B9%B4%EB%A5%B4%ED%83%80_%EC%84%9C%EB%B2%84_%ED%8E%98%EC%9D%B4%EC%A7%80";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".wikitable > tbody > tr ");
		Elements imgElements = doc.select(".mw-default-size > a > img ");
		
		String td = "";
		String th = "";
		
		String img = "";
		
		
				for (Element element : elements) {
					th = element.getElementsByTag("th").text();
					td = element.getElementsByTag("td").text();
					System.out.println(th);
					System.out.println(td);
				}
				
				System.out.println(imgElements.select("img").get(0));
				
	  

	}

}
