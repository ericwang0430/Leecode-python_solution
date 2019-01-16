public class Codec {
	HashMap<String, String> map = new HashMap<>();
	Random rand = new Random();
	int index = Integer.MIN_VALUE;

	//Encodes a URL to a shortened URL
	public String encode(String longUrl) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			sb.append(longUrl.charAt(rand.nextInt(longUrl.length())));
		}

		sb.append(index++);
		map.put(sb.toString());
		return "http://tinyurl.com" + sb.toString();

	}

	//Decodes a shortened URL to its original URL

	public String decode(String shortUrl) {
		return map.get(shortUrl.replace("http://tinyurl.com",""));
	}


}