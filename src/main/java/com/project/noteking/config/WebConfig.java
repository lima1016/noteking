package com.project.noteking.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("com.project.noteking.web.*.controller")
public class WebConfig implements WebMvcConfigurer {

}
