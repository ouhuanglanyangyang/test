package com.yll.online_project.controller.teacher;

import com.yll.online_project.entity.Question;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "老师上传考试题目")
@RestController
@RequestMapping("/api/teacher/uploadQuestion")
public class UploadQuestionController {
//    @PostMapping("/tempSaveQues")
//    @ApiOperation("暂时保存题目")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "typeId",value = "题型id"),
//            @ApiImplicitParam(name = "teacherId",value = "教师编号"),
//            @ApiImplicitParam(name = "serialNumber",value = "题序"),
//            @ApiImplicitParam(name = "questionContent",value = "题干内容"),
//            @ApiImplicitParam(name = "optA",value = "选项A"),
//            @ApiImplicitParam(name = "optB",value = "选项B"),
//            @ApiImplicitParam(name = "optC",value = "选项C"),
//            @ApiImplicitParam(name = "optD",value = "选线D"),
//            @ApiImplicitParam(name = "optImg",value = "选项图片"),
//            @ApiImplicitParam(name = "questionImg",value = "题目图片"),
//            @ApiImplicitParam(name = "questionScore",value = "题目分值"),
//            @ApiImplicitParam(name = "correctAnswer",value = "正确答案"),
//            @ApiImplicitParam(name = "analysis",value = "解析")})
//    public ResponseResult question(@RequestParam("typeId") Integer typeId,
//                                   @RequestParam("teacherId") String teacherId, @RequestParam("serialNumber") Integer serialNumber,
//                                   @RequestParam("questionContent") String questionContent, @RequestParam("optA") String optA,
//                                   @RequestParam("optB") String optB, @RequestParam("optC") String optC, @RequestParam("optD") String optD,
//                                   @RequestParam(value = "optImg",required = false) String optImg,
//                                   @RequestParam(value = "questionImg",required = false) String questionImg,
//                                   @RequestParam("questionScore") Integer questionScore, @RequestParam("correctAnswer") String correctAnswer) {
//        return ResponseResult.success(null);
//    }
//
//    @DeleteMapping("/deleteTempSaveQues")
//      @ApiOperation("删除暂时保存的题目")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "questionId",value = "题目id"),
//            @ApiImplicitParam(name = "answerId",value = "答案id")})
//    public ResponseResult deleteTempSaveQues(@RequestParam("questionId") Integer questionId,@RequestParam("answerId") Integer answerId){
//        return ResponseResult.success(null);
//    }
//
//    @PutMapping("/updateTempSaveQues")
    //@ApiOperation("修改暂时保存的题目")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "questionContent",value = "题干内容"),
//            @ApiImplicitParam(name = "correctAnswer",value = "正确答案"),
//            @ApiImplicitParam(name = "analysis",value = "解析"),
//            @ApiImplicitParam(name = "optA",value = "选项A"),
//            @ApiImplicitParam(name = "optB",value = "选项B"),
//            @ApiImplicitParam(name = "optC",value = "选项C"),
//            @ApiImplicitParam(name = "optD",value = "选线D"),
//            @ApiImplicitParam(name = "optImg",value = "选项图片"),
//            @ApiImplicitParam(name = "questionImg",value = "题目图片"),
//            @ApiImplicitParam(name = "typeId",value = "题型id"),
//            @ApiImplicitParam(name = "depositoryName",value = "题库名称"),
//            @ApiImplicitParam(name = "questionScore",value = "题目分值")})
//    public ResponseResult updateTempSaveQues(@RequestParam("questionContent") String questionContent, @RequestParam("correctAnswer") String correctAnswer,
//                                             @RequestParam("analysis") String analysis,@RequestParam("optA") String optA,
//                                             @RequestParam("optB") String optB,@RequestParam("optC") String optC,
//                                             @RequestParam("optD") String optD, @RequestParam(value = "optImg",required = false) String optImg,
//                                             @RequestParam(value = "questionImg",required = false) String questionImg,
//                                             @RequestParam("typeId") Integer typeId, @RequestParam("depositoryName") String depositoryName,
//                                             @RequestParam("questionScore") Integer questionScore){
//        return  ResponseResult.success(null);
//    }
//
//
//    @PostMapping("/uploadQuestion")
//    @ApiOperation("上传题目")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "questionId",value = "题目id"),
//            @ApiImplicitParam(name = "typeId",value = "题型id"),
//            @ApiImplicitParam(name = "teacherId",value = "教师编号"),
//            @ApiImplicitParam(name = "serialNumber",value = "题序"),
//            @ApiImplicitParam(name = "questionContent",value = "题干内容"),
//            @ApiImplicitParam(name = "optA",value = "选项A"),
//            @ApiImplicitParam(name = "optB",value = "选项B"),
//            @ApiImplicitParam(name = "optC",value = "选项C"),
//            @ApiImplicitParam(name = "optD",value = "选线D"),
//            @ApiImplicitParam(name = "optImg",value = "选项图片"),
//            @ApiImplicitParam(name = "questionImg",value = "题目图片"),
//            @ApiImplicitParam(name = "questionScore",value = "题目分值"),
//            @ApiImplicitParam(name = "correctAnswer",value = "正确答案"),
//            @ApiImplicitParam(name = "analysis",value = "解析"),
//            @ApiImplicitParam(name = "depositoryName",value = "题库名称")})
//    public ResponseResult question(@RequestParam("questionId") String questionId, @RequestParam("typeId") Integer typeId,
//                                   @RequestParam("teacherId") String teacherId, @RequestParam("serialNumber") Integer serialNumber,
//                                   @RequestParam("questionContent") String questionContent, @RequestParam("optA") String optA,
//                                   @RequestParam("optB") String optB, @RequestParam("optC") String optC, @RequestParam("optD") String optD,
//                                   @RequestParam(value = "optImg",required = false) String optImg,
//                                   @RequestParam(value = "questionImg",required = false) String questionImg,
//                                   @RequestParam("questionScore") Integer questionScore, @RequestParam("correctAnswer") String correctAnswer,
//                                   @RequestParam("analysis") String analysis, @RequestParam("depositoryName") String depositoryName){
//        return ResponseResult.success(null);
//    }
//
//
//    @GetMapping("/deleteUploadQues")
//    @ApiOperation("删除上传的题目")
//    @ApiImplicitParams({@ApiImplicitParam(name = "questionId",value = "题目id")})
//    public ResponseResult<Integer> deleteUploadQues(@RequestParam("questionId") Integer questionId, @RequestParam("typeId") Integer typeId,
//                                                         @RequestParam("questionScore") Integer questionScore, @RequestParam("questionContent") String questionContent,
//                                                         @RequestParam("teacherId") String teacherId){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    //查询上传的题目
//    @GetMapping("/queryUploadQues")
//    @ApiOperation("查询上传的题目")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "questionId",value = "题目id"),
//            @ApiImplicitParam(name = "typeId",value = "题型id"),
//            @ApiImplicitParam(name = "questionScore",value = "题目分值"),
//            @ApiImplicitParam(name = "questionContent",value = "题干内容"),
//            @ApiImplicitParam(name = "teacherId",value = "教师编号")})
//    public ResponseResult<List<Question>> selectQuestion(@RequestParam("questionId") Integer questionId, @RequestParam("typeId") Integer typeId,
//                                                         @RequestParam("questionScore") Integer questionScore, @RequestParam("questionContent") String questionContent,
//                                                         @RequestParam("teacherId") String teacherId){
//        List<Question> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
}
