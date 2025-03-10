package com.kavindu.netflixclone.daos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kavindu.netflixclone.entities.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentDao extends MongoRepository<Comment,String> {
    Optional<List<Comment>> findAllByUserId(String user_id);
}
