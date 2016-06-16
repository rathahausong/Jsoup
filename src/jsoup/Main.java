package jsoup;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {
	public static void main(String[] args) {
		String url ="https://www.khmerload.com/";
		String hostname ="";
		try{
			
			Document doc = Jsoup.connect(url).timeout(1000).get();
			Elements element = doc.select("div.summary");
			System.out.println(element.select("a"));
		
		}catch(Exception ex){
			
			System.out.println(ex.getMessage());
		}
	}
}
