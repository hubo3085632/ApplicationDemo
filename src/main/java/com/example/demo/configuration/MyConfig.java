package com.example.demo.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("app")
public class MyConfig {

  public String openAIModel;

  public String openAIUser;

  public String openAIToken;

  public String wechatToken;

}