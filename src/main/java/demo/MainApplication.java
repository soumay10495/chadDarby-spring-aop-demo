package demo;

import demo.bean.Account;
import demo.config.DemoConfig;
import demo.dao.AccountDAO;
import demo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        accountDAO.setName("Roy");
        accountDAO.setField("Agent");
        accountDAO.addAccount(new Account("Jeff", "12"), true);
        //accountDAO.removeAccount();
        accountDAO.getName();
        accountDAO.getField();

        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        //membershipDAO.addAccount();
        //membershipDAO.addAnotherAccount();
        membershipDAO.updateAccount();

        context.close();
    }
}
