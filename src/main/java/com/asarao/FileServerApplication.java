package com.asarao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/*
 * @ClassName: FileServerApplication
 * @Description: TODO
 * @Author: Asarao
 * @Date: 2020/4/27 14:07
 * @Version: 1.0
 **/
@SpringBootApplication
@Configuration
public class FileServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileServerApplication.class);
    }
}
