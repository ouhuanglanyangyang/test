package com.yll.online_project.controller.student;

import com.yll.online_project.entity.Collect;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "学生收藏题目管理")
@RestController
@RequestMapping("/api/student/collect")
public class CollectController {
//    @PostMapping("/addCollect")
//    @ApiOperation("添加收藏")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "practiceRecodeId", value = "练题记录的id"),
//            @ApiImplicitParam(name = "joinTime",value = "加入收藏的时间")})
//    public ResponseResult<List<Collect>> addCollect(@RequestParam("studentId")String studentId,
//                                                    @RequestParam("practiceRecodeId")Integer practiceRecodeId,
//                                                    @RequestParam("joinTime") LocalDateTime joinTime){
//        List<Collect> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @DeleteMapping("/deleteCollect")
//    @ApiOperation("删除收藏")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "practiceRecodeId", value = "练题记录的id"),
//            @ApiImplicitParam(name = "collectId", value = "收藏id")})
//    public ResponseResult<Integer> deleteCollect (
//            @RequestParam("studentId")String studentId,
//            @RequestParam("practiceRecodeId")Integer practiceRecodeId,
//            @RequestParam("collectId")String collectId){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PostMapping("/queryCollect")
//    @ApiOperation("查询收藏的题目")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "practiceRecodeId", value = "练题记录的id"),
//            @ApiImplicitParam(name = "collectId", value = "收藏id"),
//            @ApiImplicitParam(name = "joinTime",value = "加入收藏的时间")})
//    public ResponseResult<List<Collect>> addCollect(
//            @RequestParam("studentId")String studentId,
//            @RequestParam("practiceRecodeId")Integer practiceRecodeId,
//            @RequestParam("collectId")Integer collectId,
//            @RequestParam("joinTime")LocalDateTime joinTime){
//        List<Collect> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }

}
