package com.yll.online_project.controller.admin;

import com.yll.online_project.entity.Notice;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "公告管理")
@RestController
@RequestMapping("/api/admin/notice")
public class NoticeController {
//    @PostMapping("/add")
//    @ApiOperation("添加公告信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "nTitle",value = "公告标题"),
//            @ApiImplicitParam(name = "nContent",value = "公告内容")
//    })
//    public ResponseResult<Notice> addNotice(@RequestParam("nTitle") String nTitle,@RequestParam("nContent") String nContent,
//                                            @RequestParam("publishTime") LocalDateTime publishTime){
//        return ResponseResult.success(new Notice());
//    }
//
//    @PutMapping("/update")
//    @ApiOperation("修改公告信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "noticeId",value = "公告id"),
//            @ApiImplicitParam(name = "nTitle",value = "公告标题"),
//            @ApiImplicitParam(name = "nContent",value = "公告内容")
//    })
//    public ResponseResult updateNotice(@RequestParam("noticeId") Integer noticeId,@RequestParam("nTitle") String nTitle,
//                                       @RequestParam("nContent") String nContent,@RequestParam("publishTime") LocalDateTime publishTime){
//        return ResponseResult.success(null);
//    }
//
//    @DeleteMapping("/delete")
//    @ApiOperation("删除公告信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "noticeId",value = "公告id"),
//            @ApiImplicitParam(name = "adminToken",value = "管理员token值")
//    })
//    public ResponseResult deleteNotice(@RequestParam("noticeId") Integer noticeId,
//                                       @RequestParam("adminToken") String adminToken){
//        return ResponseResult.success(null);
//    }
//
//    @GetMapping("query")
//    @ApiOperation("查询公告信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "noticeId",value = "公告id")})
//    public ResponseResult<List<Notice>> selectNotice(@RequestParam("noticeId") Integer noticeId){
//        List<Notice> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
}
