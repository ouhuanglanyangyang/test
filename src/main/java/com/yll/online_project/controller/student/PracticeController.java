package com.yll.online_project.controller.student;

import com.yll.online_project.entity.PracticeRecord;
import com.yll.online_project.entity.Question;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "学生练题管理")
@Controller
@RequestMapping("/api/student/practice")
public class PracticeController {
    //查询题目----根据题库id和题型id
//    @GetMapping("/queryQuesByType")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "depositoryId", value = "题库id"),
//            @ApiImplicitParam(name = "typeId", value = "题型id")})
//    public ResponseResult<List<Question>> queryQuesByType(@RequestParam("studentId")String studentId,
//                                         @RequestParam("depositoryId")Integer depositoryId,
//                                         @RequestParam("typeId")Integer typeId){
//        List<Question> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    //顺序练题----序号
//    @GetMapping("/queryQuesByOrder")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "serialNum", value = "顺序序号")})
//    public ResponseResult<List<Question>> queryQuesByOrder(@RequestParam("studentId")String studentId,
//                                                           @RequestParam("serialNum")Integer serialNum){
//        List<Question> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    //随机练题----序号
//    @GetMapping("/queryQuesByRandom")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "randomNum", value = "随机序号")})
//    public ResponseResult<List<Question>> queryQuesByRandom(@RequestParam("studentId")String studentId,
//                                             @RequestParam("randomNum")Integer randomNum){
//        List<Question> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    //保存学生答案
//    @PostMapping("/saveAnswer")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "answerId", value = "答案的id"),
//            @ApiImplicitParam(name = "studentAnswer", value = "学生答案")})
//    public ResponseResult<Integer> saveStuAnswer(@RequestParam("studentId")String studentId,
//                            @RequestParam("answerId")Integer answerId,
//                            @RequestParam("studentAnswer")String studentAnswer){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    //学生修改答案
//    @PutMapping("/updateAnswer")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "depositoryId", value = "答案id"),
//            @ApiImplicitParam(name = "studentAnswer", value = "题型id")})
//    public ResponseResult<Integer> updateStuAnswer(@RequestParam("studentId")String studentId,
//                               @RequestParam("answerId")Integer answerId,
//                               @RequestParam("studentAnswer")Integer studentAnswer){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PostMapping("/createPracticeRecord")
//    @ApiOperation("生成练题记录")
//    @ApiImplicitParams({@ApiImplicitParam(name = "practiceRecodeId", value = "练题记录id"),
//            @ApiImplicitParam(name = "studentId", value = "学生学号")})
//    public ResponseResult<List<PracticeRecord>> createPracticeRecord(@RequestParam("practiceRecodeId")Integer practiceRecodeId,
//                                                                    @RequestParam("studentId")String studentId){
//        List<PracticeRecord> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @PostMapping("/queryPracticeRecord")
//    @ApiOperation("查询练题记录")
//    @ApiImplicitParams({@ApiImplicitParam(name = "practiceRecodeId", value = "练题记录id"),
//            @ApiImplicitParam(name = "studentId", value = "学生学号")})
//    public ResponseResult<List<PracticeRecord>> queryPracticeRecord(@RequestParam("practiceRecodeId")Integer practiceRecodeId,
//                                                                    @RequestParam("studentId")String studentId){
//        List<PracticeRecord> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
}
