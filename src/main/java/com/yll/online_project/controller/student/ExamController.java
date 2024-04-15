package com.yll.online_project.controller.student;

import com.yll.online_project.entity.*;
import com.yll.online_project.service.AccountService;
import com.yll.online_project.service.ExamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = "学生考试管理")
@Controller
@RestController
@RequestMapping("/api/student/exam")
public class ExamController {

    @Autowired
    private ExamService examService;

    @PostMapping("/showExamInfo")
    @ApiOperation("显示考试信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "考试id",required = true),
//    })
    public ResponseEntity<ResponseResult<Exam>> showExamInfo(
            @RequestParam("examid") Integer examId){

        Exam exam =new Exam();
        exam.setId(examId);
        Exam examinfo = examService.ExamInfo(exam);
        return ResponseResult.toResponseEntity(HttpStatus.CREATED, "考试基本信息", examinfo);
    }

//    @PostMapping("/showStuInfo")
//    @ApiOperation("显示考生信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "token", value = "考生学号",required = true)})
//    public ResponseResult<Account> showStuInfo(@RequestParam("studentId") String studentId){
//        return ResponseResult.success(new Account());
//    }
//
//    @PostMapping("/queryGrades")
//    @ApiOperation("考生查询考试成绩")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "studentId", value = "考生学号",required = true)
//    })
//    public ResponseResult<Double> queryGrades(
//            @RequestParam("studentId") String studentId){
//        Double result=0.0;
//        return ResponseResult.success(result);
//    }
//
//    @GetMapping("/queryExam")
//    @ApiOperation("查询接收到的考试")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true)})
//    public ResponseResult<List<Test>> queryTestForStu(@RequestParam("studentId") String studentId){
//        List<Test> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @PostMapping("/addExamAnswer")
//    @ApiOperation("考生添加答案")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true),
//                        @ApiImplicitParam(name = "serialNumber",value = "题目序号"),
//                        @ApiImplicitParam(name = "stuAnswer",value = "考生答案")})
//    public ResponseResult<Answer> addStuExamAnswer(@RequestParam("studentId")String studentId,
//                                @RequestParam("serialNumber")Integer serialNumber,
//                                @RequestParam("stuAnswer")String stuAnswer){
//        return ResponseResult.success(null);
//    }
//
//    @PutMapping("/updateExamAnswer")
//    @ApiOperation("考生修改答案")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true),
//                        @ApiImplicitParam(name = "serialNumber",value = "题目序号"),
//                        @ApiImplicitParam(name = "newAnswer",value = "考生修改的答案")})
//    public ResponseResult<Answer> updateExamAnswer(@RequestParam("studentId")String studentId,
//                                @RequestParam("serialNumber")Integer serialNumber,
//                                @RequestParam("stuAnswer")String newAnswer){
//        return ResponseResult.success(null);
//    }
//
//    @PostMapping("/createExamRecord")
//    @ApiOperation("生成考生考试记录")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true),
//            @ApiImplicitParam(name = "doTime",value = "考生作答时间"),
//            @ApiImplicitParam(name = "handTime",value = "考生交卷时间"),
//            @ApiImplicitParam(name = "donotNum",value = "未做题数"),
//            @ApiImplicitParam(name = "optionScore",value = "选择题得分"),
//            @ApiImplicitParam(name = "tfScore",value = "判断题得分"),
//            @ApiImplicitParam(name = "shortScore",value = "简答题得分"),
//            @ApiImplicitParam(name = "sScore",value = "学生总得分"),
//            @ApiImplicitParam(name = "grade",value = "学生成绩等级"),
//            @ApiImplicitParam(name = "isCertificate",value = "是否有证书 :0-无,1-有"),
//            @ApiImplicitParam(name = "createTime",value = "创建时间")})
//    public ResponseResult<ExamRecord> addExamRecord(@RequestParam("studentId")String studentId,
//                                                    @RequestParam("doTime") LocalDateTime doTime,
//                                                    @RequestParam("handTime")LocalDateTime handTime,
//                                                    @RequestParam("optionScore")Double optionScore,
//                                                    @RequestParam("tfScore")Double tfScore,
//                                                    @RequestParam("shortScore")Double shortScore,
//                                                    @RequestParam("sScore")Double sScore,
//                                                    @RequestParam("grade")Integer grade,
//                                                    @RequestParam("isCertificate")Integer isCertificate,
//                                                    @RequestParam("createTime")LocalDateTime createTime){
//        return ResponseResult.success(new ExamRecord());
//    }
//
//    //能力评估----根据考试成绩
//    @GetMapping("/evaluation")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "examId", value = "考试记录id"),
//            @ApiImplicitParam(name = "studentId", value = "学生学号"),
//            @ApiImplicitParam(name = "optionScore", value = "选择题得分"),
//            @ApiImplicitParam(name = "tfScore", value = "判断题得分"),
//            @ApiImplicitParam(name = "shortScore", value = "简答题得分"),
//            @ApiImplicitParam(name = "sScore", value = "学生总得分"),
//            @ApiImplicitParam(name = "grade", value = "学生成绩等级")})
//    public ResponseResult<String> selectEva(@RequestParam("examId")String examId,
//                                            @RequestParam("studentId")String studentId,
//                                            @RequestParam("optionScore")String optionScore,
//                                            @RequestParam("tfScore")String tfScore,
//                                            @RequestParam("shortScore")String shortScore,
//                                            @RequestParam("sScore")String studentScore,
//                                            @RequestParam("grade")String grade){
//        return ResponseResult.success(null);
//    }

}
