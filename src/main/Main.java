package main;

import com.edusol.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {

//        String resource_file_path="resources/applicationContext.xml";
//        ApplicationContext context= new ClassPathXmlApplicationContext(resource_file_path);
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = (Student) context.getBean("student");
        std.display();
    }


//1.  spring-beans-xxx.jar
//2.  spring-core-xxx.jar
//3.  spring-context-xxx.jar
//4.  common-logging-xxx.jar
//5.  spring-expression-xxx.jar





}

