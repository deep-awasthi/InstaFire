package com.deepawasthi.InstaFire.Controller;

import com.deepawasthi.InstaFire.Entity.PostEntity;
import com.deepawasthi.InstaFire.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/createPost")
    private PostEntity submitUserPost(@RequestBody PostEntity post) {
        return postService.createPost(post);
    }

    @GetMapping("/getPost")
    private List<PostEntity> getAllPost(){
        return postService.getAllPosts();
    }
}
