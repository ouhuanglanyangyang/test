package com.yll.online_project.controller.teacher;

import com.yll.online_project.entity.ExamRecord;
import com.yll.online_project.entity.ResponseResult;
import com.yll.online_project.entity.Test;
import com.yll.online_project.entity.TestRecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "老师发布考试管理")
@Controller
@RequestMapping("/api/teacher/releaseExam")
public class ReleaseExamController {
//    @PostMapping("/showBaseInfo")
//    @ApiOperation("考试基本信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "examId",value = "考试id")})
//    public ResponseResult  showBaseInfo(
//            @RequestParam("examId") String examId){
//        return ResponseResult.success(null);
//    }
//
//    @PostMapping("/scoreProporSituation")
//    @ApiOperation("考试得分情况")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "examId",value = "考试id"),
//            @ApiImplicitParam(name = "userId",value = "用户id")})
//    public ResponseResult scoreProporSituation(
//            @RequestParam("examId") String examId,
//            @RequestParam("userId") String userId){
//        return ResponseResult.success(null);
//    }
//
//    //老师批改简答题
//    @PostMapping("/correctShort")
//    @ApiOperation("批改简答题")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "examId",value = "考试id"),
//            @ApiImplicitParam(name = "userId",value = "用户id"),
//            @ApiImplicitParam(name = "serialNumber",value = "题序"),
//            @ApiImplicitParam(name = "score",value = "得分")})
//    public ResponseResult correctShort(
//            @RequestParam("examId") String examId,
//            @RequestParam("userId") String userId,
//            @RequestParam("serialNumber") Integer serialNumber,
//            @RequestParam("score") String score){
//        return ResponseResult.success(null);
//    }
//
//    @PostMapping("/uploadTest")
//    @ApiOperation("上传试题")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "testId",value = "试题id"),
//            @ApiImplicitParam(name = "questionId",value = "题目id"),
//            @ApiImplicitParam(name = "serialNumber",value = "题序"),
//            @ApiImplicitParam(name = "testName",value = "试题名称"),
//            @ApiImplicitParam(name = "totalNum",value = "题目总数"),
//            @ApiImplicitParam(name = "allScore",value = "试题总分"),
//            @ApiImplicitParam(name = "createTime",value = "创建时间"),
//            @ApiImplicitParam(name = "updateTime",value = "更新时间")
//    })
//    public ResponseResult addTest(@RequestParam("testId") String testId, @RequestParam("questionId") String questionId,
//                                  @RequestParam("serialNumber") Integer serialNumber, @RequestParam("testName") String testName,
//                                  @RequestParam("totalNum") Integer totalNum, @RequestParam("allScore") Integer allScore,
//                                  @RequestParam("createTime") LocalDateTime createTime, @RequestParam("updateTime") LocalDateTime updateTime){
//
//        return ResponseResult.success(null);
//    }
//
//    @PostMapping("/queryExamRecord")
//    @ApiOperation("查询考生考试记录")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "accountId", value = "学生学号",required = true)})
//    public ResponseResult<List<ExamRecord>> queryExamRecord(@RequestParam("studentId")String studentId){
//        List<ExamRecord> list = new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @GetMapping("/queryExam")
//    @ApiOperation("发布考试")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "testId",value = "试题id",required = true),
//            @ApiImplicitParam(name = "testName",value = "试题名称",required = true),
//    })
//    public ResponseResult<List<Test>> queryExam(@RequestParam(value = "testId") String testId,@RequestParam(value = "testName") String testName){
//        List<Test> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @GetMapping("/queryTestRecord")
//    @ApiOperation("查询上传试题记录")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "teacherId",value = "教师编号",required = true),
//            @ApiImplicitParam(name ="testName",value = "试题名称"),
//            @ApiImplicitParam(name = "createTime",value = "上传时间"),
//            @ApiImplicitParam(name = "testId",value = "试题id")
//    })
//    public ResponseResult<List<TestRecord>> queryTestRecord(@RequestParam("teacherId") String teacherId, @RequestParam("testName") String testName,
//                                                            @RequestParam("createTime") LocalDateTime createTime, @RequestParam("testId") Integer testId){
//        List<TestRecord> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @PostMapping("/queryTestPaperAll")
//    @ApiOperation("查询试卷总体布局")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "testName",value = "试题名称"),
//            @ApiImplicitParam(name = "testId",value = "试题id")
//    })
//    public ResponseResult queryTestPaperAll(@RequestParam("testName") String testName,@RequestParam("testId") String testId){
//        return ResponseResult.success(null);
//    }
//
//    @PostMapping("/queryPreviousTest")
//    @ApiOperation("查询往期记录")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "eTitle",value = "考试标题")
//    })
//    public ResponseResult<List<ExamRecord>> queryPreviousTest(@RequestParam(value = "eTitle",required = false) String eTitle){
//        List<ExamRecord> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @PostMapping("/queryPreviousTestDetail")
//    @ApiOperation("查询单个考试记录详情")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "eTitle",value = "考试标题"),
//            @ApiImplicitParam(name = "examId",value = "考试id")
//    })
//    public ResponseResult<List<ExamRecord>> queryPreviousTestDetails(@RequestParam(value = "eTitle",required = false) String eTitle,@RequestParam("examId") String examId){
//        List<ExamRecord> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
}
