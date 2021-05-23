package spring5_web_mvc_study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "spring5_web_mvc_study.spring", "spring5_web_mvc_study.survey" })
public class ControllerConfig {

}