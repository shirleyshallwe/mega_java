package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링2 {

	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("https://www.w3schools.com/").get();
//		System.out.println(doc);
		
		Elements elist = doc.select("a.w3-bar-item.w3-button");
				
		FileWriter file = new FileWriter("w3c-sub.txt");
		
		
		for (Element element : elist) {
			System.out.println(element.text());
			file.write(element.text() + "\n");
		}
		file.close();
		
	}

}
