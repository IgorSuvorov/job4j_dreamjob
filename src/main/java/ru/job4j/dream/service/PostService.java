package ru.job4j.dream.service;

import org.springframework.stereotype.Service;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.store.PostStore;

import java.util.Collection;

@Service
public class PostService {

    private final PostStore postStore;

    public PostService(PostStore postStore) {
        this.postStore = postStore;
    }

    public Collection<Post> findAll() {
        return postStore.findAll();
    }

    public Post findById(int id) {
        return postStore.findById(id);
    }

    public void savePost(Post post) {
        postStore.savePost(post);
    }

}