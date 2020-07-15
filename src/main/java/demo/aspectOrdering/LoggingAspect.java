package demo.aspectOrdering;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(43)
public class LoggingAspect {
    //@Before("demo.aspectOrdering.CommonPointcutExpressions.daoPackageWithoutGettersAndSetters()")
    public void addAccount() {
        System.out.println("@Before advice in LoggingAspect");
    }
}
