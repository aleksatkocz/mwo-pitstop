package pl.edu.agh.mwo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Iterator;

public class JsonLoader {
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(new FileReader("pitstops-data.json"));
                JSONObject jsonObject = (JSONObject) obj;
                JSONArray companyList = (JSONArray) jsonObject.get("Company List");
                Iterator<JSONObject> iterator = companyList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
