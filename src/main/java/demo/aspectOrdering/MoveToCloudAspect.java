package demo.aspectOrdering;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-20)
public class MoveToCloudAspect {
    //@Before("demo.aspectOrdering.CommonPointcutExpressions.daoPackageWithoutGettersAndSetters()")
    public void addAccount() {
        System.out.println("@Before advice in MoveToCloudAspect");
    }
}
