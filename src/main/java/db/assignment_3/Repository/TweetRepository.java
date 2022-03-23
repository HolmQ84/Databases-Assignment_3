package db.assignment_3.Repository;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonArray;
import db.assignment_3.Model.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends MongoRepository<Tweet, String> {

    @Query("{limit: 10}")
    List<JsonArray> getTop10Tweets();
}
