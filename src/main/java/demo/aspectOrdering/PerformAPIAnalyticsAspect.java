package demo.aspectOrdering;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class PerformAPIAnalyticsAspect {
    //@Before("demo.aspectOrdering.CommonPointcutExpressions.daoPackageWithoutGettersAndSetters()")
    public void addAccount() {
        System.out.println("@Before advice in PerformAPIAnalyticsAspect");
    }
}
