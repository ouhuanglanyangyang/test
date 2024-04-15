package com.yll.online_project.controller.student;

import com.yll.online_project.entity.Certificate;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "学生证书管理")
@RestController
@RequestMapping("/api/student/cerificate")
public class CertificateController {
//    @PostMapping("/generate")
//    @ApiOperation("生成证书")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号"),
//                        @ApiImplicitParam(name = "email", value = "邮箱号")})
//    public ResponseResult<Certificate> generateCertificate() {
//
//
//        return ResponseResult.success(new Certificate());
//    }
//
//    @GetMapping("/queryAll")
//    @ApiOperation("查询所有证书")
//    public ResponseResult<List<Certificate>> getAllCertificates() {
//        List<Certificate> list = new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @GetMapping("/querySingle")
//    @ApiOperation("查询单个证书")
//    public ResponseResult<Certificate> getCertificateById(@PathVariable Long id) {
//        return ResponseResult.success(new Certificate());
//    }
}
