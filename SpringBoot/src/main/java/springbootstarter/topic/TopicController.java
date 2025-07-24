package springbootstarter.topic;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    // GET all topics
    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    // GET a specific topic by ID
    @GetMapping("/{id}")
    public Optional<Topic> getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    // POST (create) a new topic
    @PostMapping
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    // PUT (update) an existing topic
    @PutMapping("/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {

    }
}