package org.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.study.service")
//@ImportResource("classpath:spring-context.xml")
public class AppConfig {
}
