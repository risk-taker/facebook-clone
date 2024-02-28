package com.springProject.facebookclone.service;

import com.springProject.facebookclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
