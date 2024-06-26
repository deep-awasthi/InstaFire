package com.deepawasthi.InstaFire.Repository;

import com.deepawasthi.InstaFire.Entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {
}
