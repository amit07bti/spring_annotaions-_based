package resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.edusol")
//@ComponentScan({"com.edusol"})
@ComponentScan(basePackages = {"com.edusol"})

public class SpringConfigFile {
}
