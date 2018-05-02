package net.devh.examples.grpc.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/11/8
 */
@SpringBootApplication
public class GrpcClientApplication {

    public static void main(String[] args) {
    	ConfigurableApplicationContext applicationContext = SpringApplication.run(GrpcClientApplication.class, args);
    	GrpcClientService grpcClientService=applicationContext.getBean(GrpcClientService.class);
		String s = grpcClientService.sendMessage("testd1234567890");
        System.out.println(""+s);
    	
    }
}
