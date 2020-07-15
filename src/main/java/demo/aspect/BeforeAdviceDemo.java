package demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdviceDemo {

    //@Before("execution(public void addAccount())")        //matches any addAccount method in any class
    //@Before("execution(public void demo.dao.AccountDAO.addAccount())")
    //@Before("execution(public void add*())")
    //@Before("execution(* add*())")
    //@Before("execution(* add*(demo.bean.Account))")
    //@Before("execution(* add*(demo.bean.Account,..))")
    //@Before("execution(* add*(..)))")
    //@Before("execution(* demo.dao.*.*(..))")
    public void beforeAddAccountMethod() {
        System.out.println("@Before advice on method");
    }
}
