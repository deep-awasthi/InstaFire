package com.deepawasthi.InstaFire.Service;

import com.deepawasthi.InstaFire.Entity.PostEntity;
import com.deepawasthi.InstaFire.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserService userService;

    public PostEntity createPost(PostEntity post){
        return postRepository.save(post);
    }

    public List<PostEntity> getAllPosts(){
        List<PostEntity> postEntityList = postRepository.findAll();

        for(int i = 0; i<postEntityList.size(); i++){
            PostEntity post = postEntityList.get(i);
            post.setUserName(userService.getUserDetail(post.getUserId()).getUserName());
        }
        Collections.sort(postEntityList, (a,b)->b.getPostId()-a.getPostId());
        return postEntityList;
    }
}
