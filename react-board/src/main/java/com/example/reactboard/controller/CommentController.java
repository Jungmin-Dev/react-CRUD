package com.example.reactboard.controller;

import com.example.reactboard.domain.Result;
import com.example.reactboard.domain.board.Comment;
import com.example.reactboard.mappers.CommentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comment")
public class CommentController {

    private final CommentMapper commentMapper;

    @PostMapping
    public Result insertComment(@RequestBody Comment comment){
        int result = commentMapper.insertComment(comment);
        if(result>0)
            return new Result(0, "success");
        else
            return new Result(100, "fail");
    }

    @GetMapping
    public Comment findOneComment(Integer id){
        return commentMapper.findOneComment(id);
    }

    @GetMapping("/all")
    public List<Comment> findComment(Integer board_id){
        return commentMapper.findComment(board_id);
    }

    @PutMapping()
    public Result updateComment(Comment comment){
        int result = commentMapper.updateComment(comment);
        if(result>0)
            return new Result(0, "success");
        else
            return new Result(100, "fail");
    }

    @DeleteMapping()
    public Result deleteComment(Integer id){
        int result = commentMapper.deleteComment(id);
        if(result>0)
            return new Result(0, "success");
        else
            return new Result(100, "fail");
    }

}
