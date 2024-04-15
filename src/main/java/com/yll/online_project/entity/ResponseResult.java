package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/* 响应实体类 */
@Data
@ApiModel  //添加swagger注解，进行返回值说明
@NoArgsConstructor
public class ResponseResult<T> {
    private HttpStatus status;
    private String message;
    private T data;

    public ResponseResult(HttpStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // 为了方便将ResponseResult转换为ResponseEntity，可以添加一个静态方法
    public static <T> ResponseEntity<ResponseResult<T>> toResponseEntity(HttpStatus status, String message, T data) {
        ResponseResult<T> responseResult = new ResponseResult<>(status, message, data);
        return new ResponseEntity<>(responseResult, status);
    }
}

