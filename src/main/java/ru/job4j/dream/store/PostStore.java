package ru.job4j.dream.store;

import org.springframework.stereotype.Repository;
import ru.job4j.dream.model.Post;

import javax.annotation.concurrent.ThreadSafe;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ThreadSafe
@Repository
public class PostStore {

    private final PostDBStore store;

//    public PostService(PostDBStore store) {
//        this.store = store;
//    }
    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    public PostStore(PostDBStore store) {
        this.store = store;
//        posts.put(1, new Post(1, "Junior Java Job"));
//        posts.put(2, new Post(2, "Middle Java Job"));
//        posts.put(3, new Post(3, "Senior Java Job"));
    }

    public Collection<Post> findAll() {
        return posts.values();
    }

    public Post findById(int id) {
        return posts.get(id);
    }

    public void savePost(Post post) {
        posts.put(post.getId(), post);
    }
}
