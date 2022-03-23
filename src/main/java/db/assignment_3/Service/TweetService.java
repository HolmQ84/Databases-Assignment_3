package db.assignment_3.Service;

import com.google.gson.JsonArray;
import db.assignment_3.Repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {

    @Autowired
    TweetRepository tweetRepository;

    public List<JsonArray> top10tweets() {
        return tweetRepository.getTop10Tweets();
    }

}
