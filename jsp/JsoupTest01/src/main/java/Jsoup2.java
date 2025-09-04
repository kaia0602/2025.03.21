import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Jsoup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://news.sbs.co.kr/news/newsSection.do?sectionType=02&plink=GNB&cooper=SBSNEWS";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".w_news_list > ul > li");
		
		String sub = "";
		String read = "";
		String date = "";
		
		for (org.jsoup.nodes.Element element : elements) {
			sub = element.getElementsByClass("sub").text();
			read = element.getElementsByClass("read").text();
			date = element.getElementsByClass("date").text();
			System.out.println(sub + "\n" + read + "\n" + date);
		}

	}

}
