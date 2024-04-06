package com.deepawasthi.InstaFire.Service;

import com.deepawasthi.InstaFire.Entity.CommentEntity;
import com.deepawasthi.InstaFire.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    UserService userService;

    public CommentEntity createComment(CommentEntity comment) {
        return commentRepository.save(comment);
    }

    public List<CommentEntity> getAllComments(int postId){
        List<CommentEntity> commentEntityList = commentRepository.findAllByPostId(postId);

        for(int i=0;i<commentEntityList.size();i++) {
            CommentEntity commentItem=commentEntityList.get(i);
            commentItem.setUserName(userService.getUserDetail(commentItem.getUserId()).getUserName());
        }

        return commentEntityList;
    }
}
