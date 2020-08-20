package com.example.mall.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * @Classname JwtTokenUtil
 * @Description TODO
 * @Date 2020/8/19 11:13
 * @Created by v_geeliu
 */
@Slf4j
@Component
public class JwtTokenUtil {

  private static final String CLAIM_KEY_USERNAME = "sub";
  private static final String CLAIM_KEY_CREATED = "created";
  @Value("${jwt.secret}")
  private String secret;
  @Value("${jwt.expiration}")
  private Long expiration;

  /**
   * 根据负载生成JWT的token
   */
  public String generateToken(UserDetails userDetails) {
    Map<String, Object> claims = new HashMap<>();
    claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
    claims.put(CLAIM_KEY_CREATED, new Date());
    return generateToken(claims);
  }

  /**
   * 根据用户信息的token
   */
  public String generateToken(Map<String, Object> claims) {
    return Jwts.builder()
        .setClaims(claims)
        .setExpiration(generateExpirationDate())
        .signWith(SignatureAlgorithm.HS512, secret)
        .compact();
  }

  /**
   * 从token中获取JWT中的负载
   */
  private Claims  getClaimsFromToken(String token) {
    Claims claims = null;
    try {
      claims=Jwts.parser()
          .setSigningKey(secret)
          .parseClaimsJws(token)
          .getBody();
    } catch (Exception e) {
      e.printStackTrace();
      log.error("JWT格式验证失败:{}",token);
    }
    return claims;
  }

  /**
   * 从token中获取登录用户名
   * */
  public String getUserNameFromToken(String token) {
    String userName;
    try {
      Claims claims = getClaimsFromToken(token);
      userName=claims.getSubject();
    } catch (Exception e) {
      e.printStackTrace();
      userName=null;
    }
    return userName;
  }

  /**
   * @param token 客户端传入的token
   * @param  userDetails 从数据中查询出来的用户的信息
   * */
  public boolean validateToken(String token, UserDetails userDetails) {
    String username = getUserNameFromToken(token);
    return username.equals(userDetails.getUsername())&&!isTokenExpired(token);
  }

  /**
   * 判断token是否已经失效
   * */
  private boolean isTokenExpired(String token){
    Date expiredDate = getExpiredDateFromToken(token);
    return expiredDate.before(new Date());
  }

  /**
   * 从token中获取过期时间
   * */
  private  Date getExpiredDateFromToken(String token){
    Claims claims = getClaimsFromToken(token);
    return claims.getExpiration();
  }


  /**
   * 生成token的过期时间
   */
  private Date generateExpirationDate() {
    return new Date(System.currentTimeMillis() + expiration * 1000);
  }

  /**
   * 判断token是否可以被刷新
   */
  public boolean canRefresh(String token) {
    return !isTokenExpired(token);
  }

  /**
   * 刷新token
   */
  public String refreshToken(String token) {
    Claims claims = getClaimsFromToken(token);
    claims.put(CLAIM_KEY_CREATED, new Date());
    return generateToken(claims);
  }

}
