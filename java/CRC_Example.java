import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import java.io.PrintWriter;
import org.json.simple.JSONObject;

public class CRC_Example {
  public static void main(String[] args) {
    try {
     String consumer_secret = "secret";
     String crc_token = "Message";

     Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
     SecretKeySpec secret_key = new SecretKeySpec(consumer_secret.getBytes("UTF-8"), "HmacSHA256");
     sha256_HMAC.init(secret_key);

     String hash = Base64.encodeBase64String(sha256_HMAC.doFinal(crc_token.getBytes("UTF-8")));

     JSONObject responseToken = new JSONObject();
     responseToken.put("response_token", "sha256=" + hash);

     System.out.println(responseToken.toString());

     System.out.println("sha256=" + hash);
    }
    catch (Exception e){
     System.out.println("Error");
    }
   }
}
