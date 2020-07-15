package demo;

import demo.config.DemoConfig;
import demo.dao.FortuneDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication3 {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        FortuneDAO fortuneDAO = context.getBean("fortuneDAO", FortuneDAO.class);

        System.out.println("Your fortune is : " + fortuneDAO.getFortune(true));
    }
}
