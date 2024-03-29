package com.wxwyz.service.comment.impl;

import com.wxwyz.dto.CommentPageDTO;
import com.wxwyz.mapper.CommentMapper;
import com.wxwyz.model.Comment;
import com.wxwyz.service.comment.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Integer queryAJobCommNum(Integer jobId) {
        return commentMapper.queryOneJobCommNum(jobId);
    }

    @Override
    public CommentPageDTO queryAllCommentByPage(Integer page, Integer size, Integer jobId) {

        CommentPageDTO commentPageDTO = new CommentPageDTO();
        commentPageDTO.setPage(page);
        commentPageDTO.setSize(size);
        commentPageDTO.setTotalRecord(commentMapper.queryOneJobCommNum(jobId));

        List<Comment> comments = commentMapper.queryAllCommentByPage(commentPageDTO.getOfferSet(), size, jobId);

        commentPageDTO.setList(comments);
        return commentPageDTO;
    }

    @Override
    public Integer insertAComment(Comment comment) {
        return commentMapper.insertAComment(comment);
    }
}
