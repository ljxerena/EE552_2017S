import java.util.*;
//AAPL ==> 140.88
// BIDU ==> 168.93
//IBM ==> 173.77
public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<String,Double> priceQuote = new HashMap<String,Double>();
		priceQuote.put("AAPL", 140.88);
		priceQuote.put("BIDU", 168.93);
		priceQuote.put("IBM", 173.77);

		System.out.println(priceQuote.get("AAPL"));

	}
}
