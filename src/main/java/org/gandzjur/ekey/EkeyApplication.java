package org.gandzjur.ekey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class EkeyApplication {
    public static void main(String[] args) {
        SpringApplication.run(EkeyApplication.class, args);
    }
}
