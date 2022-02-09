package com.project.noteking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("com.project.noteking.web.*.controller")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

  @Bean
  public MultipartResolver multipartResolver() {
    CommonsMultipartResolver mr = new CommonsMultipartResolver();

    System.out.println("@@@@@@@@@@@@@@@@@@@@@@여기 들어오는지 화그인@@@@@@@@@@@@@@@@@@@@@@@@@");
    // 최대 업로드 가능한 바이트 크기 type: long
    mr.setMaxUploadSize(1000000000);
    // 디스크에 임시 파일을 생성하기 전에 메모리에 보관할수있는 최대 바이트크기 기본값은 10240바이트 type: int
    mr.setMaxInMemorySize(2000000000);
    mr.setMaxUploadSizePerFile(500000000);
    return mr;
  }
}
