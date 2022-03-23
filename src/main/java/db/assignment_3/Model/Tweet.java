package db.assignment_3.Model;

import lombok.Data;
import org.bson.json.JsonObject;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tweets")
public class Tweet {
    private JsonObject object;
}
