package cn.aptech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(value = "cn.aptech.mapper")
@ServletComponentScan
public class EXLApplication {
    public static void main(String[] args) {
        SpringApplication.run(EXLApplication.class);
    }
}
