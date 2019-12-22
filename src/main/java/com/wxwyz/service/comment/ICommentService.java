package com.wxwyz.service.comment;

import com.wxwyz.dto.CommentPageDTO;
import com.wxwyz.model.Comment;

public interface ICommentService {

    Integer queryAJobCommNum(Integer jobId);

    CommentPageDTO queryAllCommentByPage(Integer page, Integer size,Integer jobId);

    Integer insertAComment(Comment comment);
}
