package com.umutyenidil.springmcpdemo;

import com.umutyenidil.springmcpdemo.conference.SessionTools;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringMcpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMcpDemoApplication.class, args);
    }

    @Bean
    public List<ToolCallback> springIOSessionTools(SessionTools sessionTools) {
        return List.of(ToolCallbacks.from(sessionTools));
    }

}
