package com.angelchanquin.springboot.topic;

import com.angelchanquin.springboot.topic.dto.Topic;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Created by achanquin on 2/28/17.
 */

@Service
public class TopicService {


    private List<Topic> topics =  Arrays.asList(
            new Topic("spring", "Spring Framework", " Spring Boot"),
            new Topic("java", "Java", " Java 8"),
            new Topic("javascript", "JavaScript", " Javascript Angular Framework")
    );

    public List<Topic> getAllTopics() {
        return this.topics;
    }

    public Topic getTopicById(final String id) {
        return topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst().get();
    }
}
