import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.sql.rowset.spi.SyncResolver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class JSONRead {
    public static void main(String [] args) throws Exception {
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("src/Two.json")){
            Object object = jsonParser.parse(reader);
            /* Can use either JSONArray or JSONObject according to the JSON file structure*/
            //JSONArray companyListArray = (JSONArray) object;
            JSONObject companyList = (JSONObject)object;
            System.out.println("companyList:"+companyList);
            //System.out.println("companyList Array:"+companyListArray);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
//Object:{"orders":[{"order_date":"10\/01\/2021 20:","sold_by":{"last_name":"Boukhers","ordered_by":{"address":"Universitaetsstrasse 1","name":"Keely O'Ryan","id":"971"},"id":"891","first_name":"Zeyd","job_title":"University professor","email":"boukhers@uni-koblenz.de"},"id":"5","status":"delivered"}]}
//Object:{"orders":[{"order_date":"10\/01\/2021 20:21","sold_by":{"last_name":"Boukhers","id":"891","first_name":"Zeyd","job_title":"University professor","email":"boukhers@uni-koblenz.de"},"ordered_by":{"address":"Universitaetsstrasse 1","name":"Keely O'Ryan","id":"971"},"id":"5","status":"delivered"}]}
