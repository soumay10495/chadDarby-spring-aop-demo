package demo;

import demo.bean.Account;
import demo.config.DemoConfig;
import demo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApplication2 {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        try {
            List<Account> accountList = accountDAO.getAccounts(true);
            System.out.println("Account List : " + accountList);
        } catch (Exception exception) {
            System.out.println("Main Application Exception : " + exception);
        }
    }
}
