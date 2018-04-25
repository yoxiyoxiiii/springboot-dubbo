package cn.kr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource(locations={"classpath:doubbo-provider.xml"})
public class ProviderApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderApp.class,args);
    }
}
