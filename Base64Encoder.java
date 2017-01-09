import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Base64Encoder {

	public static void main(String[] args) {
		
		try {
			
			String valor = "Teste para encode";
			
			String base64encodedString = Base64.getEncoder().encodeToString(valor.getBytes("utf-8"));
			
			System.out.println("Base64 - Encoded String: " + base64encodedString);
			
			byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
			
			System.out.println("Original: " + new String(base64decodedBytes, "utf-8"));
			
			base64encodedString = Base64.getUrlEncoder().encodeToString(valor.getBytes("utf-8"));
			
			System.out.println("Base64 - Encoded URL: " + base64encodedString);
			
			System.out.println("UUID: " + UUID.randomUUID().toString());
			
			byte[] mimeBytes = UUID.randomUUID().toString().getBytes("utf-8");
			
			System.out.println("Original mime: " + mimeBytes);
			
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
			
			System.out.println("Base64 - Encoded MIME: " + mimeEncodedString);
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
