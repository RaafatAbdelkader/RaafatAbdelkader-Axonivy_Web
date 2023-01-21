package Base;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class JsonReader {
    static String filepath= "src/test/java/testData/users.json";
    public static Map<String,String> getUserData(String userName)  {
        Map<String,String>data=new HashMap<>();
        FileInputStream fs = null;
        JSONParser jsonParser =new JSONParser();
        JSONObject fileObject = null;
        try {
            fs = new FileInputStream(filepath);
            fileObject = (JSONObject)jsonParser.parse(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject userObject= (JSONObject) fileObject.get(userName);

        for (int i = 0; i < userObject.size(); i++) {
           Iterator<String> keys =userObject.keySet().iterator();
           while(keys.hasNext()){
               String key=keys.next();
               data.put(key, userObject.getAsString(key));
           }
        }
        return data;
    }
}
