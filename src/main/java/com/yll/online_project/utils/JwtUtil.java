package com.yll.online_project.utils;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    private static final long JWT_EXPIRATION_MS = 1000 * 60 * 60 * 10; // 10小时
    private static final String JWT_SECRET = "accountIdJwt";

    // 生成JWT令牌
    public String generateToken(Long accountId, String phoneNum) {
        Claims claims = Jwts.claims().setSubject(String.valueOf(accountId));
        claims.put("phoneNum", phoneNum); // 添加手机号到JWT的payload中
        return Jwts.builder()
                //payload
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION_MS))
                //signature
                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
                .compact();
    }

    // 从JWT令牌中获取账户ID
    public Long getAccountIdFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
        return Long.valueOf(claims.getSubject());
    }

    // 从JWT令牌中获取手机号
    public String getPhoneNumFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
        return (String) claims.get("phoneNum");
    }

    // 验证JWT令牌是否有效
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token);
            return true;
        } catch (SignatureException e) {
            // 签名不匹配
            return false;
        } catch (MalformedJwtException e) {
            // JWT格式不正确
            return false;
        } catch (ExpiredJwtException e) {
            // JWT已过期
            return false;
        } catch (UnsupportedJwtException e) {
            // 不支持的JWT
            return false;
        } catch (IllegalArgumentException e) {
            // JWT字符串为空
            return false;
        }
    }
}
