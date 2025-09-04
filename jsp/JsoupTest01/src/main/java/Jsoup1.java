import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Jsoup1 {

	public static void main(String[] args) {

		String html = "<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"UTF-8\">"
				+ "<title>Insert title here</title>"
				+ "</head>"
				+ "<body>"
				+ "	<table>"
				+ "		<tr>"
				+ "			<td><h1>HelloWorld</h1></td>"
				+ "		</tr>"
				+ "	</table>"
				+ "</body>"
				+ "</html>";
		
		Document doc = Jsoup.parse(html);
		String h1 = doc.body().getElementsByTag("h1").text();
		System.out.println(h1);
		
		
	}

}
