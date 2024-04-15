package com.yll.online_project.controller.student;

import com.yll.online_project.entity.Note;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Api(tags = "学生笔记管理")
@RestController
@RequestMapping("/api/student/note")
public class NoteController {
//    @PostMapping("/addNote")
//    @ApiOperation("添加笔记")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "questionId", value = "题目id"),
//            @ApiImplicitParam(name = "content", value = "笔记内容"),
//            @ApiImplicitParam(name = "addTime",value = "添加笔记时间")})
//    public ResponseResult<Note> addNote(@RequestParam("studentId")String studentId,
//                                        @RequestParam("questionId")String questionId,
//                                        @RequestParam("content")String content,
//                                        @RequestParam("addTime") LocalDateTime addTime){
//        return ResponseResult.success(new Note());
//    }
//
//    @PutMapping("/updateNote")
//    @ApiOperation("修改笔记内容")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "questionId", value = "题目id"),
//            @ApiImplicitParam(name = "content", value = "笔记内容"),
//            @ApiImplicitParam(name = "updateTime",value = "更新笔记时间")})
//    public ResponseResult<Note> updateNote(@RequestParam("studentId")String studentId,
//                                           @RequestParam("questionId")String questionId,
//                                           @RequestParam("content")String content,
//                                           @RequestParam("updateTime")LocalDateTime updateTime){
//        return ResponseResult.success(new Note());
//    }
//
//    @GetMapping("/queryNote")
//    @ApiOperation("查询笔记")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "questionId", value = "题目id")})
//    public ResponseResult<Note> queryNote(@RequestParam("studentId")String studentId,
//                                          @RequestParam("questionId")String questionId){
//        return ResponseResult.success(new Note());
//    }
}
