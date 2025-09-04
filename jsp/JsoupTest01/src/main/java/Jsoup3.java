
import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Jsoup3 {

	public static void main(String[] args) {

		String url = "https://www.netflix.com/kr/browse/genre/839338";
			
		Document doc = null;
			
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		Elements elements = doc.select(".nm-content-horizontal-row > ul > li");
			
			
		String name = "";
			
		for (Element element : elements) {
			name = element.getElementsByClass("nm-collections-title-name").text();
			System.out.println(name);
		}
			
	}	
}
