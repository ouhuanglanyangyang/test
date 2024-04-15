package com.yll.online_project.controller.student;

import com.yll.online_project.entity.ResponseResult;
import com.yll.online_project.entity.Wrong;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "学生错题集管理")
@RestController
@RequestMapping("/api/student/wrong")
public class WrongController {
//    @PostMapping("/addWrong")
//    @ApiOperation("添加到错题集")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "practiceRecodeId", value = "练题记录的id"),
//            @ApiImplicitParam(name = "joinTime",value = "加入错题集的时间")})
//    public ResponseResult<Wrong> addWrong(@RequestParam("studentId")String studentId,
//                                          @RequestParam("practiceRecodeId")Integer practiceRecodeId,
//                                          @RequestParam("joinTime") LocalDateTime joinTime){
//        return ResponseResult.success(new Wrong());
//    }
//
//    @DeleteMapping("/deleteWrong")
//    @ApiOperation("删除错题")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "wrongId", value = "错题id"),
//            @ApiImplicitParam(name = "joinTime",value = "加入错题集的时间")})
//    public ResponseResult<Integer> deleteWrong(@RequestParam("studentId")String studentId,
//                                               @RequestParam("wrongId")Integer wrongId,
//                                               @RequestParam("joinTime")LocalDateTime joinTime){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PostMapping("/queryWrong")
//    @ApiOperation("查询错题")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "practiceRecodeId", value = "练题记录的id"),
//            @ApiImplicitParam(name = "wrongId", value = "错题id"),
//            @ApiImplicitParam(name = "joinTime",value = "加入错题集的时间")})
//    public ResponseResult<List<Wrong>> queryWrong(
//            @RequestParam("studentId")String studentId,
//            @RequestParam("practiceRecodeId")Integer practiceRecodeId,
//            @RequestParam("wrongId")Integer wrongId,
//            @RequestParam("joinTime")LocalDateTime joinTime){
//        List<Wrong> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
}
