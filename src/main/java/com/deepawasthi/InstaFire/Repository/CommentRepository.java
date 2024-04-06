package com.deepawasthi.InstaFire.Repository;

import com.deepawasthi.InstaFire.Entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {

    List<CommentEntity> findAllByPostId(int postId);
}
