package com.deepawasthi.InstaFire.Controller;

import com.deepawasthi.InstaFire.Entity.CommentEntity;
import com.deepawasthi.InstaFire.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/createComment")
    private CommentEntity submitComment(@RequestBody CommentEntity comment) {
        return commentService.createComment(comment);
    }

    @GetMapping("/{postId}")
    private List<CommentEntity> getCommentsForPost(@PathVariable("postId") int postId){
        return commentService.getAllComments(postId);
    }
}
