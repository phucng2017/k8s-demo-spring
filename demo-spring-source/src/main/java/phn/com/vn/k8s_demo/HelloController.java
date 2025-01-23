package phn.com.vn.k8s_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);


    @GetMapping("/helloword")
    public String hello() {
        System.out.println("Hello from Spring Boot on Kubernetes!");
        logger.info("Đây là log INFO");
        logger.warn("Đây là log WARNING");
        logger.error("Đây là log ERROR");

        return "Hello from Spring Boot on Kubernetes!";
    }
}
