package demo.aspect;

import demo.bean.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AfterAdvicesDemo {
    @After("execution(* demo.dao.AccountDAO.getAccounts(..))")
    public void afterGetAccounts(JoinPoint joinPoint) {
        System.out.println("@After advice for method getAccounts(Boolean)");
    }

    @AfterThrowing(
            pointcut = "execution(* demo.dao.AccountDAO.getAccounts(..))",
            throwing = "exception"
    )
    public void afterThrowingFromGetAccounts(JoinPoint joinPoint, Throwable exception) {
        String method = joinPoint.getSignature().toShortString();
        System.out.println("@AfterThrowing advice for method getAccounts(Boolean)");
        System.out.println("Exception '" + exception + "' thrown in Method : " + method);
    }

    @AfterReturning(
            pointcut = "execution(* demo.dao.AccountDAO.getAccounts(..))",
            returning = "result"
    )
    public void afterReturningFromGetAccounts(JoinPoint joinPoint, List<Account> result) {
        String method = joinPoint.getSignature().toShortString();
        System.out.println("@AfterReturning advice for method getAccounts()");
        System.out.println("Method : " + method);
        System.out.println("Results : " + result);

        //Post-processing of data before the method returns to caller
        setNamesToUppercase(result);
    }

    private void setNamesToUppercase(List<Account> result) {
        for (Account account : result) {
            String name = account.getName().toUpperCase();
            account.setName(name);
        }
    }
}
