package com.kavindu.netflixclone.services;

import com.kavindu.netflixclone.entities.Comment;
import com.kavindu.netflixclone.exceptions.CommentDetailsNotFoundException;

public interface CommentService {
    Comment writeComment(Comment comment);
    Boolean deleteComment(String commentId);
    Comment getComment(String commentId) throws CommentDetailsNotFoundException;
    Comment editComment(String commentId, String content) throws CommentDetailsNotFoundException;
}
